package org.example.OOP.Bai1;

public class Word {
    private String english;
    private String vietnamese;
    private String example;

    public Word() {
    }

    public Word(String english, String vietnamese, String example) {
        this.english = english;
        this.vietnamese = vietnamese;
        this.example = example;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "English: " + english +
                "\nVietnamese: " + vietnamese +
                "\nExample: " + example;
    }
}

