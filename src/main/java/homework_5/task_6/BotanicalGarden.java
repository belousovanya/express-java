package homework_5.task_6;

public class BotanicalGarden {

    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
    }

    public void maintainPlant() {
        plant.care();
    }
}
