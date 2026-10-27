package homeworks.homework_12.inventory_service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    private Map<String, List<Product>> products = new HashMap<>();
    private static boolean isInventoryOpen = true;

    public static void setIsInventoryOpen(boolean isInventoryOpen) {
        InventoryService.isInventoryOpen = isInventoryOpen;
    }

    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            throw new IllegalStateException("Склад закрыт");
        }

        String category = product.getCategory();

        products.computeIfAbsent(category, key -> new ArrayList<>())
                .add(product);
    }

    public Product getProductByCategory(String category) {
        if (!products.containsKey(category)) {
            throw new OutOfStockException("Данная категория отсутствует");
        }

        List<Product> categoryProducts = products.get(category);

        if (categoryProducts == null || categoryProducts.isEmpty()) {
            throw new OutOfStockException(
                    "Товаров в категории " + category + " нет"
            );
        }

        return categoryProducts.removeLast();
    }

    public List<Product> filterProductsByCategory(String category) {
        return products.entrySet().stream()
                .filter(entry -> category.equalsIgnoreCase(entry.getKey()))
                .flatMap(entry -> entry.getValue().stream())
                .toList();
    }

    public List<Product> filterProductsByPrice(BigDecimal minPrice, BigDecimal maxPrice) {
        if (minPrice.compareTo(maxPrice) > 0) {
            throw new IllegalArgumentException(
                    "Минимальная цена больше максимальной"
            );
        }
        return products.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .filter(product -> product.getPrice().compareTo(minPrice) >= 0
                        && product.getPrice().compareTo(maxPrice) <= 0)
                .toList();
    }
}
