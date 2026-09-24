package practice_8.funcinterfaces;

public class MainForChecker {
    public static void main(String[] args) {
        Checker isPoitive = n -> n > 0;
        isPoitive.printIfValid(5);
        isPoitive.printIfValid(-1);
    }
}
