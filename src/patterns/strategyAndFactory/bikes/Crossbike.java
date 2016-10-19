package patterns.strategyAndFactory.bikes;

import patterns.strategyAndFactory.bikes.accelerationBehaviour.AccelerationStrategy;
import patterns.strategyAndFactory.bikes.components.componentsFactory.ComponentsFactory;

/**
 * Created by pavel on 07.09.16.
 */
public class Crossbike extends Bike {

    public Crossbike(AccelerationStrategy strategy, ComponentsFactory factory) {
        super(strategy, factory);
    }
    @Override
    public void brake() {
        System.out.println("I'm braking. Forest. Trees. Yeah. Speed is 30");
    }
}
