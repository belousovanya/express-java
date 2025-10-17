package homework_5.task_5;

public class Main {
    public static void main(String[] args) {
        FarmAnimal cow = new Cow();
        FarmAnimal chicken = new Chicken();
        Farm farm = new Farm();

        farm.addFarmAnimal(chicken);
        farm.manageFarmAnimal();

        farm.addFarmAnimal(cow);
        farm.manageFarmAnimal();
    }
}
