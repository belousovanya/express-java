package homework_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Обычная строка: "Hello world" -> 2
     * - Несколько пробелов между словами: "Java   is  awesome" -> 3
     * - Пробелы по краям строки: " Java is awesome " -> 3
     * Негативные кейсы:
     * - null -> NullPointerException
     * Corner cases:
     * - Пустая строка: "" -> 0
     * - Строка из пробелов: " " -> 0
     */

    @ParameterizedTest(name = "Кейс {index}: количество слов в строке «{0}» - {1}")
    @CsvSource({
            // Позитивные кейсы
            "'Hello world', 2",
            "'Java   is  awesome', 3",
            "' Java is awesome ', 3",
            // Corner cases
            "'', 0",
            "' ', 0"
    })
    public void userCanCountWordsInSentence(String initialSentence, int expectedResult) {
        int actualResult = methods.countWords(initialSentence);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userNotCountWordsInSentence() {
        assertThrows(NullPointerException.class,
                () -> methods.countWords(null)
        );
    }
}
