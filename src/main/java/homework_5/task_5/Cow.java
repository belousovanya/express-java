package homework_5.task_5;

public class Cow extends FarmAnimal {

    @Override
    public void feed() {
        System.out.println("Корова кормится");
    }

    @Override
    public void care() {
        System.out.println("Корова нуждается в выпасе");
    }

    @Override
    public void produce() {
        System.out.println("Корова дает молоко");
    }
}
