package patterns.observer.client;

import patterns.observer.generator.News;

import static patterns.observer.generator.News.POLITICAL;

/**
 * Created by pavel on 08.09.16.
 */
public class PoliticalNewsListener implements  NewsReceiver {
    @Override
    public void receive(News news) {
        if (news== POLITICAL){
            System.out.println("Political news are received");
        }
    }
}
