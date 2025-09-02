package homework_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
//    library.bookTitle = "Test";
        // Приватное поле, не могу инициализировать, только через сеттер

        library.setBookTitle("Test");

        library.author = "Pushkin";
        // Могу менять, так как доступен в рамках пакета, а если бы был в другом - не смогла бы

        library.year = 2005;
        // Могу менять, так как доступен в рамках пакета

        library.category = "Computer science";
        // Могу менять, доступен всем


    }

}
