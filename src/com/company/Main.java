package com.company;

import com.company.classes.ABook;
import com.company.classes.Fiction;
import com.company.classes.Book;

public class Main {

    public static void main(String[] args) {
        ABook aBook = new ABook(5, 8);
        System.out.println("Длина аудио: " + aBook.calcAudio(12, 8));
        System.out.println("Цена: " + aBook.calcPrice(5, 8));

        Book book = new Fiction("Оно", 4, 10);
        System.out.println(book.getType());
        System.out.println(book.printColor("красный"));
    }
}
