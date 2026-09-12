package homework_6.bracket_validator;

import java.util.ArrayDeque;
import java.util.Deque;

/*
7. Проверка корректности скобочной последовательности
Задача:
Определить, правильно ли расставлены скобки.
 */
public class BracketValidator {

    public boolean isValid(String text) {
        Deque<Character> brackets = new ArrayDeque<>();

        for (char bracket : text.toCharArray()) {

            if (bracket == '(' || bracket == '{' || bracket == '[') {
                brackets.push(bracket);
                continue;
            }

            if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (brackets.isEmpty()) {
                    return false;
                }
            }

            char openBracket = brackets.pop();

            switch (bracket) {
                case ')':
                    if (openBracket != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (openBracket != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (openBracket != '[') {
                        return false;
                    }
                    break;
            }
        }
        return brackets.isEmpty();
    }
}