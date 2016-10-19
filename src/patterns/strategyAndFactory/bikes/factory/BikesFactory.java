package patterns.strategyAndFactory.bikes.factory;

import patterns.strategyAndFactory.bikes.Chopper;
import patterns.strategyAndFactory.bikes.Crossbike;
import patterns.strategyAndFactory.bikes.Sportbike;

/**
 * Created by pavel on 07.09.16.
 */
public interface BikesFactory {
    Sportbike getSportbike();
    Chopper getChopper();
    Crossbike getCrossbike();
}
