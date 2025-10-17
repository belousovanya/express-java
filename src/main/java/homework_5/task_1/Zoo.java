package homework_5.task_1;

public class Zoo {
    private Animal animal;

    public void add(Animal animal) {
        this.animal = animal;
        System.out.println("Животное добавлено");
    }

    public void showAnimalBehavior() {
        animal.move();
        animal.sound();
    }
}
