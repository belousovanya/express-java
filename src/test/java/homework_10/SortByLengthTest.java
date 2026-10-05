package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortByLengthTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Строки разной длины: ["Java", "C", "Python"] -> ["C", "Java", "Python"]
     * Corner cases:
     * - Строки одинаковой длины: ["cc", "aa", "bb"] -> ["cc", "aa", "bb"]
     * - Пустой список: [] -> []
     */

    public static Stream<Arguments> sortByLengthCases() {
        return Stream.of(
                // Позитивные кейсы
                Arguments.of(List.of("Java", "C", "Python"), List.of("C", "Java", "Python")),
                // Corner cases:
                Arguments.of(List.of("cc", "aa", "bb"), List.of("cc", "aa", "bb")),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest(name = "Кейс {index}: список слов {0} превращается в {1}")
    @MethodSource("sortByLengthCases")
    public void userCanSortWordsByLenght(List<String> initialWords, List<String> expectedWords) {
        List<String> actualResult = methods.sortByLength(initialWords);

        assertEquals(expectedWords, actualResult);
    }
}