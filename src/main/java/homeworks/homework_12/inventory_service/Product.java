package homeworks.homework_12.inventory_service;

import java.math.BigDecimal;

public class Product {
    private final String name;
    private final BigDecimal price;
    private final String category;

    public Product(String name, BigDecimal price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
