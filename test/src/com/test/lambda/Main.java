package com.test.lambda;

public class Main {

    public static void main(String[] args) {
        State state = new State();

        // Java 7
        state.addStateListener(new StateChangeListener() {
            @Override
            public void onStateChange(String oldState, String newState) {
                System.out.println(oldState + " " + newState);
            }
        });
        // Test
        state.setState("old 1", "new 1");

        // Java 8
        state.addStateListener((oldState, newState) -> System.out.println(oldState + " " + newState));
        // Test
        state.setState("old 2", "new 2");
    }
}
