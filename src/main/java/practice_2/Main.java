package practice_2;

import homework_2.Rectangle;

public class Main {
    public static void main(String[] args) {
        // проверка конструктора по умолчанию

        Student petya = new Student(18, "Петя");

        petya.print();

        Student kolya = new Student(20, "Коля");

        kolya.print();

//        petya.setName("Пётр");
        petya.name = "Пётр";

        petya.print();

//        kolya.setAge(21);
        kolya.age = 21;
        kolya.print();



    }
}
