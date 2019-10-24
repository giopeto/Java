package com.test.lambda;

public class State {

    private StateChangeListener stateChangeListener;

    public void addStateListener(StateChangeListener listener) {
        this.stateChangeListener = listener;
        System.out.println("State listener added");
    }

    public void setState(String oldState, String newState) {
        this.stateChangeListener.onStateChange(oldState, newState);
    }

    public void printState(String state) {
        this.stateChangeListener.printState(state);
    }
}
