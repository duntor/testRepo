package patterns.strategyAndFactory.bikes.accelerationBehaviour;

/**
 * Created by pavel on 07.09.16.
 */
public class CrossbikeAccelerationStrategy implements AccelerationStrategy {
    @Override
    public void accelerate() {
        System.out.println("I'm accelerating. In a forest. I'm cross-bike");
    }
}
