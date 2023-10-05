package com.example.actionplanner;

public class Task {

    private String name;

    public Task(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return this.name = name;
    }
}
