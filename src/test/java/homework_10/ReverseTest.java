package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Обычная строка: "hello" -> "olleh"
     * - Разные регистры: "Java" -> "avaJ"
     * - Пробел внутри строки: "a b" -> "b a"
     * Corner cases:
     * "" -> ""
     * "a" -> "a"
     * "abba" -> "abba"
     * " abc" -> "cba "
     * "12345" -> "54321"
     * Особый случай:
     * null -> null
     */

    public static Stream<Arguments> stringsForCases() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("Java", "avaJ"),
                Arguments.of("a b", "b a"),
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("abba", "abba"),
                Arguments.of(" abc", "cba "),
                Arguments.of("12345", "54321"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest(name = "Кейс {index}: reverse({0}) возвращает {1}")
    @MethodSource("stringsForCases")
    public void userCanReverseString(String initialString, String expectedString) {
        String actualString = methods.reverse(initialString);

        assertEquals(expectedString, actualString);
    }
}
