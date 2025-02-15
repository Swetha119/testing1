package org.example;

public class Main{
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("Author", "Title of the Book ");
        book.displayDetails();

        // Creating an AudioBook object
        AudioBook audiobook = new AudioBook("Auther", "Title of the Book", 1.2);
        audiobook.displayDetails();
    }
}
