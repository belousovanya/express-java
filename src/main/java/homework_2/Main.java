package homework_2;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car("BMW", 2008);

        bmw.setYear(2009);
        bmw.print();

        Rectangle rectangle = new Rectangle(2.5, 3.5);

        rectangle.setWidth(2);
        rectangle.calculateArea();

        Book idiot = new Book("Достоевскиииий", "Идиот");

        idiot.setAuthor("Достоевский");
        idiot.printInfo();

        BankAccount myAccount = new BankAccount("Анна");

        myAccount.deposit(1000000);
        myAccount.withdraw(1);

        myAccount.printBalance();

        Point point = new Point(4);

        point.setX(5);
        point.print();

        StudentGroup sg = new StudentGroup("Инженеры", 24);

        sg.setStudentCount(26);
        sg.printInfo();

        Circle circle = new Circle(3);

        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Длина окружности: " + circle.calculateCircumference());

        Teacher mariaIvanovna = new Teacher("Мария Ивановна", "Физика");

        mariaIvanovna.setSubject("Информатика");
        mariaIvanovna.print();

        Product milk = new Product(10);

        milk.setPrice(100);
        milk.applyDiscount(5);
        milk.printInfo();

        Laptop dell = new Laptop("Dell", 400);

        dell.setPrice(500);
        dell.printInfo();

    }
}
