package ru.tsystems.autotest;

public abstract class AbstractClass {
    public String author;
    public String date;
    public String message;
    public String type;

    AbstractClass(String author, String date, String message, String type){
        this.author = author;
        this.date = date;
        this.message = message;
        this.type = type;
    }

    public void showContent() {
        System.out.println("Author: " + author);
        System.out.println("Date: " + date);
        System.out.println("Message: " + message);
        System.out.println("Type: " + type);
    }

    abstract Integer maxMessageSize();
}
