package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Clean Code", 155);
        books[1] = new Book("Clean", 100);
        books[2] = new Book("Code", 55);
        books[3] = new Book("Bible", 1200);
        for (int i = 0; i < books.length; i++) {
            System.out.println(i + ": " + books[i].getTitle() + " has " + books[i].getPages() + " pages.");
        }
        System.out.println();

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(i + ": " + books[i].getTitle() + " has " + books[i].getPages() + " pages.");
        }
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals("Clean Code")) {
                System.out.println(books[i].getTitle() + " | " + books[i].getPages() + " pages.");
            }
        }
    }
}
