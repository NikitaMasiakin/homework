package ru.tsystems.autotest;

public class Media extends AbstractClass{
    public String mediaName;

    Media(String author, String date, String message, Data type, String mediaName) {
        super(author, date, message, type);
        this.mediaName = mediaName;
    }

    public void loadingMedia(){
        System.out.println("Loading...");
    }

    Integer maxMessageSize() {
        return null;
    }
}
