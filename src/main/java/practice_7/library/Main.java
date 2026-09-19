package practice_7.library;

import practice_7.library.exceprions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1984", "Оруэл"));
        library.addBook(new Book("Мартин Иден", "Лондон"));
        library.addBook(new Book("Евгений Онегин", "Пушкин"));
//        library.addBook(new Book("Евгений Онегин", "Пушкин"));

        try {
            library.findBook("344");
        } catch (BookNotFoundException e) {
            System.out.println("Поймали исключение!");
        }
    }
}
