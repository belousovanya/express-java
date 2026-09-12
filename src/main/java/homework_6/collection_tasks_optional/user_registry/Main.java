package homework_6.collection_tasks_optional.user_registry;

public class Main {
    public static void main(String[] args) {
        UserRegistry registry = new UserRegistry();

        registry.addUser(101);
        registry.addUser(102);
        registry.addUser(103);
        registry.addUser(104);
        registry.addUser(105);

        System.out.println(registry.containsUser(105));

    }
}
