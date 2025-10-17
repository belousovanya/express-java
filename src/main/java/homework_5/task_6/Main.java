package homework_5.task_6;

public class Main {
    public static void main(String[] args) {
        Plant orchid = new Orchid();
        Plant cactus = new Cactus();
        BotanicalGarden botanicalGarden = new BotanicalGarden();

        botanicalGarden.addPlant(orchid);
        botanicalGarden.maintainPlant();

        botanicalGarden.addPlant(cactus);
        botanicalGarden.maintainPlant();
    }
}
