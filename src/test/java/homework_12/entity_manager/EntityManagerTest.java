package homework_12.entity_manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {
    /**
     * Добавление — объект появился, размер увеличился на один.
     * Удаление существующего — вернулось true, объект исчез.
     * Удаление отсутствующего — вернулось false, список не изменился.
     * Фильтрация по возрасту — вернулись только подходящие пользователи.
     * Фильтрация по имени — вернулись только пользователи с нужным именем.
     * Фильтрация по активности — вернулись только пользователи с нужным статусом.
     */

    private EntityManager<User> manager;

    @BeforeEach
    public void setupTest() {
        manager = new EntityManager<>();
    }

    @Test
    public void userCanAddUserToCollection() {
        User user = new User("Аня", 31, true);
        int initialSize = manager.getAll().size();

        manager.add(user);

        User actualUser = manager.getAll().get(0);
        User expectedUser = new User("Аня", 31, true);

        int actualSize = manager.getAll().size();

        assertEquals(expectedUser, actualUser);
        assertEquals(initialSize + 1, actualSize);
    }

    @Test
    public void userCanDeleteExistingUser() {
        User user = new User("Аня", 31, true);
        manager.add(user);

        int initialSize = manager.getAll().size();

        boolean removed = manager.remove(user);

        boolean userStillExist = manager.getAll().contains(user);

        int actualSize = manager.getAll().size();

        assertTrue(removed);
        assertFalse(userStillExist);
        assertEquals(initialSize - 1, actualSize);
    }

    @Test
    public void userCanNotDeleteNonExistentUser() {
        User existingUser = new User("Аня", 31, true);
        manager.add(existingUser);

        User missingUser = new User("Оля", 25, false);
        List<User> initialUsers = manager.getAll();

        boolean removed = manager.remove(missingUser);
        List<User> actualUsers = manager.getAll();

        assertFalse(removed);
        assertEquals(initialUsers, actualUsers);
    }

    @Test
    public void userCanFilterAge() {
        User youngerUser = new User("Ира", 19, true);
        User minUser = new User("Оля", 20, true);
        User middleUser = new User("Аня", 25, true);
        User maxUser = new User("Маша", 30, false);
        User older = new User("Лена", 31, false);

        manager.add(youngerUser);
        manager.add(minUser);
        manager.add(middleUser);
        manager.add(maxUser);
        manager.add(older);

        List<User> expectedUsers = List.of(minUser, middleUser, maxUser);

        List<User> actualUsers = manager.filterByAge(20, 30);

        assertEquals(expectedUsers, actualUsers);
    }

    @Test
    public void userCanFilterName() {
        User user1 = new User("Аня", 31, true);
        User user2 = new User("Аня", 34, false);
        User user3 = new User("Петя", 25, false);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);

        List<User> expectedUsers = List.of(user1, user2);

        List<User> actualUsers = manager.filterByName("аня");

        assertEquals(expectedUsers, actualUsers);
    }

    @Test
    public void userCanFilterActivity() {
        User user1 = new User("Аня", 31, true);
        User user2 = new User("Аня", 34, false);
        User user3 = new User("Петя", 25, false);

        manager.add(user1);
        manager.add(user2);
        manager.add(user3);

        List<User> expectedUsers = List.of(user2, user3);

        List<User> actualUsers = manager.filterByActivity(false);

        assertEquals(expectedUsers, actualUsers);

    }

    @Test
    public void userCanSureThatConcurrentEntitiesAreNotLost() throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        try {
            List<User> expectedUsers = new ArrayList<>();
            List<Callable<Void>> tasks = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                User user = new User("Пользователь " + i, 25, true);
                expectedUsers.add(user);

                tasks.add(() -> {
                    manager.add(user);
                    return null;
                });
            }

            List<Future<Void>> futureList = executorService.invokeAll(tasks);

            for (Future<Void> result : futureList) {
                result.get();
            }

            List<User> actualUsers = manager.getAll();

            assertEquals(expectedUsers.size(), actualUsers.size());
            assertTrue(actualUsers.containsAll(expectedUsers));


        } finally {
            executorService.shutdown();
        }
    }
}
