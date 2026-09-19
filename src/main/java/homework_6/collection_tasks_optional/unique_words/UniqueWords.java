package homework_6.collection_tasks_optional.unique_words;

import java.util.HashSet;
import java.util.Set;

/*
8. Уникальные слова в тексте
Задача:
Получить все уникальные слова и их количество.
 */
public class UniqueWords {
    Set<String> words = new HashSet<>();

    public void addWord(String text) {
        String[] wordsArray = text.toLowerCase().trim().split("\\s+");

        for (String word : wordsArray) {
            words.add(word);
        }
    }

    public void printWordsInfo() {
        System.out.println("Уникальные слова: " + words);
        System.out.println("Количество слов: " + words.size());
    }
}
