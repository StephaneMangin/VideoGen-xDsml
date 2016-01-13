package fr.nemomen.utils;

import com.google.common.collect.Lists;
import fr.nemomen.utils.SystemHelper;
import fr.nemomen.utils.VideoCodec;
import fr.nemomen.utils.Videos;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtend.core.compiler.XtendGenerator", date = "2016-01-13T11:45+0100")
public class VideosTest {
  private final String root = new Function0<String>() {
    public String apply() {
      try {
        ClassLoader _classLoader = VideosTest.class.getClassLoader();
        URL _resource = _classLoader.getResource("videos");
        URI _uRI = _resource.toURI();
        File _file = new File(_uRI);
        String _absolutePath = _file.getAbsolutePath();
        String _plus = (_absolutePath + "/");
        return _plus;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private final List<String> oracle_file_list = Lists.<String>newArrayList(
    "Mass.mp4", 
    "TimsSuicide.mp4", 
    "EddyWally-Wow.mp4", 
    "haha.mp4");
  
  private final ArrayList<Integer> oracle_duration_list = Lists.<Integer>newArrayList(
    Integer.valueOf(30), 
    Integer.valueOf(30), 
    Integer.valueOf(7), 
    Integer.valueOf(2));
  
  private final VideoCodec oracle_mimeType = VideoCodec.MP4;
  
  @Test
  public void createThumbnailsTest() {
    for (final String fileName : this.oracle_file_list) {
      {
        String _replace = fileName.replace(".mp4", ".png");
        String _plus = ((this.root + "thumbnails/") + _replace);
        Path newFile = Paths.get(_plus);
        Path _parent = newFile.getParent();
        SystemHelper.mkDirs(_parent);
        Path _get = Paths.get((this.root + fileName));
        Videos.createThumbnails(_get, newFile);
        File _file = newFile.toFile();
        File _absoluteFile = _file.getAbsoluteFile();
        boolean _exists = _absoluteFile.exists();
        Assert.assertTrue(_exists);
        File _file_1 = newFile.toFile();
        File _absoluteFile_1 = _file_1.getAbsoluteFile();
        boolean _canRead = _absoluteFile_1.canRead();
        Assert.assertTrue(_canRead);
        File _file_2 = newFile.toFile();
        File _absoluteFile_2 = _file_2.getAbsoluteFile();
        long _length = _absoluteFile_2.length();
        Assert.assertNotEquals(0, _length);
      }
    }
  }
  
  @Test
  public void convertTest() {
    final VideoCodec codec = VideoCodec.FLV;
    for (final String fileName : this.oracle_file_list) {
      {
        String _extention = codec.extention();
        String _plus = ("." + _extention);
        String _replace = fileName.replace(".mp4", _plus);
        String _plus_1 = ((this.root + "converted/") + _replace);
        Path newFile = Paths.get(_plus_1);
        Path _parent = newFile.getParent();
        SystemHelper.mkDirs(_parent);
        Path _get = Paths.get((this.root + fileName));
        Videos.convert(_get, newFile, codec);
        File _file = newFile.toFile();
        File _absoluteFile = _file.getAbsoluteFile();
        boolean _exists = _absoluteFile.exists();
        Assert.assertTrue(_exists);
        File _file_1 = newFile.toFile();
        File _absoluteFile_1 = _file_1.getAbsoluteFile();
        boolean _canRead = _absoluteFile_1.canRead();
        Assert.assertTrue(_canRead);
        File _file_2 = newFile.toFile();
        File _absoluteFile_2 = _file_2.getAbsoluteFile();
        long _length = _absoluteFile_2.length();
        Assert.assertNotEquals(0, _length);
      }
    }
  }
  
  @Test
  public void getMimeTypeTest() {
    for (final String fileName : this.oracle_file_list) {
      Path _get = Paths.get((this.root + fileName));
      VideoCodec _mimeType = Videos.getMimeType(_get);
      Assert.assertEquals(this.oracle_mimeType, _mimeType);
    }
  }
  
  @Test
  public void getDurationTest() {
    int i = 0;
    for (final String fileName : this.oracle_file_list) {
      {
        Path _get = Paths.get((this.root + fileName));
        final int duration = Videos.getDuration(_get);
        int _indexOf = this.oracle_file_list.indexOf(fileName);
        Integer _get_1 = this.oracle_duration_list.get(_indexOf);
        Assert.assertEquals((_get_1).intValue(), duration);
        i++;
      }
    }
  }
}
