package com.unip.aps.model;

public class ONG {
    private String name;
    private String description;
    private String phoneNumber;

    public ONG(String name, String description, String phoneNumber) {
        this.name = name;
        this.description = description;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return name;
    }
}
