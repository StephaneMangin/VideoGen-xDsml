package org.irisa.diverse.videogen.videoGen.aspects;

import java.util.HashMap;
import java.util.Set;

/**
 * Randomization helper
 * 
 * @see https://stackoverflow.com/questions/20327958/random-number-with-probabilities/20329901#20329901
 * 
 * @Author http://stackoverflow.com/users/2128755/trylimits
 */
@SuppressWarnings("all")
public class DistributedRandomNumberGenerator {
  private HashMap<Integer, Double> distribution;
  
  private double distSum;
  
  public DistributedRandomNumberGenerator() {
    HashMap<Integer, Double> _hashMap = new HashMap<Integer, Double>();
    this.distribution = _hashMap;
  }
  
  public void addNumber(final int value, final double distribution) {
    Double _get = this.distribution.get(Integer.valueOf(value));
    boolean _tripleNotEquals = (_get != null);
    if (_tripleNotEquals) {
      double _distSum = this.distSum;
      Double _get_1 = this.distribution.get(Integer.valueOf(value));
      this.distSum = (_distSum - (_get_1).doubleValue());
    }
    this.distribution.put(Integer.valueOf(value), Double.valueOf(distribution));
    double _distSum_1 = this.distSum;
    this.distSum = (_distSum_1 + distribution);
  }
  
  public int getDistributedRandomNumber() {
    double rand = Math.random();
    double ratio = (1.0f / this.distSum);
    double tempDist = 0;
    Set<Integer> _keySet = this.distribution.keySet();
    for (final Integer i : _keySet) {
      {
        double _tempDist = tempDist;
        Double _get = this.distribution.get(i);
        tempDist = (_tempDist + (_get).doubleValue());
        if (((rand / ratio) <= tempDist)) {
          return (i).intValue();
        }
      }
    }
    return 0;
  }
}
