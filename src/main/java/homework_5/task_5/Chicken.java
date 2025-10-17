package homework_5.task_5;

public class Chicken extends FarmAnimal {
    @Override
    public void feed() {
        System.out.println("Курица ест зерно");
    }

    @Override
    public void care() {
        System.out.println("Курица нуждается в кормушке");
    }

    @Override
    public void produce() {
        System.out.println("Курица несет яйца");
    }
}
