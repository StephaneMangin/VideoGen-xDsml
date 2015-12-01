package org.istic.idm.xtext;

import PlayList.PlayList;
import PlayList.PlayListFactory;
import PlayList.Video;
import PlayList.impl.PlayListFactoryImpl;
import PlayList.impl.PlayListImpl;
import PlayList.impl.VideoImpl;
import com.google.common.base.Objects;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.istic.idm.xtext.DistributedRandomNumberGenerator;
import org.istic.idm.xtext.videoGen.Alternative;
import org.istic.idm.xtext.videoGen.MandatoryVideoSeq;
import org.istic.idm.xtext.videoGen.OptionalVideoSeq;
import org.istic.idm.xtext.videoGen.Statement;
import org.istic.idm.xtext.videoGen.VideoGen;
import org.istic.idm.xtext.videoGen.VideoGenFactory;
import org.istic.idm.xtext.videoGen.VideoSeq;
import org.istic.idm.xtext.videoGen.impl.VideoGenFactoryImpl;
import org.istic.idm.xtext.videoGen.impl.VideoGenImpl;
import org.istic.idm.xtext.videoGen.impl.VideoSeqImpl;

@SuppressWarnings("all")
public class VideoGenTransform {
  public VideoGenTransform() {
  }
  
  private static void transferData(final Video p_video, final VideoSeq videoseq) {
    int _length = videoseq.getLength();
    p_video.setDuration(_length);
    String _url = videoseq.getUrl();
    p_video.setPath(_url);
    String _desc = videoseq.getDesc();
    p_video.setDescription(_desc);
  }
  
  private static boolean isOptionable(final OptionalVideoSeq video) {
    DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
    float proba = 0;
    VideoSeq _videoseq = video.getVideoseq();
    int _prob = _videoseq.getProb();
    boolean _notEquals = (_prob != 0);
    if (_notEquals) {
      VideoSeq _videoseq_1 = video.getVideoseq();
      int _prob_1 = _videoseq_1.getProb();
      proba = _prob_1;
    } else {
      proba = 50;
    }
    drng.addNumber(1, proba);
    drng.addNumber(0, (100 - proba));
    int _distributedRandomNumber = drng.getDistributedRandomNumber();
    boolean _greaterThan = (_distributedRandomNumber > 0);
    if (_greaterThan) {
      return true;
    }
    return false;
  }
  
  private static VideoSeqImpl getAlternativeVideoSeq(final Alternative alternative) {
    final DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
    EList<VideoSeq> _videoseqs = alternative.getVideoseqs();
    final int nbAlternative = _videoseqs.size();
    EList<VideoSeq> _videoseqs_1 = alternative.getVideoseqs();
    final Consumer<VideoSeq> _function = (VideoSeq videoseq) -> {
      int count = 0;
      float proba = 0;
      int _prob = videoseq.getProb();
      boolean _notEquals = (_prob != 0);
      if (_notEquals) {
        int _prob_1 = videoseq.getProb();
        proba = _prob_1;
      } else {
        proba = ((1 / nbAlternative) * 100);
      }
      drng.addNumber(count, proba);
    };
    _videoseqs_1.forEach(_function);
    int index = drng.getDistributedRandomNumber();
    EList<VideoSeq> _videoseqs_2 = alternative.getVideoseqs();
    VideoSeq _get = _videoseqs_2.get(index);
    return ((VideoSeqImpl) _get);
  }
  
  public static VideoGen toVideoGen(final PlayList playList) {
    VideoGenFactory videoGenFactory = VideoGenFactoryImpl.init();
    VideoGen _createVideoGen = videoGenFactory.createVideoGen();
    final VideoGenImpl videoGen = ((VideoGenImpl) _createVideoGen);
    return ((VideoGen) videoGen);
  }
  
  public static PlayListImpl toPlayList(final VideoGen videogen) {
    PlayListImpl _xblockexpression = null;
    {
      PlayListFactory _init = PlayListFactoryImpl.init();
      PlayListFactoryImpl playlistFactory = ((PlayListFactoryImpl) _init);
      PlayList _createPlayList = playlistFactory.createPlayList();
      final PlayListImpl playlist = ((PlayListImpl) _createPlayList);
      EList<Statement> _statements = videogen.getStatements();
      final Consumer<Statement> _function = (Statement statement) -> {
        VideoSeq videoSeq = null;
        if ((statement instanceof Alternative)) {
          VideoSeqImpl _alternativeVideoSeq = VideoGenTransform.getAlternativeVideoSeq(((Alternative)statement));
          videoSeq = _alternativeVideoSeq;
        } else {
          if ((statement instanceof MandatoryVideoSeq)) {
            VideoSeq _videoseq = ((MandatoryVideoSeq)statement).getVideoseq();
            videoSeq = _videoseq;
          } else {
            if ((statement instanceof OptionalVideoSeq)) {
              boolean _isOptionable = VideoGenTransform.isOptionable(((OptionalVideoSeq)statement));
              if (_isOptionable) {
                VideoSeq _videoseq_1 = ((OptionalVideoSeq)statement).getVideoseq();
                videoSeq = _videoseq_1;
              }
            }
          }
        }
        boolean _notEquals = (!Objects.equal(videoSeq, null));
        if (_notEquals) {
          PlayListFactoryImpl _playListFactoryImpl = new PlayListFactoryImpl();
          Object obj = _playListFactoryImpl.createVideo();
          Video p_video = ((Video) obj);
          VideoGenTransform.transferData(p_video, videoSeq);
          EList<Video> _video = playlist.getVideo();
          _video.add(((VideoImpl) p_video));
        }
      };
      _statements.forEach(_function);
      _xblockexpression = playlist;
    }
    return _xblockexpression;
  }
}