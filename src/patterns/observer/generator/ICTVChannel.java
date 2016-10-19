package patterns.observer.generator;

import patterns.observer.client.NewsReceiver;

import javax.sound.midi.Receiver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static patterns.observer.generator.News.*;

/**
 * Created by pavel on 08.09.16.
 */
public class ICTVChannel implements NewsTranslator{

    private List<NewsReceiver> receivers = new ArrayList<>();
    private List<News> news = new ArrayList<News>(){{
        add(KINEMATOGRAPHY);
        add(MUSIC);
        add(POLITICAL);
        add(WEATHER);
    }};

    @Override
    public void addListener(NewsReceiver receiver) {
        receivers.add(receiver);
    }

    @Override
    public void removeListener(NewsReceiver receiver) {
        receivers.remove(receiver);
    }

    @Override
    public void notifyListeners(News news) {
        for(NewsReceiver receiver:receivers){
            receiver.receive(news);
        }
    }

    public void generateNews(int count){
        int i=0;
        while (i<count) {
           notifyListeners(news.get(getRandomInt()));
            i++;
        }
    }

    private int getRandomInt() {
        return ThreadLocalRandom.current().nextInt(0, 4);
    }
}
