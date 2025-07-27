package homework_2;

public class Book {
    String author;
    String title;

    Book(String someAuthor, String someTitle) {
        this.author = someAuthor;
        this.title = someTitle;
    }

    String getAuthor() {
        return this.author;
    }

    String getTitle() {
        return this.title;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void printInfo() {
        System.out.println("Название книги: " + this.title + ", автор книги: " + this.author);
    }
}
