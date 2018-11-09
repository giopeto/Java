package com.observer_test.topics;

import com.observer_test.story.Story;
import com.observer_test.news.TopicObserver;

// Subject / Observable
public interface TopicSubject {

    public void registerObserver(TopicObserver topicObserver);
    public void notifyObservers(Story story);
}
