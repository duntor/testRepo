package patterns.observer.client;

import patterns.observer.generator.News;

/**
 * Created by pavel on 08.09.16.
 */
public interface NewsReceiver {
    void receive(News news);
}
