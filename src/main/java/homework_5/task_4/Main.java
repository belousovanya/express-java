package homework_5.task_4;

public class Main {
    public static void main(String[] args) {
        SeaCreature shark = new Shark();
        SeaCreature starfish = new Starfish();
        Aquarium aquarium = new Aquarium();

        aquarium.addSeaCreature(shark);
        aquarium.showMovement();

        aquarium.addSeaCreature(starfish);
        aquarium.showMovement();
    }



}
