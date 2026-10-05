package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmailTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - "test@example.com" -> true
     * - "user.name@domain.co" -> true
     * - "a@b.cc" -> true
     * Негативные кейсы:
     * - "bad@.com" -> false
     * - "no-at-symbol" -> false
     * - "@missing-user.com" -> false
     * - "user@domain" -> false
     * Corner cases:
     * - "" -> false
     * - null -> false
     */

    @ParameterizedTest(name = "Кейс {index}: email {0} — корректный")
    @ValueSource(strings = {
            "test@example.com",
            "user.name@domain.co",
            "a@b.cc"
    })
    public void userCanCheckEmail(String initialEmail) {
        boolean actualResult = methods.isValidEmail(initialEmail);

        assertTrue(actualResult);
    }

    @ParameterizedTest(name = "Кейс {index}: email {0} — некорректный")
    @NullAndEmptySource
    @ValueSource(strings = {
            "bad@.com",
            "no-at-symbol",
            "@missing-user.com",
            "user@domain"
    })
    public void userCanNotCheckEmail(String initialEmail) {
        boolean actualResult = methods.isValidEmail(initialEmail);

        assertFalse(actualResult);
    }
}
