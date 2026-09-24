package homework_7.exceptions;

/*
3. Создание и использование собственного проверяемого исключения
Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
 */
public class MyOwnCheckedExceptionTask {
    public static void main(String[] args) {
        try {
            checkAge(151);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Некорректный возраст");
        }
        System.out.println("С возрастом все хорошо");
    }
}
