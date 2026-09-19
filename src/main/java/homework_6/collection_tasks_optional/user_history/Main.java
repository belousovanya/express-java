package homework_6.collection_tasks_optional.user_history;

public class Main {
    public static void main(String[] args) {
        UserHistory userHistory = new UserHistory();

        userHistory.addUserAction("Написал текст");
        userHistory.addUserAction("Добавил фото");
        userHistory.addUserAction("Удалил сообщение");
        userHistory.addUserAction("Переслал сообщение");
        userHistory.addUserAction("Написал букву Ы");

        userHistory.printActions();

        userHistory.undoUserAction();
        userHistory.printActions();

        userHistory.redoUserAction();
        userHistory.printActions();
    }
}
