package patterns.observer;

import patterns.EntryPoint;
import patterns.observer.client.KinematographyNewsListener;
import patterns.observer.client.MusicNewsListener;
import patterns.observer.client.PoliticalNewsListener;
import patterns.observer.client.WeatherNewsListener;
import patterns.observer.generator.ICTVChannel;

/**
 * Created by pavel on 07.09.16.
 */
public class ObserverEntryPoint implements EntryPoint {
    @Override
    public void runExample() {
        ICTVChannel channel = new ICTVChannel();
        channel.addListener(new MusicNewsListener());
        channel.addListener(new KinematographyNewsListener());
        channel.addListener(new WeatherNewsListener());
        channel.addListener(new PoliticalNewsListener());
        channel.generateNews(100);
    }
}
