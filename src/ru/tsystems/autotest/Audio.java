package ru.tsystems.autotest;

public class Audio extends Media {
    public int bitrate;

    Audio(String author, String date, String message, String type, String mediaName, int bitrate) {
        super(author, date, message, type, mediaName);
        this.bitrate = bitrate;
    }

    public void showBitrate(){
        System.out.println("Bitrate: " + bitrate);
    }
}
