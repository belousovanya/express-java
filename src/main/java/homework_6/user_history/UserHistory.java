package homework_6.user_history;

import java.util.ArrayDeque;
import java.util.Deque;

/*
5. История действий пользователя
Задача:
Хранить действия пользователя для отмены и повтора.
 */
public class UserHistory {
    private Deque<String> history = new ArrayDeque<>();
    private Deque<String> repeatedActions = new ArrayDeque<>();

    public void addUserAction(String action) {
        history.push(action);
    }

    public void undoUserAction() {
        String action = history.pop();
        repeatedActions.push(action);
    }

    public void redoUserAction() {
        String action = repeatedActions.pop();
        history.push(action);
    }

    public void printActions() {
        System.out.println("Действия в истории:");
        history.forEach(System.out::println);

        System.out.println("Действия в повторённых действиях:");
        repeatedActions.forEach(System.out::println);
    }

}
