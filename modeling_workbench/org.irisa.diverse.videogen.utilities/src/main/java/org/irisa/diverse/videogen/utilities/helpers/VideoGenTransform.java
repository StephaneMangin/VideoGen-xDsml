package org.irisa.diverse.videogen.utilities.helpers;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Logger;
import javax.annotation.Generated;
import org.irisa.diverse.playlist.PlayList.PlayList;
import org.irisa.diverse.playlist.PlayList.Video;
import org.irisa.diverse.videogen.utilities.SystemHelper;
import org.irisa.diverse.videogen.utilities.VideoCodec;
import org.irisa.diverse.videogen.utilities.Videos;
import org.irisa.diverse.videogen.utilities.helpers.VideoGenHelper;
import org.irisa.diverse.videogen.utilities.helpers.VideoGenSerializer;
import org.irisa.diverse.videogen.utilities.randomizers.DistributedRandomNumberGenerator;
import videoGen.Alternatives;
import videoGen.Mimetypes_Enum;
import videoGen.Optional;
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
@Generated(value = "org.eclipse.xtend.core.compiler.XtendGenerator", date = "2016-03-25T09:21+0100")
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
  private static Object selectSequence(final Alternatives alternatives) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method options is undefined for the type VideoGenTransform"
      + "\nThe method or field sequence is undefined for the type VideoGenTransform"
      + "\nThe method options is undefined for the type VideoGenTransform"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nmap cannot be resolved"
      + "\nname cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nget cannot be resolved"
      + "\nsequence cannot be resolved");
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
      final Consumer<videoGen.Video> _function = (videoGen.Video video) -> {
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
        Videos.convert(fullPath, newFullPathName, codec);
        Path _absolutePath = newFullPathName.toAbsolutePath();
        String _string_2 = _absolutePath.toString();
        video.setUrl(_string_2);
        video.setMimetype(type);
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method allSequences is undefined for the type VideoGenTransform"
      + "\nThe method url is undefined for the type VideoGenTransform"
      + "\nThe method or field mimetype is undefined for the type VideoGenTransform"
      + "\nInvalid number of arguments. The method length(Object[]) is not applicable for the arguments (Object,int)"
      + "\nType mismatch: cannot convert from Object to Object[]"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nforEach cannot be resolved");
  }
  
  /**
   * Tranformation from VideoGen instance to Playlist instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static Object toPlayList(final VideoGen videogen, final Boolean withThumbnail) {
    throw new Error("Unresolved compilation problems:"
      + "\nMandatory cannot be resolved to a type."
      + "\nThe method or field PlayListFactoryImpl is undefined for the type VideoGenTransform"
      + "\nThe method statements is undefined for the type VideoGenTransform"
      + "\nThe method sequence is undefined for the type VideoGenTransform"
      + "\nType mismatch: cannot convert from Sequence to Video"
      + "\nType mismatch: cannot convert from Sequence to Video"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\ninit cannot be resolved"
      + "\ncreatePlayList cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\ncreateVideo cannot be resolved"
      + "\nthumbnail cannot be resolved"
      + "\nvideo cannot be resolved"
      + "\nadd cannot be resolved");
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
  public static Object toCustomPlayList(final VideoGen videogen, final Boolean withThumbnail, final Map<String, Boolean> options) {
    throw new Error("Unresolved compilation problems:"
      + "\nMandatory cannot be resolved to a type."
      + "\nThe method or field PlayListFactoryImpl is undefined for the type VideoGenTransform"
      + "\nThe method statements is undefined for the type VideoGenTransform"
      + "\nThe method sequence is undefined for the type VideoGenTransform"
      + "\nThe method sequence is undefined for the type VideoGenTransform"
      + "\nThe method options is undefined for the type VideoGenTransform"
      + "\nType mismatch: cannot convert from Sequence to Video"
      + "\nType mismatch: cannot convert from Sequence to Video"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\ninit cannot be resolved"
      + "\ncreatePlayList cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\ncreateVideo cannot be resolved"
      + "\nthumbnail cannot be resolved"
      + "\nvideo cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  /**
   * Convert a VideoGen into Json model
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @Param videogen VideoGen
   */
  public static Object toJson(final VideoGen videogen) {
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
    throw new Error("Unresolved compilation problems:"
      + "\nMandatory cannot be resolved to a type."
      + "\nThe method allSequences is undefined for the type VideoGenTransform"
      + "\nThe method statements is undefined for the type VideoGenTransform"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\noptions cannot be resolved"
      + "\nget cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\noptions cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsequence cannot be resolved"
      + "\nname cannot be resolved");
  }
}
