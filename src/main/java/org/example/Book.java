package org.example;

public class Book {
    private String author;
    private String title;

    // Constructor
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book() {

    }

    // Getter methods
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
    }
}

