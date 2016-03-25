package org.irisa.diverse.videogen.transformations.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import videoGen.Alternatives;
import videoGen.Mandatory;
import videoGen.Optional;
import videoGen.Sequence;
import videoGen.Video;
import videoGen.VideoGen;

/**
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 */
@SuppressWarnings("all")
public class VideoGenHelper {
  /**
   * Return all sequences contained in a VideoGen instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static Collection<Video> allVideos(final VideoGen videoGen) {
    Collection<Video> _xblockexpression = null;
    {
      final Collection<Video> videos = new ArrayList<Video>();
      EList<Sequence> _sequences = videoGen.getSequences();
      final Consumer<Sequence> _function = new Consumer<Sequence>() {
        public void accept(final Sequence sequence) {
          if ((sequence instanceof Alternatives)) {
            EList<Optional> _options = ((Alternatives)sequence).getOptions();
            final Consumer<Optional> _function = new Consumer<Optional>() {
              public void accept(final Optional option) {
                Video _video = option.getVideo();
                videos.add(_video);
              }
            };
            _options.forEach(_function);
          } else {
            if ((sequence instanceof Mandatory)) {
              Video _video = ((Mandatory)sequence).getVideo();
              videos.add(_video);
            } else {
              if ((sequence instanceof Optional)) {
                Video _video_1 = ((Optional)sequence).getVideo();
                videos.add(_video_1);
              }
            }
          }
        }
      };
      _sequences.forEach(_function);
      _xblockexpression = videos;
    }
    return _xblockexpression;
  }
  
  /**
   * Return a hashmap with corrected probabilities for an Alternatives instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static Map<String, Integer> checkProbabilities(final Alternatives alternatives) {
    HashMap<String, Integer> _xblockexpression = null;
    {
      final HashMap<String, Integer> result = new HashMap<String, Integer>();
      int totalProb = 0;
      int totalOptions = 0;
      EList<Optional> _options = alternatives.getOptions();
      for (final Optional option : _options) {
        {
          Integer _probability = option.getProbability();
          boolean _equals = ((_probability).intValue() == 0);
          if (_equals) {
            totalOptions++;
          }
          int _talProb = totalProb;
          Integer _probability_1 = option.getProbability();
          totalProb = (_talProb + (_probability_1).intValue());
          Video _video = option.getVideo();
          String _name = _video.getName();
          Integer _probability_2 = option.getProbability();
          result.put(_name, _probability_2);
        }
      }
      Set<String> _keySet = result.keySet();
      for (final String name : _keySet) {
        Integer _get = result.get(name);
        boolean _equals = ((_get).intValue() == 0);
        if (_equals) {
          result.put(name, Integer.valueOf(((100 - totalProb) / totalOptions)));
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
