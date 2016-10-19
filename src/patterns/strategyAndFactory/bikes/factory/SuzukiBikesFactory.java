package patterns.strategyAndFactory.bikes.factory;
import patterns.strategyAndFactory.bikes.components.componentsFactory.SuzukiComponentsFactory;

/**
 * Created by pavel on 07.09.16.
 */
public class SuzukiBikesFactory extends AbstractBikesFactory {

    public SuzukiBikesFactory() {
        super(new SuzukiComponentsFactory());
    }
}
