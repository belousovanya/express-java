package homework_11;

public class DebugTask9 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        if (str1.equals(str2)) { // нужно сравнивать строки через equals(), а не через ==
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
