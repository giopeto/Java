package com.observer_test.news;

import com.observer_test.story.Story;

public interface TopicObserver {

    public void update(Story story);
}
