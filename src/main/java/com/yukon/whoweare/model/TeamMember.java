package com.yukon.whoweare.model;

public class TeamMember {
    private String name;
    private String title;
    private String photoUrl;
    private String bio;

    public TeamMember(String name, String title, String photoUrl, String bio) {
        this.name = name;
        this.title = title;
        this.photoUrl = photoUrl;
        this.bio = bio;
    }

    // Getters
    public String getName() { return name; }
    public String getTitle() { return title; }
    public String getPhotoUrl() { return photoUrl; }
    public String getBio() { return bio; }
}
