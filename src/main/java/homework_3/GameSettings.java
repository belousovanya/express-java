package homework_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName) {
        this.gameName = gameName;
    }

    static void setMaxPlayers(int maxPlayers1) {
        maxPlayers = maxPlayers1;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }

    void printGameStatus() {
        System.out.println("Название: " + gameName + ", текущее кол-во игроков: " + currentPlayers
                + ", максимальное кол-во игроков: " + maxPlayers);
    }
}
