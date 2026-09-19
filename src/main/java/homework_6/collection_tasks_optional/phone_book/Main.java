package homework_6.collection_tasks_optional.phone_book;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иван", "+79990000000");
        phoneBook.addContact("Анна", "+79990000001");
        phoneBook.addContact("Евгений", "+79990000002");
        phoneBook.addContact("Ольга", "+79990000003");
        phoneBook.addContact("Алексей", "+79990000004");

        phoneBook.findContact("Анна");

    }
}
