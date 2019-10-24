package com.test.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class NewsWriterObservable {

	public String news;
	public List<Observer> observers;

	public NewsWriterObservable() {
		observers = new ArrayList<>();
	}

	public void addNewsObserver(Observer observer) {
		observers.add(observer);
	}

	public void setNews(String news) {
		this.news = news;
		observers.forEach(o-> o.update(news));
	}
}
