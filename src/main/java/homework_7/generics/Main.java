package homework_7.generics;

public class Main {
    public static void main(String[] args) {

        // Task Box
        Box<String> stringBox = new Box<>();
        stringBox.setObject("Коробка");
        System.out.println(stringBox.getObject());

        Box<Integer> integerBox = new Box<>();
        integerBox.setObject(3);
        System.out.println(integerBox.getObject());

        // Task ArrayPrinter

        String[] languages = {"Java", "Python", "JavaScript"};
        ArrayPrinter.printArray(languages);

        Integer[] numbers = {1, 2, 3};
        ArrayPrinter.printArray(numbers);

        // Task Pair

        Pair<String, Integer> pair = new Pair<>();
        pair.setFirst("First");
        pair.setSecond(2);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
