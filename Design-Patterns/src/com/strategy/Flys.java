package com.strategy;

public interface Flys {
    String fly();
}

class ItFlys implements Flys{

    @Override
    public String fly() {
        return "Fly High";
    }
}

class CantFlys implements Flys{

    @Override
    public String fly() {
        return "Can't Fly";
    }
}