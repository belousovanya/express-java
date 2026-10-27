package homeworks.homework_12.user_validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {
    /**
     * имя: корректное, null, пустое, с маленькой буквы;
     * возраст: 17, 18, 100, 101;
     * email: корректный, null, пустой, без @, с неправильным доменом;
     * выключенная валидация: некорректные данные не вызывают исключение.
     */

    private UserValidator validator;

    @BeforeEach
    public void setupTest() {
        validator = new UserValidator();
        UserValidator.setValidationEnabled(true);
    }

    @Test
    public void userCanCheckValidName() {
        User user = new User("Анна", 31, "anna@anna.ru");

        assertDoesNotThrow(() -> validator.checkUsersName(user));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"аня"})
    public void userCanNotCheckInvalidName(String name) {
        User user = new User(name, 31, "anna@anna.ru");

        assertThrows(InvalidUserException.class,
                () -> validator.checkUsersName(user)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 100})
    public void userCanCheckValidAge(int age) {
        User user = new User("Анна", age, "anna@anna.ru");

        assertDoesNotThrow(() -> validator.checkUsersAge(user));
    }

    @ParameterizedTest
    @ValueSource(ints = {17, 101})
    public void userCanNotCheckInvalidAge(int age) {
        User user = new User("Анна", age, "anna@anna.ru");

        assertThrows(InvalidUserException.class,
                () -> validator.checkUsersAge(user)
        );
    }

    @Test
    public void userCanCheckValidEmail() {
        User user = new User("Анна", 31, "anna@anna.ru");

        assertDoesNotThrow(() -> validator.checkUsersEmail(user));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {
            "anna.anna",
            "anna@.ru"
    })
    public void userCanNotCheckInvalidEmail(String email) {
        User user = new User("Анна", 31, email);

        assertThrows(InvalidUserException.class,
                () -> validator.checkUsersEmail(user)
        );
    }

    @Test
    public void userCanCheckDataWhenValidationDisabled() {
        UserValidator.setValidationEnabled(false);
        User user = new User("анна", 17, "anna@.ru");

        assertDoesNotThrow(() -> validator.checkUsersName(user));
        assertDoesNotThrow(() -> validator.checkUsersAge(user));
        assertDoesNotThrow(() -> validator.checkUsersEmail(user));
    }
}