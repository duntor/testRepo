package patterns.strategyAndFactory.bikes.components.componentsFactory;

import patterns.strategyAndFactory.bikes.components.Engine;
import patterns.strategyAndFactory.bikes.components.Frame;
import patterns.strategyAndFactory.bikes.components.Wheels;

/**
 * Created by pavel on 07.09.16.
 */
public interface ComponentsFactory {
     Engine getEngine();
     Frame getFrame();
     Wheels getWheels();
}
