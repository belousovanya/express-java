package homework_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        // нельзя одновременно обходить коллекцию и что-то в ней удалять
        names.removeIf(name -> name.startsWith("A"));

        System.out.println(names);
    }
}
