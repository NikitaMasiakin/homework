package ru.tsystems.autotest;

public class Video extends Media {
    public String resolution;

    Video(String author, String date, String message, Data type, String mediaName, String resolution) {
        super(author, date, message, type, mediaName);
        this.resolution = resolution;
    }

    public void showResolution(){
        System.out.println("Resolution: " + resolution);
    }
}
