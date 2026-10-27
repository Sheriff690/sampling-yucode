package com.yukon.whoweare.model;

public class Milestone {
    private int year;
    private String description;

    public Milestone(int year, String description) {
        this.year = year;
        this.description = description;
    }

    public int getYear() { return year; }
    public String getDescription() { return description; }
}
