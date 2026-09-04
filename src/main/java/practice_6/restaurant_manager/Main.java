package practice_6.restaurant_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManger manager = new RestaurantManger();

        manager.addNewOrder("Картошка фри");
        manager.addNewOrder("Спагетти");
        manager.addNewOrder("Маргарита");
        manager.printOrders();

        manager.deleteOrder("Спагетти");
        manager.printOrders();
    }
}
