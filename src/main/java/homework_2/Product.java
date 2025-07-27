package homework_2;

public class Product {
    String name;
    double price;

    Product(double somePrice) {
        this.price = somePrice;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(int discount) {
        this.price = this.price * (1 - discount / 100.00);
    }

    void printInfo() {
        System.out.println("У товара " + this.name + " цена: " + this.price);
    }
}
