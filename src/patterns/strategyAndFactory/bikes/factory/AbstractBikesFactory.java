package patterns.strategyAndFactory.bikes.factory;

import patterns.strategyAndFactory.bikes.Chopper;
import patterns.strategyAndFactory.bikes.Crossbike;
import patterns.strategyAndFactory.bikes.Sportbike;
import patterns.strategyAndFactory.bikes.accelerationBehaviour.ChopperAccelerationStrategy;
import patterns.strategyAndFactory.bikes.accelerationBehaviour.CrossbikeAccelerationStrategy;
import patterns.strategyAndFactory.bikes.accelerationBehaviour.SportbikeAccelerationStrategy;
import patterns.strategyAndFactory.bikes.components.componentsFactory.ComponentsFactory;

/**
 * Created by pavel on 07.09.16.
 */
public class AbstractBikesFactory implements BikesFactory {

    ComponentsFactory componentsFactory;

    public AbstractBikesFactory(ComponentsFactory componentsFactory) {
        this.componentsFactory = componentsFactory;
    }

    @Override
    public Sportbike getSportbike() {
        return new Sportbike(new SportbikeAccelerationStrategy(), componentsFactory);
    }

    @Override
    public Chopper getChopper() {
        return new Chopper(new ChopperAccelerationStrategy(), componentsFactory);
    }

    @Override
    public Crossbike getCrossbike() {
        return new Crossbike(new CrossbikeAccelerationStrategy(), componentsFactory);
    }
}
