package org.example.examination.models;

public enum Role {
    ADMIN("Quản trị viên"),
    MANAGER("Thủ thư"),
    STAFF("Chuyên viên");

    private String display;

    Role(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return display;
    }
}
