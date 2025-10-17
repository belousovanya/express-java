package homework_5.task_2;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        Owner owner = new Owner();

        owner.add(dog);
        owner.handlePet();

        owner.add(cat);
        owner.handlePet();
    }
}
