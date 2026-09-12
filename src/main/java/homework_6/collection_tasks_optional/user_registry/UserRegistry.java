package homework_6.collection_tasks_optional.user_registry;

import java.util.HashSet;
import java.util.Set;

/*
Задача:
Проверить, есть ли пользователь с заданным ID.
 */
public class UserRegistry {
    private Set<Integer> userIds = new HashSet<>();

    public void addUser(int id) {
        userIds.add(id);
    }

    public boolean containsUser(int id) {
        return userIds.contains(id);
    }
}
