package com.observer_test.story;

public class Story {

    private String storyType;
    private String name;
    private String content;

    public Story(String storyType, String name, String content) {
        this.storyType = storyType;
        this.name = name;
        this.content = content;
    }

    public String printStoty() {
        return storyType + "\n" +
                name + "\n" +
                content + "\n";
    }

}