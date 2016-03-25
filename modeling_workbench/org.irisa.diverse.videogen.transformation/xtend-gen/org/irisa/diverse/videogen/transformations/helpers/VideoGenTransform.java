package org.irisa.diverse.videogen.transformations.helpers;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.logging.Logger;
import javax.json.JsonObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.irisa.diverse.playlist.PlayList.PlayList;
import org.irisa.diverse.playlist.PlayList.PlayListFactory;
import org.irisa.diverse.playlist.PlayList.Video;
import org.irisa.diverse.playlist.PlayList.impl.PlayListFactoryImpl;
import org.irisa.diverse.videogen.transformations.SystemHelper;
import org.irisa.diverse.videogen.transformations.VideoCodec;
import org.irisa.diverse.videogen.transformations.Videos;
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper;
import org.irisa.diverse.videogen.transformations.helpers.VideoGenSerializer;
import org.irisa.diverse.videogen.transformations.randomizers.DistributedRandomNumberGenerator;
import videoGen.Alternatives;
import videoGen.Mandatory;
import videoGen.Mimetypes_Enum;
import videoGen.Optional;
import videoGen.Sequence;
import videoGen.VideoGen;
import videoGen.VideoGenFactory;
import videoGen.impl.VideoGenFactoryImpl;

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
  private static void transferData(final Video p_video, final videoGen.Video videoseq) {
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
  private static videoGen.Video selectSequence(final Alternatives alternatives) {
    videoGen.Video _xblockexpression = null;
    {
      final DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
      final Map<String, Integer> proba = VideoGenHelper.checkProbabilities(alternatives);
      EList<Optional> _options = alternatives.getOptions();
      final Function1<Optional, String> _function = new Function1<Optional, String>() {
        public String apply(final Optional it) {
          videoGen.Video _video = it.getVideo();
          return _video.getName();
        }
      };
      List<String> _map = ListExtensions.<Optional, String>map(_options, _function);
      final Consumer<String> _function_1 = new Consumer<String>() {
        public void accept(final String name) {
          Set<String> _keySet = proba.keySet();
          List<String> _list = IterableExtensions.<String>toList(_keySet);
          int _indexOf = _list.indexOf(name);
          Integer _get = proba.get(name);
          drng.addNumber(_indexOf, (_get).intValue());
        }
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
  public static Path createThumbnails(final videoGen.Video video) {
    Path _xblockexpression = null;
    {
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
      Videos.createThumbnails(fullPath, thumbFileName);
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
      Collection<videoGen.Video> _allVideos = VideoGenHelper.allVideos(videogen);
      final Consumer<videoGen.Video> _function = new Consumer<videoGen.Video>() {
        public void accept(final videoGen.Video video) {
          String _url = video.getUrl();
          final Path fullPath = Paths.get(_url);
          Path _fileName = fullPath.getFileName();
          String _string = _fileName.toString();
          final String extention = VideoGenTransform.getFileExtension(_string);
          String _plus = (dir + "/");
          Path _fileName_1 = fullPath.getFileName();
          String _string_1 = _fileName_1.toString();
          String _extention = codec.extention();
          String _plus_1 = ("." + _extention);
          String _replaceAll = _string_1.replaceAll(("." + extention), _plus_1);
          String _plus_2 = (_plus + _replaceAll);
          final Path newFullPathName = Paths.get(_plus_2);
          pathes.add(newFullPathName);
          Videos.convert(fullPath, newFullPathName, codec);
          Path _absolutePath = newFullPathName.toAbsolutePath();
          String _string_2 = _absolutePath.toString();
          video.setUrl(_string_2);
          video.setMimetype(type);
        }
      };
      _allVideos.forEach(_function);
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
      Collection<videoGen.Video> _allVideos = VideoGenHelper.allVideos(videogen);
      final Consumer<videoGen.Video> _function = new Consumer<videoGen.Video>() {
        public void accept(final videoGen.Video video) {
          String _url = video.getUrl();
          final Path url = Paths.get(_url);
          int _duration = Videos.getDuration(url);
          video.setDuration(Integer.valueOf(_duration));
          VideoCodec _mimeType = Videos.getMimeType(url);
          String _name = _mimeType.name();
          Mimetypes_Enum _byName = Mimetypes_Enum.getByName(_name);
          video.setMimetype(_byName);
        }
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
      final PlayListFactory playlistFactory = PlayListFactoryImpl.init();
      final PlayList playlist = playlistFactory.createPlayList();
      EList<Sequence> _sequences = videogen.getSequences();
      final Consumer<Sequence> _function = new Consumer<Sequence>() {
        public void accept(final Sequence sequence) {
          videoGen.Video video = null;
          if ((sequence instanceof Mandatory)) {
            videoGen.Video _video = ((Mandatory)sequence).getVideo();
            video = _video;
          } else {
            if ((sequence instanceof Optional)) {
              boolean _isSelected = VideoGenTransform.isSelected(((Optional)sequence));
              if (_isSelected) {
                videoGen.Video _video_1 = ((Optional)sequence).getVideo();
                video = _video_1;
              }
            } else {
              if ((sequence instanceof Alternatives)) {
                videoGen.Video _selectSequence = VideoGenTransform.selectSequence(((Alternatives)sequence));
                video = _selectSequence;
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
            EList<Video> _video_2 = playlist.getVideo();
            _video_2.add(p_video);
          }
        }
      };
      _sequences.forEach(_function);
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
   * 		"sequence_name2": true // A alternatives option to force (the first encountered one takes priority)
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
      final PlayListFactory playlistFactory = PlayListFactoryImpl.init();
      final PlayList playlist = playlistFactory.createPlayList();
      EList<Sequence> _sequences = videogen.getSequences();
      final Consumer<Sequence> _function = new Consumer<Sequence>() {
        public void accept(final Sequence sequence) {
          videoGen.Video video = null;
          if ((sequence instanceof Mandatory)) {
            videoGen.Video _video = ((Mandatory)sequence).getVideo();
            video = _video;
          } else {
            if ((sequence instanceof Optional)) {
              videoGen.Video _video_1 = ((Optional)sequence).getVideo();
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
                videoGen.Video _video_2 = ((Optional)sequence).getVideo();
                video = _video_2;
              }
            } else {
              if ((sequence instanceof Alternatives)) {
                EList<Optional> _options = ((Alternatives)sequence).getOptions();
                for (final Optional option : _options) {
                  {
                    videoGen.Video _video_3 = option.getVideo();
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
                      videoGen.Video _video_4 = option.getVideo();
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
        }
      };
      _sequences.forEach(_function);
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
    VideoGenSerializer _videoGenSerializer = new VideoGenSerializer();
    return _videoGenSerializer.compile(videogen);
  }
  
  /**
   * Transfert some data from a VideoGen Sequence instance to a PlayList Video instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * 
   * FIXME: should find a better way to create this kind of ModelToText transformation. For instance, through multiples methods to get each portions of the resulting document.
   */
  public static CharSequence toConfigurator(final VideoGen videogen) {
    CharSequence _xblockexpression = null;
    {
      final HashMap<String, Path> thumbnails = new HashMap<String, Path>();
      Collection<videoGen.Video> _allVideos = VideoGenHelper.allVideos(videogen);
      for (final videoGen.Video video : _allVideos) {
        String _name = video.getName();
        Path _createThumbnails = VideoGenTransform.createThumbnails(video);
        thumbnails.put(_name, _createThumbnails);
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<!-- Automatically generated by VideoGen -->");
      _builder.newLine();
      _builder.append("<!--style type=\"text/css\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#configurator {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("background-color:rgba(72,72,72,0.4);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("padding-left:35px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("padding-right:35px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("padding-top:35px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("padding-bottom:50px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("width: auto;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: auto;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("min-height: 100%;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("overflow:auto;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("position: relative;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("margin-top:-130px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-moz-border-radius: 7px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-webkit-border-radius: 7px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border-radius: 7px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("clear: both;");
      _builder.newLine();
      _builder.append("  \t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#configurator .sequence {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-size: medium;\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("margin-top: 10px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("margin-right: 10px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("padding:10px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("display: block;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("width : 120px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: 120px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("float: left;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("text-align: center;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border: 2px solid #000;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-webkit-border-radius: 5px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-moz-border-radius: 5px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border-radius: 5px;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#configurator .description {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-size: small;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-stretch: condensed;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-variant: small-caps;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("margin-bottom : 5px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: 70px;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#configurator .sequence img, select, option {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("width: 80px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: 80px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("margin: 5px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("max-width: 100%;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-webkit-border-radius: 50px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-moz-border-radius: 50px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border-radius: 50px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("background: transparent !important");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#button_valid{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("float:left;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("width: 100%;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: 50px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("color: #0493bd;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border: #fbfbfb solid 4px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("cursor:pointer;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("background-color: rgba(0,0,0,0);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-size:24px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-webkit-transition: all 0.3s;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-moz-transition: all 0.3s;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("transition: all 0.3s;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-weight:700;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border-radius: 5px;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#button_valid:hover{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("background-color: #3498db;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("color:white;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(".submit:hover {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("color: #3498db;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(".ease {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("width: 0px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: 74px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("background-color: #fbfbfb;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-webkit-transition: .3s ease;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-moz-transition: .3s ease;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-o-transition: .3s ease;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-ms-transition: .3s ease;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("transition: .3s ease;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append(".submit:hover .ease{");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.append("width:100%;");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.append("background-color:white;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("</style-->");
      _builder.newLine();
      _builder.append("<script type=\"application/javascript\">");
      _builder.newLine();
      _builder.append("function showTitle(name, description) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("document.getElementById(name).value = description;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("</script>");
      _builder.newLine();
      _builder.append("<form name=\"configurator\" id=\"configurator\" action=\"%actionUrl%\">");
      _builder.newLine();
      _builder.append("<input class=\"button\" type=\"submit\" value=\"Generate\" id=\"button_valid\"><br />");
      _builder.newLine();
      {
        EList<Sequence> _sequences = videogen.getSequences();
        for(final Sequence sequence : _sequences) {
          {
            if ((sequence instanceof Alternatives)) {
              _builder.append("<div id=\"");
              String _name_1 = ((Alternatives)sequence).getName();
              _builder.append(_name_1, "");
              _builder.append("\" class=\"sequence\">");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<span id=\"");
              String _name_2 = ((Alternatives)sequence).getName();
              _builder.append(_name_2, "\t");
              _builder.append("_title\" class=\"description\">");
              EList<Optional> _options = ((Alternatives)sequence).getOptions();
              Optional _get = _options.get(0);
              videoGen.Video _video = _get.getVideo();
              String _description = _video.getDescription();
              _builder.append(_description, "\t");
              _builder.append("</span><br />");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("<div class=\"alternatives\">");
              _builder.newLine();
              {
                EList<Optional> _options_1 = ((Alternatives)sequence).getOptions();
                for(final Optional option : _options_1) {
                  _builder.append("\t\t");
                  _builder.append("<input checked id=\"");
                  videoGen.Video _video_1 = option.getVideo();
                  String _name_3 = _video_1.getName();
                  _builder.append(_name_3, "\t\t");
                  _builder.append("\" onchange=\"showTitle(\'");
                  String _name_4 = ((Alternatives)sequence).getName();
                  _builder.append(_name_4, "\t\t");
                  _builder.append("_title\', \'");
                  videoGen.Video _video_2 = option.getVideo();
                  String _description_1 = _video_2.getDescription();
                  _builder.append(_description_1, "\t\t");
                  _builder.append("\')\" type=\"radio\" name=\"");
                  String _name_5 = ((Alternatives)sequence).getName();
                  _builder.append(_name_5, "\t\t");
                  _builder.append("\" value=\"");
                  videoGen.Video _video_3 = option.getVideo();
                  String _name_6 = _video_3.getName();
                  _builder.append(_name_6, "\t\t");
                  _builder.append("\" />");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t");
                  _builder.append("<label for=\"");
                  videoGen.Video _video_4 = option.getVideo();
                  String _name_7 = _video_4.getName();
                  _builder.append(_name_7, "\t\t");
                  _builder.append("\" style=\"background-image:url(\'");
                  videoGen.Video _video_5 = option.getVideo();
                  String _name_8 = _video_5.getName();
                  Path _get_1 = thumbnails.get(_name_8);
                  _builder.append(_get_1, "\t\t");
                  _builder.append("\');\"></label>");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t\t");
              _builder.append("</div>");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("</div>");
              _builder.newLine();
            }
          }
          {
            if ((sequence instanceof Mandatory)) {
              _builder.append("<div id=\"");
              videoGen.Video _video_6 = ((Mandatory)sequence).getVideo();
              String _name_9 = _video_6.getName();
              _builder.append(_name_9, "");
              _builder.append("\" class=\"sequence mandatory\">");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<label class=\"description\">");
              videoGen.Video _video_7 = ((Mandatory)sequence).getVideo();
              String _description_2 = _video_7.getDescription();
              _builder.append(_description_2, "\t");
              _builder.append("</label><br />");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<img src=\"");
              videoGen.Video _video_8 = ((Mandatory)sequence).getVideo();
              String _name_10 = _video_8.getName();
              Path _get_2 = thumbnails.get(_name_10);
              _builder.append(_get_2, "\t");
              _builder.append("\"/><br />");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<input hidden name=\"");
              videoGen.Video _video_9 = ((Mandatory)sequence).getVideo();
              String _name_11 = _video_9.getName();
              _builder.append(_name_11, "\t");
              _builder.append("\" value=\"");
              videoGen.Video _video_10 = ((Mandatory)sequence).getVideo();
              String _name_12 = _video_10.getName();
              _builder.append(_name_12, "\t");
              _builder.append("\">");
              _builder.newLineIfNotEmpty();
              _builder.append("</div>");
              _builder.newLine();
            }
          }
          {
            if ((sequence instanceof Optional)) {
              _builder.append("<div id=\"");
              videoGen.Video _video_11 = ((Optional)sequence).getVideo();
              String _name_13 = _video_11.getName();
              _builder.append(_name_13, "");
              _builder.append("\" class=\"sequence optional\">");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<label class=\"description\">");
              videoGen.Video _video_12 = ((Optional)sequence).getVideo();
              String _description_3 = _video_12.getDescription();
              _builder.append(_description_3, "\t");
              _builder.append("</label><br />");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<input name=\"");
              videoGen.Video _video_13 = ((Optional)sequence).getVideo();
              String _name_14 = _video_13.getName();
              _builder.append(_name_14, "\t");
              _builder.append("\" type=\"checkbox\" value=\"1\" checked/><br />");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<img src=\"");
              videoGen.Video _video_14 = ((Optional)sequence).getVideo();
              String _name_15 = _video_14.getName();
              Path _get_3 = thumbnails.get(_name_15);
              _builder.append(_get_3, "\t");
              _builder.append("\"/>");
              _builder.newLineIfNotEmpty();
              _builder.append("</div>");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("</form>");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
