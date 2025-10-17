package homework_5.task_5;

public class Farm {

    private FarmAnimal farmAnimal;

    public void addFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
    }

    public void manageFarmAnimal() {
        farmAnimal.care();
        farmAnimal.feed();
        farmAnimal.produce();
    }
}
