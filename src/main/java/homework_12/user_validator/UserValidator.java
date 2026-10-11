package homework_12.user_validator;

public class UserValidator {
    private static boolean validationEnabled = true;
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 100;

    public static void setValidationEnabled(boolean enabled) {
        validationEnabled = enabled;
    }

    public void checkUsersName(User user) {
        if (!validationEnabled) {
            return;
        }
        String name = user.getName();

        if (name == null || name.isEmpty()
                || !Character.isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("Имя " + name + " невалидно");
        }
    }

    public void checkUsersAge(User user) {
        if (!validationEnabled) {
            return;
        }

        int age = user.getAge();

        if (age < MIN_AGE) {
            throw new InvalidUserException("Возраст " + age + " меньше минимального " + MIN_AGE + " лет!");
        }
        if (age > MAX_AGE) {
            throw new InvalidUserException("Возраст " + age + " больше максимального " + MAX_AGE + " лет!");
        }
    }

    public void checkUsersEmail(User user) {
        if (!validationEnabled) {
            return;
        }

        String email = user.getEmail();

        if (email == null || email.isEmpty()
                || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidUserException("Email " + email + " некорректен");
        }
    }
}
