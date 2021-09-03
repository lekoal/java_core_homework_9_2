package ru.geekbrains.java_core_homework_9_2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int x, int y) {
        System.out.printf("Cant convert symbol to int. Error in cell: %s : %s%n", x, y);
    }
}
