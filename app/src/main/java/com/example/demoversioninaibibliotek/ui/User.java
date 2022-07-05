package com.example.demoversioninaibibliotek.ui;

public class User {
    private String name;
    private String surName;
    private String groop_number;
    private String gmail;

    public User(String name, String surName, String groop_number, String gmail) {
        this.name = name;
        this.surName = surName;
        this.groop_number = groop_number;
        this.gmail = gmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGroop_number() {
        return groop_number;
    }

    public void setGroop_number(String groop_number) {
        this.groop_number = groop_number;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
