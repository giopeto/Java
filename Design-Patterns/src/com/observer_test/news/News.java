package com.observer_test.news;

import com.observer_test.story.Story;

public class News implements TopicObserver {

    @Override
    public void update(Story story) {
        System.out.println("News Receive story");
        System.out.println(story.printStoty());
        System.out.println();
    }
}
