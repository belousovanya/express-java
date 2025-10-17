package homework_5.task_3;

public class Drink extends Dish {

    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public String getDescription() {
        return "Напиток обёмом " + volume + " мл";
    }
}
