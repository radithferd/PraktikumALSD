package Praktikum11;

public class Book {
    public String isbn;
    public String tittle;

    public Book() {

    }

    public Book(String isbn, String tittle) {
        this.isbn = isbn;
        this.tittle = tittle;
    }

    public String toString() {
        return "ISBN: " + this.isbn + " Tittle: " + this.tittle;
    }
}
