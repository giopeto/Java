package com.observer_test.topics;

import com.observer_test.news.TopicObserver;
import com.observer_test.story.Story;

import java.util.LinkedList;
import java.util.List;

public class Topic implements TopicSubject {

    private String name;
    private Story story;
    private List<TopicObserver> observers = new LinkedList();

    public Topic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStory(Story story) {
        this.story = story;
        notifyObservers(story);
    }

    @Override
    public void registerObserver(TopicObserver topicObserver) {
        observers.add(topicObserver);
    }

    @Override
    public void notifyObservers(Story story) {
        observers.forEach(observer -> observer.update(story));
    }
}
