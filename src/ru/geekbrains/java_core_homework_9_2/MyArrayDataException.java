package ru.geekbrains.java_core_homework_9_2;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(String message, NumberFormatException e) {
        super(message + ". " + e);
    }
}