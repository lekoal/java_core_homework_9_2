package ru.geekbrains.java_core_homework_9_2;

public class MyArrayDataException extends Exception { // Создание обработки исключения ввода данных в массив

    public MyArrayDataException(String message, NumberFormatException e) { // Конструктор класса обработки
        super(message + ". " + e); // Передача сообщения с данными из NumberFormatException
    }
}