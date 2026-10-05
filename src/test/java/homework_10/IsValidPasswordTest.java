package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidPasswordTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Корректный пароль: "Password1" -> true
     * - Ровно восемь символов: "Abcdefg1" -> true
     * Негативные кейсы:
     * - Слишком короткий пароль: "pass" -> false
     * - Корректный пароль, но состоит из 7 символов: "Abcdef1" -> false
     * - Нет заглавной буквы: "password1" -> false
     * - Нет цифры: "Password" -> false
     * Corner cases:
     * - Пустая строка: "" -> false
     * - null -> false
     */


    @ParameterizedTest(name = "Кейс {index}: пароль {0} - валидный")
    @ValueSource(strings = {
            "Password1",
            "Abcdefg1"
    })
    public void userCanCheckIfPasswordIsValid(String initialPassword) {
        boolean actualResult = methods.isValidPassword(initialPassword);

        assertTrue(actualResult);
    }

    @ParameterizedTest(name = "Кейс {index}: пароль {0} - невалидный")
    @NullAndEmptySource
    @ValueSource(strings = {
            "pass",
            "password1",
            "Password",
            "Abcdef1"
    })
    public void userCanNotCheckIfPasswordIsValid(String initialPassword) {
        boolean actualResult = methods.isValidPassword(initialPassword);

        assertFalse(actualResult);
    }
}