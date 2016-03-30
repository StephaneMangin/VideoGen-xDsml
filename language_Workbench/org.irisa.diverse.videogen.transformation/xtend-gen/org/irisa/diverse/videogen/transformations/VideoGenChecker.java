package org.irisa.diverse.videogen.transformations;

import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper;
import org.irisa.diverse.videogen.videoGen.Alternatives;
import org.irisa.diverse.videogen.videoGen.Mandatory;
import org.irisa.diverse.videogen.videoGen.Mimetypes_Enum;
import org.irisa.diverse.videogen.videoGen.Optional;
import org.irisa.diverse.videogen.videoGen.Sequence;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.VideoGen;

/**
 * Add missing arguments to a VIdeoGen instance
 * 
 * TODO: should be renamed ?
 */
@SuppressWarnings("all")
public class VideoGenChecker {
  private final StringBuilder result;
  
  private final StringBuilder tabs = new StringBuilder();
  
  private String tabulation = "\t";
  
  public VideoGenChecker() {
    StringBuilder _stringBuilder = new StringBuilder();
    this.result = _stringBuilder;
    this.tabs.append(this.tabulation);
  }
  
  public String setTabulation(final String tabulation) {
    return this.tabulation = tabulation;
  }
  
  /**
   * VideoGen check and all descendants
   * 
   * @param v VideoGen
   * @return StringBuilder
   */
  public StringBuilder compile(final VideoGen v) {
    StringBuilder _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("VideoGen {");
      String _plus = (_builder.toString() + "\n");
      this.result.append(_plus);
      EList<Sequence> _sequences = v.getSequences();
      for (final Sequence e : _sequences) {
        this.compile(e);
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("}");
      this.result.append(_builder_1);
      _xblockexpression = this.result;
    }
    return _xblockexpression;
  }
  
  /**
   * VideoGen check and all descendants
   * 
   * @param v VideoGen
   * @return StringBuilder
   */
  public StringBuilder compile(final Sequence s) {
    StringBuilder _xblockexpression = null;
    {
      if ((s instanceof Mandatory)) {
        this.compile(((Mandatory)s));
      } else {
        if ((s instanceof Optional)) {
          this.compile(((Optional)s));
        } else {
          if ((s instanceof Alternatives)) {
            this.compile(((Alternatives)s));
          }
        }
      }
      _xblockexpression = this.result;
    }
    return _xblockexpression;
  }
  
  /**
   * Mandatory check and all descendants
   * 
   * @param m Mandatory
   * @return StringBuilder
   */
  public StringBuilder compile(final Mandatory m) {
    StringBuilder _xblockexpression = null;
    {
      this.tabs.append(this.tabulation);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@Mandatory");
      String _plus = (this.tabs + _builder.toString());
      String _plus_1 = (_plus + "\n");
      this.result.append(_plus_1);
      Video _video = m.getVideo();
      this.compile(_video);
      this.tabs.delete(0, 1);
      _xblockexpression = this.result;
    }
    return _xblockexpression;
  }
  
  /**
   * Optional check and all descendants
   * 
   * @param o Optional
   * @return StringBuilder
   */
  public StringBuilder compile(final Optional o) {
    StringBuilder _xblockexpression = null;
    {
      int proba = 50;
      Integer _probability = o.getProbability();
      boolean _notEquals = ((_probability).intValue() != 0);
      if (_notEquals) {
        Integer _probability_1 = o.getProbability();
        proba = (_probability_1).intValue();
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@Optional");
      String _plus = (this.tabs + _builder.toString());
      String _plus_1 = (_plus + "\n");
      this.result.append(_plus_1);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("@Probability(");
      _builder_1.append(proba, "");
      _builder_1.append(")");
      String _plus_2 = (this.tabs + _builder_1.toString());
      String _plus_3 = (_plus_2 + "\n");
      this.result.append(_plus_3);
      this.tabs.append(this.tabulation);
      Video _video = o.getVideo();
      this.compile(_video);
      this.tabs.delete(0, 1);
      _xblockexpression = this.result;
    }
    return _xblockexpression;
  }
  
  /**
   * Alternatives check and all descendants
   * 
   * @param a Alternatives
   * @return StringBuilder
   */
  public StringBuilder compile(final Alternatives a) {
    StringBuilder _xblockexpression = null;
    {
      final Map<String, Integer> probas = VideoGenHelper.checkProbabilities(a);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Alternatives ");
      String _name = a.getName();
      _builder.append(_name, "");
      _builder.append(" {");
      String _plus = (this.tabs + _builder.toString());
      String _plus_1 = (_plus + "\n");
      this.result.append(_plus_1);
      this.tabs.append(this.tabulation);
      EList<Optional> _options = a.getOptions();
      final Consumer<Optional> _function = (Optional o) -> {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("@Probability(");
        Video _video = o.getVideo();
        String _name_1 = _video.getName();
        Integer _get = probas.get(_name_1);
        _builder_1.append(_get, "");
        _builder_1.append(")");
        String _plus_2 = (this.tabs + _builder_1.toString());
        String _plus_3 = (_plus_2 + "\n");
        this.result.append(_plus_3);
        Video _video_1 = o.getVideo();
        this.compile(_video_1);
      };
      _options.forEach(_function);
      this.tabs.delete(0, 1);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("}");
      String _plus_2 = (this.tabs + _builder_1.toString());
      String _plus_3 = (_plus_2 + "\n");
      this.result.append(_plus_3);
      _xblockexpression = this.result;
    }
    return _xblockexpression;
  }
  
  /**
   * Sequence check and all descendants
   * 
   * @param s Sequence
   * @return StringBuilder
   */
  public StringBuilder compile(final Video s) {
    StringBuilder _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Sequence ");
      String _name = s.getName();
      _builder.append(_name, "");
      _builder.append(" {");
      String _plus = (this.tabs + _builder.toString());
      String _plus_1 = (_plus + "\n");
      this.result.append(_plus_1);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("    ");
      _builder_1.append("url=\"");
      String _url = s.getUrl();
      _builder_1.append(_url, "    ");
      _builder_1.append("\"");
      String _plus_2 = (this.tabs + _builder_1.toString());
      String _plus_3 = (_plus_2 + "\n");
      this.result.append(_plus_3);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("    ");
      _builder_2.append("description=\"");
      String _description = s.getDescription();
      _builder_2.append(_description, "    ");
      _builder_2.append("\"");
      String _plus_4 = (this.tabs + _builder_2.toString());
      String _plus_5 = (_plus_4 + "\n");
      this.result.append(_plus_5);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("    ");
      _builder_3.append("length=");
      Integer _duration = s.getDuration();
      _builder_3.append(_duration, "    ");
      String _plus_6 = (this.tabs + _builder_3.toString());
      String _plus_7 = (_plus_6 + "\n");
      this.result.append(_plus_7);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("    ");
      _builder_4.append("mimetype=");
      Mimetypes_Enum _mimetype = s.getMimetype();
      String _literal = _mimetype.getLiteral();
      _builder_4.append(_literal, "    ");
      String _plus_8 = (this.tabs + _builder_4.toString());
      String _plus_9 = (_plus_8 + "\n");
      this.result.append(_plus_9);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("}");
      String _plus_10 = (this.tabs + _builder_5.toString());
      String _plus_11 = (_plus_10 + "\n");
      this.result.append(_plus_11);
      _xblockexpression = this.result;
    }
    return _xblockexpression;
  }
}
