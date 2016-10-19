package patterns.strategyAndFactory.bikes.components.componentsFactory;

import patterns.strategyAndFactory.bikes.components.Engine;
import patterns.strategyAndFactory.bikes.components.Frame;
import patterns.strategyAndFactory.bikes.components.Wheels;

/**
 * Created by pavel on 07.09.16.
 */
public class SuzukiComponentsFactory implements ComponentsFactory {
    @Override
    public Engine getEngine() {
        return new Engine(getCompanyName());
    }

    @Override
    public Frame getFrame() {
        return new Frame(getCompanyName());
    }

    @Override
    public Wheels getWheels() {
        return new Wheels(getCompanyName());
    }

    private String getCompanyName(){
        return "Suzuki";
    }
}
