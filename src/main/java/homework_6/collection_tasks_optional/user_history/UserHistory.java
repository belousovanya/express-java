package homework_6.collection_tasks_optional.user_history;

import java.util.ArrayDeque;
import java.util.Deque;

/*
5. История действий пользователя
Задача:
Хранить действия пользователя для отмены и повтора.
 */
public class UserHistory {
    private Deque<String> history = new ArrayDeque<>();
    private Deque<String> redoActions = new ArrayDeque<>();

    public void addUserAction(String action) {
        history.push(action);
        redoActions.clear();
    }

    public void undoUserAction() {
        if (!history.isEmpty()) {
            String action = history.pop();
            redoActions.push(action);
        }
    }

    public void redoUserAction() {
        if (!redoActions.isEmpty()) {
            String action = redoActions.pop();
            history.push(action);
        }
    }

    public void printActions() {
        System.out.println("Действия в истории:");
        history.forEach(System.out::println);
        System.out.println("Действия для повтора:");
        redoActions.forEach(System.out::println);
    }
}
