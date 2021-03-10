package ru.tsystems.autotest;

public class Image extends Media {
    public String format;

    Image(String author, String date, String message, Data type, String mediaName, String format) {
        super(author, date, message, type, mediaName);
        this.format = format;
    }

    public void showFormat(){
        System.out.println("Format: " + format);
    }
}
