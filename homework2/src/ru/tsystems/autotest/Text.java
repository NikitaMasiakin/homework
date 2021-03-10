package ru.tsystems.autotest;

public class Text extends AbstractClass{
    public int contentLength;

    Text(String author, String date, String message, Data type, int contentLength) {
        super(author, date, message, type);
        this.contentLength = contentLength;
    }

    public void showLength(){
        System.out.println("Length: " + contentLength);
    }

    Integer maxMessageSize() {
        return null;
    }
}
