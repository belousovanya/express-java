package homework_6.phone_book;

import java.util.HashMap;
import java.util.Map;

/*
6. Структура телефонной книги
Задача:
Хранить имена и номера телефонов, быстро находить номер по имени.
 */
public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void findContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(contacts.get(name));
        } else {
            System.out.println("Нет такого контакта");
        }
    }
}
