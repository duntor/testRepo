package patterns.observer.generator;

import patterns.observer.client.NewsReceiver;

/**
 * Created by pavel on 08.09.16.
 */
public interface NewsTranslator {
    void addListener(NewsReceiver receiver);
    void removeListener(NewsReceiver receiver);
    void notifyListeners(News news);
}
