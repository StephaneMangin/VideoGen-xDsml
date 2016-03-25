package org.irisa.diverse.videogen.utilities;

import com.google.common.collect.Lists;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.junit.Test;

@SuppressWarnings("all")
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
  
  private final Object oracle_mimeType /* Skipped initializer because of errors */;
  
  @Test
  public void createThumbnailsTest() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field SystemHelper is undefined for the type VideosTest"
      + "\nThe method or field Videos is undefined for the type VideosTest"
      + "\nmkDirs cannot be resolved"
      + "\ncreateThumbnails cannot be resolved");
  }
  
  @Test
  public void convertTest() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field VideoCodec is undefined for the type VideosTest"
      + "\nThe method or field SystemHelper is undefined for the type VideosTest"
      + "\nThe method or field Videos is undefined for the type VideosTest"
      + "\nFLV cannot be resolved"
      + "\nextention cannot be resolved"
      + "\nmkDirs cannot be resolved"
      + "\nconvert cannot be resolved");
  }
  
  @Test
  public void getMimeTypeTest() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Videos is undefined for the type VideosTest"
      + "\ngetMimeType cannot be resolved");
  }
  
  @Test
  public void getDurationTest() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Videos is undefined for the type VideosTest"
      + "\ngetDuration cannot be resolved");
  }
}
