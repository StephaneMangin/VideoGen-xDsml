package org.irisa.diverse.videogen.transformations;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.logging.Logger;
import javax.json.JsonObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.irisa.diverse.playlist.PlayList.PlayList;
import org.irisa.diverse.playlist.PlayList.PlayListFactory;
import org.irisa.diverse.playlist.PlayList.Video;
import org.irisa.diverse.playlist.PlayList.impl.PlayListFactoryImpl;
import org.irisa.diverse.videogen.transformations.PlayListTransform;
import org.irisa.diverse.videogen.transformations.VideoCodec;
import org.irisa.diverse.videogen.transformations.VideoGenSerializer;
import org.irisa.diverse.videogen.transformations.helpers.SystemHelper;
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper;
import org.irisa.diverse.videogen.transformations.helpers.VideosHelper;
import org.irisa.diverse.videogen.transformations.utils.DistributedRandomNumberGenerator;
import org.irisa.diverse.videogen.videoGen.Alternatives;
import org.irisa.diverse.videogen.videoGen.Conclusion;
import org.irisa.diverse.videogen.videoGen.Introduction;
import org.irisa.diverse.videogen.videoGen.Mandatory;
import org.irisa.diverse.videogen.videoGen.Mimetypes_Enum;
import org.irisa.diverse.videogen.videoGen.Optional;
import org.irisa.diverse.videogen.videoGen.Sequence;
import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videoGen.VideoGenFactory;
import org.irisa.diverse.videogen.videoGen.impl.VideoGenFactoryImpl;

/**
 * Define some VideoGen transformation's specifications
 * 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 * FIXME: Is it a good idea to have only one class to manage tranformations ? Should it be better to split inside the xtext/ecore framework ?
 */
@SuppressWarnings("all")
public class VideoGenTransform {
  /**
   * Local logger
   * 
   * @author <stephane.mangin@freesbee.fr>
   */
  private static Logger LOGGER = Logger.getLogger("videoGen.transformations");
  
  /**
   * Add a temporay system path
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * 
   * TODO: could it be better to instanciate the class and allow the setting of a temporary path (local or remote) ?
   */
  private static Path tmp = Paths.get((System.getProperty("java.io.tmpdir") + "/VideoGenGenerated"));
  
  /**
   * Transfers (some) metadatas from a VideoGen Sequence instance to a PlayList Video instance (description, length, mime type and url)
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  private static void transferData(final Video p_video, final org.irisa.diverse.videogen.videoGen.Video videoseq) {
    VideoGenTransform.LOGGER.info(((("Data transformation " + videoseq) + "=>") + p_video));
    Integer _duration = videoseq.getDuration();
    p_video.setDuration((_duration).intValue());
    String _url = videoseq.getUrl();
    p_video.setPath(_url);
    p_video.setDescription("");
    String _description = videoseq.getDescription();
    boolean _notEquals = (!Objects.equal(_description, null));
    if (_notEquals) {
      String _description_1 = videoseq.getDescription();
      p_video.setDescription(_description_1);
    }
    Mimetypes_Enum _mimetype = videoseq.getMimetype();
    String _name = _mimetype.getName();
    p_video.setMimetype(_name);
  }
  
  /**
   * Apply the given Optional instance's percentage to allow or not its selectability
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  private static boolean isSelected(final Optional video) {
    boolean _xblockexpression = false;
    {
      DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
      float proba = 0;
      proba = 50;
      Integer _probability = video.getProbability();
      boolean _notEquals = ((_probability).intValue() != 0);
      if (_notEquals) {
        Integer _probability_1 = video.getProbability();
        proba = (_probability_1).intValue();
      }
      drng.addNumber(1, proba);
      drng.addNumber(0, (100 - proba));
      int _distributedRandomNumber = drng.getDistributedRandomNumber();
      _xblockexpression = (_distributedRandomNumber > 0);
    }
    return _xblockexpression;
  }
  
  /**
   * Selects a sequence inside the given Alternatices instance accordingly to options' percentages.
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  private static org.irisa.diverse.videogen.videoGen.Video selectSequence(final Alternatives alternatives) {
    org.irisa.diverse.videogen.videoGen.Video _xblockexpression = null;
    {
      final DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
      final Map<String, Integer> proba = VideoGenHelper.checkProbabilities(alternatives);
      EList<Optional> _options = alternatives.getOptions();
      final Function1<Optional, String> _function = (Optional it) -> {
        org.irisa.diverse.videogen.videoGen.Video _video = it.getVideo();
        return _video.getName();
      };
      List<String> _map = ListExtensions.<Optional, String>map(_options, _function);
      final Consumer<String> _function_1 = (String name) -> {
        Set<String> _keySet = proba.keySet();
        List<String> _list = IterableExtensions.<String>toList(_keySet);
        int _indexOf = _list.indexOf(name);
        Integer _get = proba.get(name);
        drng.addNumber(_indexOf, (_get).intValue());
      };
      _map.forEach(_function_1);
      EList<Optional> _options_1 = alternatives.getOptions();
      int _distributedRandomNumber = drng.getDistributedRandomNumber();
      Optional _get = _options_1.get(_distributedRandomNumber);
      _xblockexpression = _get.getVideo();
    }
    return _xblockexpression;
  }
  
  /**
   * Tranform a VideoGen instance to a PlayList instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static VideoGen toVideoGen(final PlayList playList) {
    VideoGen _xblockexpression = null;
    {
      VideoGenTransform.LOGGER.info(("Videogen transformation " + playList));
      VideoGenFactory videoGenFactory = VideoGenFactoryImpl.init();
      final VideoGen videoGen = videoGenFactory.createVideoGen();
      _xblockexpression = videoGen;
    }
    return _xblockexpression;
  }
  
  /**
   * Return the file extention of the given file pathname
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * 
   * FIXME: use of Optional should welcomed ! Or add a helper method to detect format with file headers
   */
  private static String getFileExtension(final String fileName) {
    String _xblockexpression = null;
    {
      String extention = "";
      boolean _and = false;
      int _lastIndexOf = fileName.lastIndexOf(".");
      boolean _notEquals = (_lastIndexOf != (-1));
      if (!_notEquals) {
        _and = false;
      } else {
        int _lastIndexOf_1 = fileName.lastIndexOf(".");
        boolean _notEquals_1 = (_lastIndexOf_1 != 0);
        _and = _notEquals_1;
      }
      if (_and) {
        int _lastIndexOf_2 = fileName.lastIndexOf(".");
        int _plus = (_lastIndexOf_2 + 1);
        String _substring = fileName.substring(_plus);
        extention = _substring;
      }
      _xblockexpression = extention;
    }
    return _xblockexpression;
  }
  
  /**
   * create thumbnails for a Sequence instance
   * Use of VideoGenHelper helper class
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @see VideoGenHelper#mkDirs(Path)
   * @see VideoGenHelper#createThumbnails(Path, Path)
   */
  public static Path createThumbnails(final org.irisa.diverse.videogen.videoGen.Video video) {
    Path _xblockexpression = null;
    {
      VideoGenTransform.LOGGER.info(("Thumbnail generation " + video));
      String _plus = (VideoGenTransform.tmp + "/");
      String _plus_1 = (_plus + "thumbnails/");
      final Path dir = Paths.get(_plus_1);
      SystemHelper.mkDirs(dir);
      String _url = video.getUrl();
      final Path fullPath = Paths.get(_url);
      Path _fileName = fullPath.getFileName();
      String _string = _fileName.toString();
      final String extention = VideoGenTransform.getFileExtension(_string);
      String _plus_2 = (dir + "/");
      Path _fileName_1 = fullPath.getFileName();
      String _string_1 = _fileName_1.toString();
      String _replaceAll = _string_1.replaceAll(("." + extention), ".png");
      String _plus_3 = (_plus_2 + _replaceAll);
      final Path thumbFileName = Paths.get(_plus_3);
      VideosHelper.createThumbnails(fullPath, thumbFileName);
      _xblockexpression = thumbFileName;
    }
    return _xblockexpression;
  }
  
  /**
   * Convert VideoGen Sequence url videos to the given mime type.
   * Use of VideoGenHelper helper class
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @see VideoGenHelper#mkDirs(Path)
   * @see VideoGenHelper#convert(Path, Path, String)
   * 
   * TODO: somethings should be done better... But what ?
   */
  public static ArrayList<Path> ConvertTo(final Mimetypes_Enum type, final VideoGen videogen) {
    ArrayList<Path> _xblockexpression = null;
    {
      VideoGenTransform.LOGGER.info(((("Convertion " + videogen) + "=>") + type));
      String _name = type.getName();
      final VideoCodec codec = VideoCodec.getByFormat(_name);
      final ArrayList<Path> pathes = Lists.<Path>newArrayList();
      String _plus = (VideoGenTransform.tmp + "/");
      String _plus_1 = (_plus + "converted");
      String _plus_2 = (_plus_1 + "/");
      String _name_1 = type.getName();
      String _plus_3 = (_plus_2 + _name_1);
      String _plus_4 = (_plus_3 + "/");
      final Path dir = Paths.get(_plus_4);
      SystemHelper.mkDirs(dir);
      List<org.irisa.diverse.videogen.videoGen.Video> _allSelectedVideos = VideoGenHelper.allSelectedVideos(videogen);
      final Consumer<org.irisa.diverse.videogen.videoGen.Video> _function = (org.irisa.diverse.videogen.videoGen.Video video) -> {
        String _url = video.getUrl();
        final Path fullPath = Paths.get(_url);
        Path _fileName = fullPath.getFileName();
        String _string = _fileName.toString();
        final String extention = VideoGenTransform.getFileExtension(_string);
        String _plus_5 = (dir + "/");
        Path _fileName_1 = fullPath.getFileName();
        String _string_1 = _fileName_1.toString();
        String _extention = codec.extention();
        String _plus_6 = ("." + _extention);
        String _replaceAll = _string_1.replaceAll(("." + extention), _plus_6);
        String _plus_7 = (_plus_5 + _replaceAll);
        final Path newFullPathName = Paths.get(_plus_7);
        pathes.add(newFullPathName);
        VideosHelper.convert(fullPath, newFullPathName, codec);
        Path _absolutePath = newFullPathName.toAbsolutePath();
        String _string_2 = _absolutePath.toString();
        video.setUrl(_string_2);
        video.setMimetype(type);
      };
      _allSelectedVideos.forEach(_function);
      _xblockexpression = pathes;
    }
    return _xblockexpression;
  }
  
  /**
   * Add some probably missing or misformatted metadatas into the VideoGen instance
   * For instance, videos duration and mime types.
   * Use of VideoGenHelper helper class
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @see VideoGenHelper#getDuration(Path)
   * @see VideoGenHelper#getMimeType(Path)
   * 
   * FIXME: should create a new VideoGen instance to not modify the given one.
   */
  public static VideoGen addMetadata(final VideoGen videogen) {
    VideoGen _xblockexpression = null;
    {
      List<org.irisa.diverse.videogen.videoGen.Video> _allVideos = VideoGenHelper.allVideos(videogen);
      final Consumer<org.irisa.diverse.videogen.videoGen.Video> _function = (org.irisa.diverse.videogen.videoGen.Video video) -> {
        String _url = video.getUrl();
        final Path url = Paths.get(_url);
        int _duration = VideosHelper.getDuration(url);
        video.setDuration(Integer.valueOf(_duration));
        VideoCodec _mimeType = VideosHelper.getMimeType(url);
        String _name = _mimeType.name();
        Mimetypes_Enum _byName = Mimetypes_Enum.getByName(_name);
        video.setMimetype(_byName);
      };
      _allVideos.forEach(_function);
      _xblockexpression = videogen;
    }
    return _xblockexpression;
  }
  
  /**
   * Tranformation from VideoGen instance to Playlist instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static PlayList toPlayList(final VideoGen videogen, final Boolean withThumbnail) {
    PlayList _xblockexpression = null;
    {
      VideoGenTransform.LOGGER.info(((("To playlist " + videogen) + "=>") + withThumbnail));
      final PlayListFactory playlistFactory = PlayListFactoryImpl.init();
      final PlayList playlist = playlistFactory.createPlayList();
      List<Sequence> _allActiveSequences = VideoGenHelper.allActiveSequences(videogen);
      final Consumer<Sequence> _function = (Sequence sequence) -> {
        org.irisa.diverse.videogen.videoGen.Video video = null;
        if ((sequence instanceof Mandatory)) {
          org.irisa.diverse.videogen.videoGen.Video _video = ((Mandatory)sequence).getVideo();
          video = _video;
        } else {
          if ((sequence instanceof Optional)) {
            boolean _isSelected = VideoGenTransform.isSelected(((Optional)sequence));
            if (_isSelected) {
              org.irisa.diverse.videogen.videoGen.Video _video_1 = ((Optional)sequence).getVideo();
              video = _video_1;
            }
          } else {
            if ((sequence instanceof Alternatives)) {
              org.irisa.diverse.videogen.videoGen.Video _selectSequence = VideoGenTransform.selectSequence(((Alternatives)sequence));
              video = _selectSequence;
            } else {
              if ((sequence instanceof Introduction)) {
                org.irisa.diverse.videogen.videoGen.Video _video_2 = ((Introduction)sequence).getVideo();
                video = _video_2;
              } else {
                if ((sequence instanceof Conclusion)) {
                  org.irisa.diverse.videogen.videoGen.Video _video_3 = ((Conclusion)sequence).getVideo();
                  video = _video_3;
                }
              }
            }
          }
        }
        boolean _notEquals = (!Objects.equal(video, null));
        if (_notEquals) {
          final Video p_video = playlistFactory.createVideo();
          VideoGenTransform.transferData(p_video, video);
          if ((withThumbnail).booleanValue()) {
            Path _createThumbnails = VideoGenTransform.createThumbnails(video);
            Path _absolutePath = _createThumbnails.toAbsolutePath();
            String _string = _absolutePath.toString();
            p_video.setThumbnail(_string);
          }
          EList<Video> _video_4 = playlist.getVideo();
          _video_4.add(p_video);
        }
      };
      _allActiveSequences.forEach(_function);
      _xblockexpression = playlist;
    }
    return _xblockexpression;
  }
  
  /**
   * Tranformation from VideoGen instance to custom Playlist instance
   * 
   * Information on options:
   * 	Map<String, Boolean> options = {
   * 		"sequence_name1": false, // A Optional to remove (included by default)
   * 		"sequence_name2": true // A alternatives option to force (if multiple choice exists, selectability is undeterministic)
   * 	}
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @Param videogen VideoGen
   * @Param withThumbnail Boolean - Include thumbnails
   * @Param options Map<String, Boolean> - A Map of sequences name associated to a boolean
   */
  public static PlayList toCustomPlayList(final VideoGen videogen, final Boolean withThumbnail, final Map<String, Boolean> options) {
    PlayList _xblockexpression = null;
    {
      VideoGenTransform.LOGGER.info(((((("To custom playlist " + videogen) + "=>") + withThumbnail) + ", options=>") + options));
      final PlayListFactory playlistFactory = PlayListFactoryImpl.init();
      final PlayList playlist = playlistFactory.createPlayList();
      List<Sequence> _allActiveSequences = VideoGenHelper.allActiveSequences(videogen);
      final Consumer<Sequence> _function = (Sequence sequence) -> {
        org.irisa.diverse.videogen.videoGen.Video video = null;
        if ((sequence instanceof Mandatory)) {
          org.irisa.diverse.videogen.videoGen.Video _video = ((Mandatory)sequence).getVideo();
          video = _video;
        } else {
          if ((sequence instanceof Optional)) {
            org.irisa.diverse.videogen.videoGen.Video _video_1 = ((Optional)sequence).getVideo();
            final String name = _video_1.getName();
            boolean _and = false;
            boolean _containsKey = options.containsKey(name);
            if (!_containsKey) {
              _and = false;
            } else {
              Boolean _get = options.get(name);
              _and = (_get).booleanValue();
            }
            if (_and) {
              org.irisa.diverse.videogen.videoGen.Video _video_2 = ((Optional)sequence).getVideo();
              video = _video_2;
            }
          } else {
            if ((sequence instanceof Alternatives)) {
              EList<Optional> _options = ((Alternatives)sequence).getOptions();
              for (final Optional option : _options) {
                {
                  org.irisa.diverse.videogen.videoGen.Video _video_3 = option.getVideo();
                  final String name_1 = _video_3.getName();
                  boolean _and_1 = false;
                  boolean _containsKey_1 = options.containsKey(name_1);
                  if (!_containsKey_1) {
                    _and_1 = false;
                  } else {
                    Boolean _get_1 = options.get(name_1);
                    _and_1 = (_get_1).booleanValue();
                  }
                  if (_and_1) {
                    org.irisa.diverse.videogen.videoGen.Video _video_4 = option.getVideo();
                    video = _video_4;
                  }
                }
              }
            }
          }
        }
        boolean _notEquals = (!Objects.equal(video, null));
        if (_notEquals) {
          final Video p_video = playlistFactory.createVideo();
          VideoGenTransform.transferData(p_video, video);
          if ((withThumbnail).booleanValue()) {
            Path _createThumbnails = VideoGenTransform.createThumbnails(video);
            Path _absolutePath = _createThumbnails.toAbsolutePath();
            String _string = _absolutePath.toString();
            p_video.setThumbnail(_string);
          }
          EList<Video> _video_3 = playlist.getVideo();
          _video_3.add(p_video);
        }
      };
      _allActiveSequences.forEach(_function);
      _xblockexpression = playlist;
    }
    return _xblockexpression;
  }
  
  /**
   * Convert a VideoGen into Json model
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @Param videogen VideoGen
   */
  public static JsonObject toJson(final VideoGen videogen) {
    JsonObject _xblockexpression = null;
    {
      VideoGenTransform.LOGGER.info(("To Json " + videogen));
      VideoGenSerializer _videoGenSerializer = new VideoGenSerializer();
      _xblockexpression = _videoGenSerializer.compile(videogen);
    }
    return _xblockexpression;
  }
  
  /**
   * Convert a VideoGen into a ExtM3U model
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @Param videogen VideoGen
   */
  public static String toM3U(final VideoGen videogen, final Boolean withThumbnails, final Map<String, Boolean> videos) {
    String _xblockexpression = null;
    {
      VideoGenTransform.LOGGER.info(("To M3U " + videogen));
      final PlayList playlist = VideoGenTransform.toCustomPlayList(videogen, withThumbnails, videos);
      _xblockexpression = PlayListTransform.toM3U(playlist, Boolean.valueOf(true), Boolean.valueOf(true));
    }
    return _xblockexpression;
  }
}
