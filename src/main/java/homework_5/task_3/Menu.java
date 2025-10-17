package homework_5.task_3;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void printMenu() {
        for (Dish dish : dishes) {
            System.out.println(dish.getDescription());
        }
    }
}
