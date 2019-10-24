package com.test.lambda;

public interface StateChangeListener {

    public void onStateChange(String oldState, String newState);

    default void printState(String state) {
        System.out.println("State is : " + state);
    }
}
