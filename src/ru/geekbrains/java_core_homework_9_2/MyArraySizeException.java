package ru.geekbrains.java_core_homework_9_2;

public class MyArraySizeException extends Exception {
    public void message() {
        System.out.println("Array size must be 4x4!");
        System.out.println("Program is closing");
    }
}
