package patterns.strategyAndFactory.bikes;

import patterns.strategyAndFactory.bikes.accelerationBehaviour.AccelerationStrategy;
import patterns.strategyAndFactory.bikes.components.Engine;
import patterns.strategyAndFactory.bikes.components.Frame;
import patterns.strategyAndFactory.bikes.components.Wheels;
import patterns.strategyAndFactory.bikes.components.componentsFactory.ComponentsFactory;

/**
 * Created by pavel on 07.09.16.
 */
public abstract class Bike implements AccelerationStrategy {
    private Engine engine;
    private Frame frame;
    private Wheels wheels;
    private AccelerationStrategy accelerationStrategy;

    public Bike(AccelerationStrategy accelerationStrategy, ComponentsFactory factory) {
        this.accelerationStrategy = accelerationStrategy;
        this.engine = factory.getEngine();
        this.frame = factory.getFrame();
        this.wheels = factory.getWheels();
    }

    public abstract void brake();

    public void accelerate(){
        accelerationStrategy.accelerate();
    }

    public void turn(String side){
        System.out.println("Turning "+side);
    }

    public void describeYourself(){
        System.out.println("----------------");
        System.out.println("Engine is made by "+ engine.getCompany());
        System.out.println("Wheels are made by "+ wheels.getCompany());
        System.out.println("Frame is made by "+ frame.getCompany());
        System.out.println("----------------");
    }

    public void setAccelerationStrategy(AccelerationStrategy accelerationStrategy) {
        this.accelerationStrategy = accelerationStrategy;
    }

    public AccelerationStrategy getAccelerationStrategy() {
        return accelerationStrategy;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }
}
