package org.example;

public class AudioBook extends Book {
    private double filesize;

    //constuctor
    public AudioBook(String author, String title, double filesize) {
        super(author, title);
        this.filesize = filesize;
    }

    public double getFilesize() {
        return filesize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File size:" + filesize + "MB");
    }
}



