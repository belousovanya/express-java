package homework_5.task_3;

public class HotDish extends Dish {

    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getDescription() {
        return "Горячее блюдо температурой " + temperature + "°C";
    }
}
