package homework_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsAnagramTest extends Homework10MethodsTest {
    /**
     * Позитивные кейсы:
     * - Обычные анаграммы: "listen", "silent" -> true
     * - Разный регистр и пробелы: "A gentleman", "Elegant man" -> true
     * Негативные кейсы:
     * - Разные слова: "java", "python" -> false
     * - Разное количество букв: "abc", "ab" -> false
     * Corner cases:
     * - null, "word" -> false
     * - "word", null -> false
     */

    @ParameterizedTest(name = "Кейс {index}: слово {0} является анаграммой {1}")
    @CsvSource({
            "'listen', 'silent'",
            "'A gentleman', 'Elegant man'"
    })
    public void userCanCheckIfWordIsAnagram(String initialWord1, String initialWord2) {
        boolean actualResult = methods.isAnagram(initialWord1, initialWord2);

        assertTrue(actualResult);
    }

    @ParameterizedTest(name = "Кейс {index}: слово {0} не является анаграммой {1}")
    @CsvSource(
            value = {
                    "'java', 'python'",
                    "'abc', 'ab'",
                    "null, 'word'",
                    "'word', null"
            },
            nullValues = "null"
    )
    public void userCanNotCheckIfWordIsAnagram(String initialWord1, String initialWord2) {
        boolean actualResult = methods.isAnagram(initialWord1, initialWord2);

        assertFalse(actualResult);
    }
}