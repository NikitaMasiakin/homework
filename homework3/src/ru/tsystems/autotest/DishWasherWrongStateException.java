package ru.tsystems.autotest;

public class DishWasherWrongStateException extends RuntimeException {

    DishWasherWrongStateException(String errorMessage) {
        super(errorMessage);
    }
}
