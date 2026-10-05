package homework_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidPhoneNumberTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - "+1 1234567890" -> true
     * - "+44 9876543210" -> true
     * - "+999 1111111111" -> true
     * Негативные кейсы:
     * - "12345" -> false
     * - "invalid" -> false
     * - "+1 abcdefghij" -> false
     * - "+1234 1234567890" -> false
     * - "+1 123" -> false
     * Corner cases:
     * - "" -> false
     * - null -> NullPointerException
     */

    @ParameterizedTest(name = "Кейс {index}: номер телефона {0} - корректный")
    @ValueSource(strings = {
            "+1 1234567890",
            "+44 9876543210",
            "+999 1111111111"
    })
    public void userCanCheckPhoneNumber(String phoneNumber) {
        boolean actualResult = methods.isValidPhoneNumber(phoneNumber);

        assertTrue(actualResult);
    }

    @ParameterizedTest(name = "Кейс {index}: номер телефона {0} - некорректный")
    @ValueSource(strings = {
            "12345",
            "invalid",
            "+1 abcdefghij",
            "+1234 1234567890",
            "+1 123",
            ""
    })
    public void userCanNotCheckPhoneNumber(String initialPhoneNumber) {
        boolean actualResult = methods.isValidPhoneNumber(initialPhoneNumber);

        assertFalse(actualResult);
    }

    @Test
    public void userCanNotCheckPhoneNumberWithNull() {
        assertThrows(NullPointerException.class,
                () -> methods.isValidPhoneNumber(null));
    }
}