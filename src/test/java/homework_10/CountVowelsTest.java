package homework_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * -Есть несколько гласных: "hello" -> 2
     * -Есть одинаковые гласные: "java" -> 2
     * -Написано большими буквами: "AEIOU" -> 5
     * -Нет гласных букв: "bcdfg" -> 0
     * Негативные кейсы:
     * -null -> IllegalArgumentException
     * Corner cases:
     * -"" -> 0
     * -"a" -> 1
     * -"b" -> 0
     */

    @ParameterizedTest(name = "Кейс {index}: countVowels({0}) возвращает {1}")
    @CsvSource({
            // Позитивные кейсы:
            "'hello', 2",
            "'java', 2",
            "'AEIOU', 5",
            "'bcdfg', 0",
            // Corner cases:
            "'', 0",
            "'a', 1",
            "'b', 0"
    })
    public void userCanCountVowels(String initialString, int expectedCountVowels) {
        int actualResult = methods.countVowels(initialString);

        assertEquals(expectedCountVowels, actualResult);
    }

    @Test
    public void userCanNotCountVowels() {
        assertThrows(
                IllegalArgumentException.class,
                () -> methods.countVowels(null)
        );
    }
}
