package homework_7.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
4. Создание и использование собственного непроверяемого исключения
Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет, является ли строка правильным электронным адресом.
Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
 */
public class MyOwnUncheckedExceptionTask {
    public static void main(String[] args) {
        try {
            checkEmail("anna@gmail");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new InvalidEmailException("Некорректный email");
        }
    }
}
