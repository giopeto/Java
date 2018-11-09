package com.observer_test;

import com.observer_test.news.LateNews;
import com.observer_test.news.News;
import com.observer_test.story.Story;
import com.observer_test.topics.SportTopic;
import com.observer_test.topics.Topic;
import com.observer_test.topics.WeatherTopic;

public class ObserverTestMain {

    public static void main(String[] args) {

        News news = new News(); // Observer
        LateNews lateNews = new LateNews(); // Observer
        Topic sport = new SportTopic("Sport news"); // Subject
        WeatherTopic weather = new WeatherTopic("Weather news"); // Subject

        sport.registerObserver(news);
        weather.registerObserver(news);
        weather.registerObserver(lateNews);
        sport.setStory(new Story(sport.getName(), "New world records", "New world records for 100m running"));
        weather.setStory(new Story(weather.getName(), "Nice weather", "Nice weather in whole country this week"));
    }
}
