package patterns.strategyAndFactory.bikes.accelerationBehaviour;

/**
 * Created by pavel on 07.09.16.
 */
public class ChopperAccelerationStrategy implements AccelerationStrategy {
    @Override
    public void accelerate() {
        System.out.println("I'm accelerating, I'm chopper. Please wait... :-) ");
    }

}