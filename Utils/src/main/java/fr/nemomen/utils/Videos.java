package fr.nemomen.utils;

import fr.nemomen.utils.Executor;
import fr.nemomen.utils.VideoCodec;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtend.core.compiler.XtendGenerator", date = "2016-01-14T19:24+0100")
public class Videos extends Executor {
  /**
   * Create a thumbnail from the given video to the given path
   * 
   * TODO: should return a file object to be processed by the caller
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static void createThumbnails(final Path fullPath, final Path thumbFileName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("avconv -i \"");
    _builder.append(fullPath, "");
    _builder.append("\" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 \"");
    _builder.append(thumbFileName, "");
    _builder.append("\"");
    final String cmd = _builder.toString();
    Executor.ExecResult result = Executor.execCmd(cmd, 1);
    List<String> _lines = result.getLines();
    for (final String line : _lines) {
      Executor.LOGGER.finest(line);
    }
  }
  
  /**
   * Convert this video conform to the given mimeType
   * 
   * TODO: add a mimeType instead of a string format parameter
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static void convert(final Path fullPath, final Path newFullPathName, final VideoCodec codec) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("avconv -i \"");
    _builder.append(fullPath, "");
    _builder.append("\" -strict -2 -vcodec h264 -acodec aac -f ");
    String _format = codec.format();
    _builder.append(_format, "");
    _builder.append(" \"");
    _builder.append(newFullPathName, "");
    _builder.append("\"");
    String cmd = _builder.toString();
    Executor.ExecResult result = Executor.execCmd(cmd, 0);
    Executor.processResult(result);
  }
  
  /**
   * Return the mimeType object for the given video
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static VideoCodec getMimeType(final Path fullPath) {
    VideoCodec _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("avconv -i \"");
      _builder.append(fullPath, "");
      _builder.append("\"");
      String cmd = _builder.toString();
      Executor.ExecResult result = Executor.execCmd(cmd, 0);
      Executor.processResult(result);
      List<String> _lines = result.getLines();
      final Function1<String, Boolean> _function = (String it) -> {
        return Boolean.valueOf(it.contains((("\'" + fullPath) + "\'")));
      };
      final Iterable<String> durationPattern = IterableExtensions.<String>filter(_lines, _function);
      int _size = IterableExtensions.size(durationPattern);
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _get = ((String[])Conversions.unwrapArray(durationPattern, String.class))[0];
        String[] _split = _get.split(" ");
        String _get_1 = _split[2];
        String[] tmpResult = _get_1.split(",");
        for (final String mt : tmpResult) {
          VideoCodec[] _values = VideoCodec.values();
          final Function1<VideoCodec, String> _function_1 = (VideoCodec mte) -> {
            return mte.format();
          };
          List<String> _map = ListExtensions.<VideoCodec, String>map(((List<VideoCodec>)Conversions.doWrapArray(_values)), _function_1);
          boolean _contains = _map.contains(mt);
          if (_contains) {
            return VideoCodec.getByFormat(mt);
          }
        }
      }
      _xblockexpression = VideoCodec.NONE;
    }
    return _xblockexpression;
  }
  
  /**
   * Return the duration (in seconds) for the given video
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static int getDuration(final Path fullPath) {
    int _xblockexpression = (int) 0;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("avconv -i \"");
      _builder.append(fullPath, "");
      _builder.append("\" 2>&1");
      String cmd = _builder.toString();
      Executor.ExecResult result = Executor.execCmd(cmd, 1);
      Executor.processResult(result);
      List<String> _lines = result.getLines();
      final Function1<String, Boolean> _function = (String it) -> {
        return Boolean.valueOf(it.contains("Duration"));
      };
      final Iterable<String> durationPattern = IterableExtensions.<String>filter(_lines, _function);
      int duration = 0;
      int _size = IterableExtensions.size(durationPattern);
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _get = ((String[])Conversions.unwrapArray(durationPattern, String.class))[0];
        String[] _split = _get.split(" ");
        String _get_1 = _split[3];
        String tmpResult = _get_1.replace(",", "");
        final LocalTime repr = LocalTime.parse(tmpResult);
        int _minute = repr.getMinute();
        int _multiply = (_minute * 60);
        int _second = repr.getSecond();
        int _plus = (_multiply + _second);
        duration = _plus;
      }
      _xblockexpression = duration;
    }
    return _xblockexpression;
  }
}
