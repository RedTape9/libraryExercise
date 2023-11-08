package de.buecherhallen.library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "978-3-551-25005-5");
        Book book2 = new Book("Bibi Blocksberg", "Elfie Donnelly", "978-3-551-25005-5");
        Book book3 = new Book("Graf Monte Christo", "Alexandre Dumas", "978-3-551-25005-5");
        Book book4 = new Book("Pippi Langstrumpf", "Astrid Lindgren", "978-3-551-25005-5");

        Book[] books = {book1, book2, book3};

        Library buecherhalleVolksdorf = new Library(books);

        System.out.println(buecherhalleVolksdorf.getBooks()[0].getTitle());
        System.out.println(buecherhalleVolksdorf.getBooks()[1].toString());

        System.out.println(buecherhalleVolksdorf);

        buecherhalleVolksdorf.deleteBook(book3);
        buecherhalleVolksdorf.addBook(book4);


        System.out.println("\n\n\n");
        System.out.println(buecherhalleVolksdorf);

    }
}