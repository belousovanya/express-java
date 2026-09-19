package practice_7.errors;

public class StackOverflowErrorExample {
    public static void recursivePrint(int num) {
        System.out.println(num);
        recursivePrint(num + 1);
    }

    public static void main(String[] args) {
        recursivePrint(1);
    }
}
