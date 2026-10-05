package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidJsonTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Корректный JSON-объект: {"key":"value"} -> true
     * - Объект с массивом: {"a":[1,2]} -> true
     * Негативные кейсы:
     * - Обычный текст: "invalid json" -> false
     * - Некорректный JSON: {"key":} -> false
     * Corner cases:
     * - null -> false
     * - Корректный JSON-массив: [] -> true
     */

    @ParameterizedTest(name = "Кейс {index}: JSON {0} корректный")
    @ValueSource(strings = {
            // Позитивные кейсы:
            "{\"key\":\"value\"}",
            "{\"a\":[1,2]}",
            // Corner cases:
            "[]"
    })
    public void userCanCheckIfJsonIsValid(String initialJson) {
        boolean actualResult = methods.isValidJson(initialJson);

        assertTrue(actualResult);
    }

    @ParameterizedTest(name = "Кейс {index}: JSON {0} некорректный")
    @NullSource
    @ValueSource(strings = {
            // Негативные кейсы:
            "invalid json",
            "{\"key\":}"
    })
    public void userCanNotCheckIfJsonIsValid(String initialJson) {
        boolean actualResult = methods.isValidJson(initialJson);

        assertFalse(actualResult);
    }
}
