package org.irisa.diverse.videogen.transformations;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.irisa.diverse.playlist.PlayList.PlayList;
import org.irisa.diverse.playlist.PlayList.Video;

/**
 * Define some PlayList transformation's specifications
 * 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * FIXME: create classes per transformation types. Example M3U (with extended specification), PLS, ASX, WPL, etc
 * TODO: delegate to Lizzy library the managment of playlists tranformations (http://lizzy.sourceforge.net/)
 */
@SuppressWarnings("all")
public class PlayListTransform {
  /**
   * Internal helper to write a content into a file
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static void writeToFile(final Path filename, final String content) {
    try {
      File _file = filename.toFile();
      final FileWriter writer = new FileWriter(_file);
      writer.write(content);
      writer.flush();
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Return a textual representation of a PLS format
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @see https://en.wikipedia.org/wiki/PLS_%28file_format%29
   * @see http://schworak.com/blog/e41/extended-pls-plsv2/
   */
  public static String toPLS(final PlayList playlist) {
    String _xblockexpression = null;
    {
      final StringBuffer content = new StringBuffer();
      content.append("[playlist]\n");
      int indice = 1;
      EList<Video> _video = playlist.getVideo();
      for (final Video video : _video) {
        {
          String _path = video.getPath();
          String _plus = ((("File" + Integer.valueOf(indice)) + "=") + _path);
          String _plus_1 = (_plus + "\n");
          content.append(_plus_1);
          String _description = video.getDescription();
          String _plus_2 = ((("Title" + Integer.valueOf(indice)) + "=") + _description);
          String _plus_3 = (_plus_2 + "\n");
          content.append(_plus_3);
          int _duration = video.getDuration();
          String _plus_4 = ((("Length" + Integer.valueOf(indice)) + "=") + Integer.valueOf(_duration));
          String _plus_5 = (_plus_4 + "\n");
          content.append(_plus_5);
          indice++;
        }
      }
      content.append((("NumberOfEntries=" + Integer.valueOf(indice)) + "\n"));
      content.append("Version=2\n");
      _xblockexpression = content.toString();
    }
    return _xblockexpression;
  }
  
  /**
   * Return a textual representation of a simple M3U model to text conversion
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @see https://en.wikipedia.org/wiki/M3U
   * @see http://schworak.com/blog/e39/m3u-play-list-specification/
   * @see http://tools.ietf.org/html/draft-pantos-http-live-streaming
   * 
   * TODO: normalize option usability for each M3U methods
   */
  public static String toM3U(final PlayList playlist) {
    HashMap<String, String> _hashMap = new HashMap<String, String>();
    return PlayListTransform.toM3U(playlist, Boolean.valueOf(false), Boolean.valueOf(false), _hashMap);
  }
  
  /**
   * Return a textual representation of a M3U model to text conversion with extended facility
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @see https://en.wikipedia.org/wiki/M3U
   * @see http://schworak.com/blog/e39/m3u-play-list-specification/
   * @see http://tools.ietf.org/html/draft-pantos-http-live-streaming
   * 
   * TODO: normalize option usability for each M3U methods
   */
  public static String toM3U(final PlayList playlist, final Boolean extended) {
    HashMap<String, String> _hashMap = new HashMap<String, String>();
    return PlayListTransform.toM3U(playlist, extended, Boolean.valueOf(false), _hashMap);
  }
  
  /**
   * Return a textual representation of a M3U model to text convertion with extended and discontinuited facility
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @see https://en.wikipedia.org/wiki/M3U
   * @see http://schworak.com/blog/e39/m3u-play-list-specification/
   * @see http://tools.ietf.org/html/draft-pantos-http-live-streaming
   * 
   * TODO: normalize option usability for each M3U methods
   */
  public static String toM3U(final PlayList playlist, final Boolean extended, final Boolean discontinued) {
    HashMap<String, String> _hashMap = new HashMap<String, String>();
    return PlayListTransform.toM3U(playlist, extended, Boolean.valueOf(false), _hashMap);
  }
  
  /**
   * Return a textual representation of a M3U model to text convertion with extended, discontinuited and stream facility
   * 
   * Example :
   * 		result => http://schworak.com/blog/e41/extended-pls-plsv2/
   * 		options => {
   * 						"CODECS": "avc1.66.30,mp4a.40.2",
   * 						"RESOLUTION": "640x360",
   * 						"BANDWITH": "684383",
   * 						...
   * 					}
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @see https://en.wikipedia.org/wiki/M3U
   * @see http://schworak.com/blog/e39/m3u-play-list-specification/
   * @see http://tools.ietf.org/html/draft-pantos-http-live-streaming
   * 
   * TODO: normalize option usability for each M3U methods
   */
  public static String toM3U(final PlayList playlist, final Boolean extended, final Boolean discontinued, final Map<String, String> options) {
    String _xblockexpression = null;
    {
      final StringBuffer content = new StringBuffer();
      if ((extended).booleanValue()) {
        content.append(("#EXTM3U" + "\n"));
        content.append(("#EXT-X-VERSION:3" + "\n"));
        content.append(("#EXT-X-MEDIA-SEQUENCE:44850" + "\n"));
      }
      boolean _isEmpty = options.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final ArrayList<Object> list = Lists.<Object>newArrayList();
        final BiConsumer<String, String> _function = (String key, String value) -> {
          list.add(((key + "=") + value));
        };
        options.forEach(_function);
        String _join = IterableExtensions.join(list, ",");
        String _plus = ("#EXT-X-STREAM-INF:" + _join);
        String _plus_1 = (_plus + "\n");
        content.append(_plus_1);
      }
      EList<Video> _video = playlist.getVideo();
      final Consumer<Video> _function_1 = (Video video) -> {
        if ((extended).booleanValue()) {
          if ((discontinued).booleanValue()) {
            content.append(("#EXT-X-DISCONTINUITY" + "\n"));
          }
          int _duration = video.getDuration();
          String _plus_2 = ("#EXTINF:" + Integer.valueOf(_duration));
          String _plus_3 = (_plus_2 + ",");
          String _description = video.getDescription();
          String _plus_4 = (_plus_3 + _description);
          String _plus_5 = (_plus_4 + "\n");
          content.append(_plus_5);
        }
        String _path = video.getPath();
        String _plus_6 = (_path + "\n");
        content.append(_plus_6);
      };
      _video.forEach(_function_1);
      if ((extended).booleanValue()) {
        content.append(("#EXT-X-ENDLIST" + "\n"));
      }
      _xblockexpression = content.toString();
    }
    return _xblockexpression;
  }
  
  /**
   * FFMEPG model to text convertion
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @Deprecated
   */
  public static String toFFMPEG(final PlayList playlist) {
    String _xblockexpression = null;
    {
      final StringBuffer content = new StringBuffer();
      EList<Video> _video = playlist.getVideo();
      final Consumer<Video> _function = (Video video) -> {
        String _path = video.getPath();
        String _plus = (_path + "\n");
        content.append(_plus);
      };
      _video.forEach(_function);
      _xblockexpression = content.toString();
    }
    return _xblockexpression;
  }
}
