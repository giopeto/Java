package com.test.designpatterns.observerpattern;

public class ObserverPatternCheckNews {

	public static void main(String[] args) {
		NewsWriterObservable newsWriterObservable = new NewsWriterObservable();
		newsWriterObservable.addNewsObserver(new NewsPaperObserver("Daily Express"));
		newsWriterObservable.addNewsObserver(new NewsPaperObserver("Nightly Express"));

		newsWriterObservable.setNews("This is the news!!!");
	}
}
