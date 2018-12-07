package com.copart.oops.Association.Composition.example1;

import java.util.ArrayList;
import java.util.List;
/*
In this example a Library can have no. of books on same or different subjects. So if library gets destroyed then all
books with in that particular library will be destroyed. i.e. book can not exist withput library. Thats why its
composition.

 */
public class Test {
    public static void main(String [] args) {
        Book b1 = new Book("Effective Java" , "Joshua Bloch");
        Book b2 = new Book("thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The complete reference","Herbert Schildt");

        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library = new Library(books);

        List<Book> bookList = library.getTotalBooksInLibrary();
        for (Book books1 : bookList) {
            System.out.println("Title : " + books1.title + " and Author : " + books1.author);
        }
    }
}
