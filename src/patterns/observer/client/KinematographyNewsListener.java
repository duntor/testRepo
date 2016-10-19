package patterns.observer.client;

import patterns.observer.generator.News;

import static patterns.observer.generator.News.KINEMATOGRAPHY;

/**
 * Created by pavel on 08.09.16.
 */
public class KinematographyNewsListener implements  NewsReceiver {
    @Override
    public void receive(News news) {
        if (news== KINEMATOGRAPHY){
            System.out.println("Kinematography news are received");
        }
    }
}
