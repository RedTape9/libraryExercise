package de.buecherhallen.library;

import java.util.Arrays;

public class Library {
    // attributes
    private Book[] books;

    // constructor
    public Library(Book[] books){
        this.books = books;
    }
    // GETTER and SETTER
    public Book[] getBooks(){
        return books;
    }
    public void setBooks(Book[] books){
        this.books = books;
    }
    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void deleteBook(Book book){
        Book[] newBooks = new Book[books.length - 1];
        int index = 0;
        for (Book b : books) {
            if (!b.equals(book)) {
                newBooks[index] = b;
                index++;
            }
        }
        books = newBooks;
    }

    public void addBook(Book book){
        Book[] newBooks = new Book[books.length + 1];
        int index = 0;
        for (Book b : books) {
            newBooks[index] = b;
            index++;
        }
        newBooks[index] = book;
        books = newBooks;
    }
}
