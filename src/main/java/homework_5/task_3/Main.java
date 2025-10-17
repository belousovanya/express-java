package homework_5.task_3;

public class Main {
    public static void main(String[] args) {
        Dish borshch = new HotDish(70);
        Dish coffee = new Drink(220);
        Menu menu = new Menu();

        menu.addDish(borshch);
        menu.addDish(coffee);

        menu.printMenu();
    }
}
