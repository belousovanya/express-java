package practice_5.task_1;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport plane = new Plane();
        Transport ship = new Ship();

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.control(car);
        dispatcher.printTransportDetails(car);

        dispatcher.control(plane);
        dispatcher.printTransportDetails(plane);

        dispatcher.control(ship);
        dispatcher.printTransportDetails(ship);
    }
}
