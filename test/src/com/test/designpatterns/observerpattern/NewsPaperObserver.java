package com.test.designpatterns.observerpattern;

public class NewsPaperObserver implements Observer {

	private String name;

	public NewsPaperObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(String news) {
		System.out.println(this.name + " receive new news: " + news);
	}
}
