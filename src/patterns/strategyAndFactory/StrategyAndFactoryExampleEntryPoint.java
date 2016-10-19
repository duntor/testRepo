package patterns.strategyAndFactory;

import patterns.EntryPoint;
import patterns.strategyAndFactory.bikes.Chopper;
import patterns.strategyAndFactory.bikes.Crossbike;
import patterns.strategyAndFactory.bikes.Sportbike;
import patterns.strategyAndFactory.bikes.factory.BikesFactory;
import patterns.strategyAndFactory.bikes.factory.SuzukiBikesFactory;
import patterns.strategyAndFactory.bikes.factory.YamahaBikesFactory;

/**
 * Created by pavel on 07.09.16.
 */
public class StrategyAndFactoryExampleEntryPoint implements EntryPoint
{
    @Override
    public void runExample() {

        BikesFactory yamahaFactory = new YamahaBikesFactory();
        BikesFactory suzukiFactory = new SuzukiBikesFactory();
        Sportbike yamahaSportBike = yamahaFactory.getSportbike();
        Crossbike suzukiCrossBike = suzukiFactory.getCrossbike();
        Chopper yamahaChopper = yamahaFactory.getChopper();
        Sportbike suzukiSportbike = suzukiFactory.getSportbike();

        yamahaSportBike.accelerate();
        yamahaSportBike.describeYourself();
        suzukiSportbike.accelerate();
        suzukiSportbike.describeYourself();
        suzukiCrossBike.accelerate();
        suzukiCrossBike.describeYourself();
        yamahaChopper.accelerate();
        yamahaChopper.describeYourself();


    }
}
