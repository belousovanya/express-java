package homework_8.funcinterfaces;

/*
2. Использование анонимного класса
Задача: Создайте анонимный класс, реализующий интерфейс Runnable,
который выводит сообщение "Hello from anonymous class!".
 */
public class MainForAnonClass {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();
    }
}