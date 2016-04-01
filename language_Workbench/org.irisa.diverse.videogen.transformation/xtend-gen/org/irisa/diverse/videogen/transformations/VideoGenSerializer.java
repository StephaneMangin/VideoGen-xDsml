package org.irisa.diverse.videogen.transformations;

import java.util.function.Consumer;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import org.eclipse.emf.common.util.EList;
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
public class VideoGenSerializer {
  private final JsonObjectBuilder object;
  
  public VideoGenSerializer() {
    JsonObjectBuilder _createObjectBuilder = Json.createObjectBuilder();
    this.object = _createObjectBuilder;
  }
  
  /**
   * VideoGen
   * 
   * @param v VideoGen
   * @return StringBuilder
   */
  public JsonObject compile(final VideoGen v) {
    JsonObject _xblockexpression = null;
    {
      final JsonObjectBuilder node = Json.createObjectBuilder();
      EList<Sequence> _sequences = v.getSequences();
      Sequence sequence = _sequences.get(0);
      while ((sequence != null)) {
        {
          this.compile(sequence, node);
          Sequence _nextSequence = sequence.getNextSequence();
          sequence = _nextSequence;
        }
      }
      this.object.add("VideoGen", node);
      _xblockexpression = this.object.build();
    }
    return _xblockexpression;
  }
  
  /**
   * Statements
   * 
   * @param v VideoGen
   * @return StringBuilder
   */
  private void compile(final Sequence s, final JsonObjectBuilder node) {
    if ((s instanceof Mandatory)) {
      this.compile(((Mandatory)s), node);
    } else {
      if ((s instanceof Optional)) {
        this.compile(((Optional)s), node);
      } else {
        if ((s instanceof Alternatives)) {
          this.compile(((Alternatives)s), node);
        }
      }
    }
  }
  
  /**
   * Mandatory
   * 
   * @param m Mandatory
   * @return StringBuilder
   */
  private void compile(final Mandatory m, final JsonObjectBuilder node) {
    final JsonObjectBuilder newnode = Json.createObjectBuilder();
    Video _video = m.getVideo();
    this.compile(_video, newnode);
    node.add("Mandatory", newnode);
  }
  
  /**
   * Optional
   * 
   * @param o Optional
   * @return StringBuilder
   */
  private void compile(final Optional o, final JsonObjectBuilder node) {
    final JsonObjectBuilder newnode = Json.createObjectBuilder();
    Video _video = o.getVideo();
    this.compile(_video, newnode);
    int proba = 50;
    Integer _probability = o.getProbability();
    boolean _notEquals = ((_probability).intValue() != 0);
    if (_notEquals) {
      Integer _probability_1 = o.getProbability();
      proba = (_probability_1).intValue();
    }
    newnode.add("probability", proba);
    node.add("Optional", newnode);
  }
  
  /**
   * Alternatives
   * 
   * @param a Alternatives
   * @return StringBuilder
   */
  private void compile(final Alternatives a, final JsonObjectBuilder node) {
    final JsonObjectBuilder newnode = Json.createObjectBuilder();
    EList<Optional> _options = a.getOptions();
    final Consumer<Optional> _function = (Optional o) -> {
      Video _video = o.getVideo();
      this.compile(_video, newnode);
    };
    _options.forEach(_function);
    node.add("Alternatives", newnode);
  }
  
  /**
   * Sequence
   * 
   * @param s Sequence
   * @return StringBuilder
   */
  private void compile(final Video s, final JsonObjectBuilder node) {
    String _url = s.getUrl();
    node.add("url", _url);
    String _description = s.getDescription();
    node.add("description", _description);
    Integer _duration = s.getDuration();
    node.add("length", (_duration).intValue());
    Mimetypes_Enum _mimetype = s.getMimetype();
    String _literal = _mimetype.getLiteral();
    node.add("mimetype", _literal);
  }
}
