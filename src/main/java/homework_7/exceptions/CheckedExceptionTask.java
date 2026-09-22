package homework_7.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
1. Обработка проверяемого исключения
Условие задачи:
Напишите программу, которая пытается открыть файл с именем "data.txt". Если файл не найден,
программа должна обработать исключение и вывести сообщение: "Файл не найден".
 */
public class CheckedExceptionTask {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Файл " + e.getMessage() + " не найден");
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии файла: " + e.getMessage());
            }
        }
    }
}
