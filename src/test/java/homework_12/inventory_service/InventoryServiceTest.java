package homework_12.inventory_service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    /**
     * Добавление: товар сохраняется в своей категории.
     * Закрытый склад: добавление вызывает IllegalStateException, товар не сохраняется.
     * Получение: возвращается последний добавленный товар категории и удаляется со склада.
     * Отсутствующая категория: выбрасывается OutOfStockException.
     * Товары закончились: после получения всех товаров выбрасывается OutOfStockException.
     * Фильтрация по категории: возвращаются только товары нужной категории, без учёта регистра.
     * Неизвестная категория при фильтрации: возвращается пустой список.
     * Фильтрация по цене: возвращаются товары в диапазоне, включая обе границы.
     * Нет товаров в диапазоне цен: возвращается пустой список.
     */

    private InventoryService inventoryService;

    @BeforeEach
    public void setupTest() {
        inventoryService = new InventoryService();
        InventoryService.setIsInventoryOpen(true);
    }

    @Test
    public void userCanAddProductWithCategory() {
        Product product = new Product("Молоко", new BigDecimal("100.5"), "Продукты");

        inventoryService.addProduct(product);

        List<Product> expectedProducts = List.of(product);
        List<Product> actualProducts = inventoryService.filterProductsByCategory("Продукты");

        assertEquals(expectedProducts, actualProducts);
    }

    @Test
    public void userCanNotAddProductWithClosedWarehouse() {
        InventoryService.setIsInventoryOpen(false);

        Product product = new Product("Молоко", new BigDecimal("100.5"), "Продукты");

        assertThrows(IllegalStateException.class,
                () -> inventoryService.addProduct(product)
        );
        assertTrue(
                inventoryService.filterProductsByCategory("Продукты").isEmpty()
        );
    }

    @Test
    public void userCanGetAndDeleteLastProduct() {
        Product product1 = new Product("Молоко", new BigDecimal("100.5"), "Продукты");
        Product product2 = new Product("Хлеб", new BigDecimal("25"), "Продукты");
        Product product3 = new Product("Колбаса", new BigDecimal("255"), "Продукты");
        Product product4 = new Product("Сыр", new BigDecimal("354"), "Продукты");

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);
        inventoryService.addProduct(product3);
        inventoryService.addProduct(product4);

        Product expectedProduct = product4;
        Product actualProduct =
                inventoryService.getProductByCategory("Продукты");

        assertEquals(expectedProduct, actualProduct);


        List<Product> expectedResult = List.of(product1, product2, product3);
        List<Product> actualResult = inventoryService.filterProductsByCategory("Продукты");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanNotGetProductsWhenCategoryDoesNotExist() {
        Product product = new Product("Молоко", new BigDecimal("100.5"), "Продукты");

        inventoryService.addProduct(product);

        assertThrows(OutOfStockException.class,
                () -> inventoryService.getProductByCategory("Электроника")
        );
    }

    @Test
    public void userCanNotGetProductsWhenProductsOutOfStock() {
        Product product = new Product("Молоко", new BigDecimal("100.5"), "Продукты");

        inventoryService.addProduct(product);

        inventoryService.getProductByCategory("Продукты");

        assertThrows(OutOfStockException.class,
                () -> inventoryService.getProductByCategory("Продукты")
        );
    }

    @Test
    public void userCanFilterProductByCategory() {
        Product product1 = new Product("Молоко", new BigDecimal("100.5"), "Продукты");
        Product product2 = new Product("Хлеб", new BigDecimal("25"), "Продукты");
        Product product3 = new Product("Ноутбук", new BigDecimal("255000"), "Электроника");
        Product product4 = new Product("Телефон", new BigDecimal("100000"), "Электроника");

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);
        inventoryService.addProduct(product3);
        inventoryService.addProduct(product4);

        List<Product> expectedProductList = List.of(product1, product2);
        List<Product> actualProductList = inventoryService.filterProductsByCategory("продукты");

        assertEquals(expectedProductList, actualProductList);
    }

    @Test
    public void userCanNotFilterByUnknownCategory() {
        Product product = new Product("Молоко", new BigDecimal("100.5"), "Продукты");

        inventoryService.addProduct(product);

        List<Product> expectedProductList = List.of();
        List<Product> actualProductList = inventoryService.filterProductsByCategory("Электроника");

        assertEquals(expectedProductList, actualProductList);
    }

    @Test
    public void userCanFilterPriceWithinRange() {
        Product product1 = new Product("Молоко", new BigDecimal("100"), "Продукты");
        Product product2 = new Product("Хлеб", new BigDecimal("25"), "Продукты");
        Product product3 = new Product("Колбаса", new BigDecimal("250"), "Продукты");
        Product product4 = new Product("Сыр", new BigDecimal("350"), "Продукты");

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);
        inventoryService.addProduct(product3);
        inventoryService.addProduct(product4);

        List<Product> expectedProductList = List.of(product1, product2);
        List<Product> actualProductList = inventoryService.filterProductsByPrice(new BigDecimal("25"), new BigDecimal("100"));

        assertEquals(expectedProductList, actualProductList);
    }

    @Test
    public void userCanNotFilterOutPricesOutsideRange() {
        Product product1 = new Product("Молоко", new BigDecimal("100"), "Продукты");
        Product product2 = new Product("Хлеб", new BigDecimal("25"), "Продукты");
        Product product3 = new Product("Колбаса", new BigDecimal("250"), "Продукты");
        Product product4 = new Product("Сыр", new BigDecimal("350"), "Продукты");

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);
        inventoryService.addProduct(product3);
        inventoryService.addProduct(product4);

        List<Product> expectedProductList = List.of();
        List<Product> actualProductList = inventoryService.filterProductsByPrice(new BigDecimal("351"), new BigDecimal("1000"));

        assertEquals(expectedProductList, actualProductList);
    }
}
