package homework_5.task_2;

public class Owner {

    private Pet pet;

    public void add(Pet pet) {
        this.pet = pet;
        System.out.println("Питомец добавлен");
    }

    public void handlePet() {
        pet.feed();
        pet.interact();
    }
}
