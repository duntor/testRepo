package patterns.observer.client;

import patterns.observer.generator.News;

import static patterns.observer.generator.News.WEATHER;

/**
 * Created by pavel on 08.09.16.
 */
public class WeatherNewsListener implements  NewsReceiver {
    @Override
    public void receive(News news) {
        if (news== WEATHER){
            System.out.println("Weather news are received");
        }
    }
}
