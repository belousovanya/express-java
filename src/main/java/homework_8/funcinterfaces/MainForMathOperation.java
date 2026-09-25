package homework_8.funcinterfaces;

public class MainForMathOperation {
    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mutl = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;

        System.out.println(add.operate(1, 2));
        System.out.println(sub.operate(2, 1));
        System.out.println(mutl.operate(1, 2));
        System.out.println(div.operate(12, 2));

    }
}
