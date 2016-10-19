package patterns.observer.client;

import patterns.observer.generator.News;

import static patterns.observer.generator.News.MUSIC;

/**
 * Created by pavel on 08.09.16.
 */
public class MusicNewsListener implements  NewsReceiver {
    @Override
    public void receive(News news) {
        if (news== MUSIC){
            System.out.println("Music news are received");
        }
    }
}
