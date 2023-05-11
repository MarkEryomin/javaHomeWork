package org.example.seminar3.HW3;


import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    String authorLastName;
    Double price;
    Integer year;
    Integer pages;


    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }

    public Library(String name, String authorLastName, Double price, Integer year, Integer pages) {
        this.name = name;
        this.authorLastName = authorLastName;
        this.price = price;
        this.year = year;
        this.pages = pages;
    }

    public static List<Library> getBook() {
        ArrayList<Library> books = new ArrayList<>();
        books.add(new Library("book1", "Name1A", 100.0, 2000, 121));
        books.add(new Library("book2", "Name2", 100.0, 2011, 143));
        books.add(new Library("book3", "Name3A", 100.0, 2010, 47));
        books.add(new Library("book4", "Name4", 100.0, 2009, 143));
        books.add(new Library("book5", "Name5A", 100.0, 2023, 143));
        books.add(new Library("book6", "Name6A", 100.0, 2007, 67));
        books.add(new Library("book7", "Name7A", 100.0, 2008, 143));
        books.add(new Library("book8", "Name8A", 100.0, 2022, 97));
        books.add(new Library("book9", "Name9", 100.0, 2012, 166));

        return books;
    }
}
