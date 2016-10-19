package patterns.strategyAndFactory.bikes.factory;

import patterns.strategyAndFactory.bikes.components.componentsFactory.YamahaComponentsFactory;

/**
 * Created by pavel on 07.09.16.
 */
public class YamahaBikesFactory extends AbstractBikesFactory{

    public YamahaBikesFactory() {
        super(new YamahaComponentsFactory());
    }
}
