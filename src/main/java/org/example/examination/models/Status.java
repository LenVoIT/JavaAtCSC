package org.example.examination.models;

public enum Status {
    ACTIVATE("Hoạt động"),
    BLOCKED("Bị khóa");

    private String display;

    Status(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }
}
