package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitStringTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Несколько частей: "Java,Python,C++", "," -> ["Java", "Python", "C++"]
     * - Две части: "Java,Python", "," -> ["Java", "Python"]
     * Corner cases:
     * - Пустая строка: "", "," -> [""]
     * - Разделителя нет: "word", "," -> ["word"]
     * - Разделитель в конце: "a,", "," -> ["a"]
     */

    public static Stream<Arguments> splitStringCases() {
        return Stream.of(
                // Позитивные кейсы:
                Arguments.of("Java,Python,C++", ",", new String[]{"Java", "Python", "C++"}),
                Arguments.of("Java,Python", ",", new String[]{"Java", "Python"}),
                // Corner cases:
                Arguments.of("", ",", new String[]{""}),
                Arguments.of("word", ",", new String[]{"word"}),
                Arguments.of("a,", ",", new String[]{"a"})
                );
    }

    @ParameterizedTest(name = "Кейс {index}: строка {0} с разделителем {1} превращается в массив {2}")
    @MethodSource("splitStringCases")
    public void userCanSplitString(String initilalString, String initialDelimiter, String[] expectedResult) {
        String[] actualResult = methods.splitString(initilalString, initialDelimiter);

        assertArrayEquals(expectedResult, actualResult);
    }
}
