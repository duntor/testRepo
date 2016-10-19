import patterns.EntryPoint;
import patterns.command.CommandInvokerEntryPoint;
import patterns.decorator.DecoratorEntryPoint;
import patterns.observer.ObserverEntryPoint;
import patterns.strategyAndFactory.StrategyAndFactoryExampleEntryPoint;

public class Main {

    public static void main(String[] args) {
//        EntryPoint strategyAndFactoryEntryPoint = new StrategyAndFactoryExampleEntryPoint();
//        strategyAndFactoryEntryPoint.runExample();

//        ObserverEntryPoint observerEntryPoint = new ObserverEntryPoint();
//        observerEntryPoint.runExample();

//         new DecoratorEntryPoint().runExample();

        new CommandInvokerEntryPoint().runExample();
    }
}
