package homework_5.task_2;

public class Cat extends Pet {
    @Override
    public void feed() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    public void interact() {
        System.out.println("Кошка играет");
    }
}
