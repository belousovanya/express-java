package homework_7.generics.extra_tasks;

import java.util.*;

public class Main {

    // Storage task
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.setItem("Смартфон");
        System.out.println(stringStorage.getItem());

        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.setItem(123456);
        System.out.println(integerStorage.getItem());

        // printList task
        ListPrinter.printList(Arrays.asList(1, 2, 4));
        ListPrinter.printList(Arrays.asList("Java", "Python", "Golang"));

        // NumberBox task
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.add(1);
        integerNumberBox.add(2);
        integerNumberBox.add(3);

        System.out.println(integerNumberBox.getSum());

        NumberBox<Double> doubleNumberBox = new NumberBox<>();
        doubleNumberBox.add(2.5);
        doubleNumberBox.add(3.5);
        doubleNumberBox.add(4.0);

        System.out.println(doubleNumberBox.getSum());

        // SumCalculator task
        System.out.println(SumCalculator.sum(Arrays.asList(2, 2, 3)));
        System.out.println(SumCalculator.sum(Arrays.asList(2.5, 2.1, 3.5)));

        // IntegerAdder task
        List<Number> numbersList = new ArrayList<>();
        IntegerAdder.addNumbers(numbersList);
        System.out.println(numbersList);

        List<Integer> integerList = new ArrayList<>();
        IntegerAdder.addNumbers(integerList);
        System.out.println(integerList);

        // Container task
        MyContainer<String> stringContainer = new MyContainer<>();

        stringContainer.add("Привет!");
        System.out.println(stringContainer.get());

        MyContainer<Integer> integerContainer = new MyContainer<>();

        integerContainer.add(2);
        System.out.println(integerContainer.get());

        // MapPrinter task
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "Анна");
        integerStringMap.put(2, "Саша");

        MapPrinter.printMap(integerStringMap);

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Анна", 1);
        stringIntegerMap.put("Саша", 2);

        MapPrinter.printMap(stringIntegerMap);
    }
}
