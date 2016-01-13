package fr.nemomen.utils;

import com.google.common.base.Objects;
import fr.nemomen.utils.Executor;
import fr.nemomen.utils.VideoCodec;
import io.humble.video.Decoder;
import io.humble.video.Demuxer;
import io.humble.video.DemuxerFormat;
import io.humble.video.DemuxerStream;
import io.humble.video.Global;
import io.humble.video.MediaDescriptor;
import java.nio.file.Path;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtend.core.compiler.XtendGenerator", date = "2016-01-13T11:30+0100")
public class Videos extends Executor {
  private static Demuxer getDemuxer(final Path path) {
    try {
      Demuxer _xblockexpression = null;
      {
        final Demuxer demuxer = Demuxer.make();
        Path _absolutePath = path.toAbsolutePath();
        String _string = _absolutePath.toString();
        demuxer.open(_string, null, false, true, null, null);
        _xblockexpression = demuxer;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static Decoder getDecoder(final Path fullPath) {
    try {
      Decoder _xblockexpression = null;
      {
        final Demuxer demuxer = Videos.getDemuxer(fullPath);
        final int numStreams = demuxer.getNumStreams();
        int videoStreamId = (-1);
        long streamStartTime = Global.NO_PTS;
        Decoder videoDecoder = null;
        for (int i = 0; (i < numStreams); i++) {
          {
            final DemuxerStream stream = demuxer.getStream(i);
            long _startTime = stream.getStartTime();
            streamStartTime = _startTime;
            Decoder decoder = stream.getDecoder();
            boolean _and = false;
            boolean _notEquals = (!Objects.equal(decoder, null));
            if (!_notEquals) {
              _and = false;
            } else {
              MediaDescriptor.Type _codecType = decoder.getCodecType();
              boolean _equals = Objects.equal(_codecType, MediaDescriptor.Type.MEDIA_VIDEO);
              _and = _equals;
            }
            if (_and) {
              videoStreamId = i;
              videoDecoder = decoder;
            }
          }
        }
        if ((videoStreamId == (-1))) {
          throw new RuntimeException(("could not find video stream in container: " + fullPath));
        }
        _xblockexpression = videoDecoder;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
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
      final Demuxer demuxer = Videos.getDemuxer(fullPath);
      DemuxerFormat _format = demuxer.getFormat();
      String _string = _format.toString();
      String[] _split = _string.split(",");
      for (final String mt : _split) {
        VideoCodec[] _values = VideoCodec.values();
        final Function1<VideoCodec, String> _function = (VideoCodec mte) -> {
          return mte.format();
        };
        List<String> _map = ListExtensions.<VideoCodec, String>map(((List<VideoCodec>)Conversions.doWrapArray(_values)), _function);
        boolean _contains = _map.contains(mt);
        if (_contains) {
          return VideoCodec.getByFormat(mt);
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
      final Demuxer demuxer = Videos.getDemuxer(fullPath);
      long _duration = demuxer.getDuration();
      _xblockexpression = (((int) _duration) / 1000000);
    }
    return _xblockexpression;
  }
}
