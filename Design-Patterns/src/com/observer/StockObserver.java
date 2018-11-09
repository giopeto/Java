package com.observer;

import com.sun.org.apache.xpath.internal.SourceTree;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;
    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("New observer " + this.observerID);

        stockGrabber.register(this);
    }



    @Override
    public void update(double ibmPrice, double aplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aplPrice = aplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice +
            "\nAPL: " + aplPrice + "\nGOOG " + googPrice + "\n");
    }
}
