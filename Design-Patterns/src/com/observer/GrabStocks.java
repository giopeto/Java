package com.observer;

public class GrabStocks {
    public static void main(String[] args) {
        // Create the Subject object
        // It will handle updating all observers
        // as well as deleting and adding them
        StockGrabber stockGrabber = new StockGrabber();
        // Create an Observer that will be sent updates from Subject
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(1);
        stockGrabber.setAplPrice(2);
        stockGrabber.setGoogPrice(3);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(1);
        stockGrabber.setAplPrice(2);
        stockGrabber.setGoogPrice(3);

        stockGrabber.unRegister(observer2);

    }

}
