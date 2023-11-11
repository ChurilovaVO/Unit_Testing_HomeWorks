package hw.Test_2;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    public static void main(String[] args) {
        Product chocolate = new Product(35, "Chocolate");
        Product milk = new Product(120, "milk");
        Product water = new Product(46, "Water");
        Product juse = new Product(14, "Juse");
        Product chips = new Product(89, "Chips");
        Product oil = new Product(52, "Oil");

        List<Product> products = new ArrayList<>();
        products.add(chocolate);
        products.add(milk);
        products.add(water);
        products.add(juse);
        products.add(chips);
        products.add(oil);

        for (Product product:products) {
            System.out.println(product);
        }
        System.out.println();
        Shop shop = new Shop(products);
        shop.sortProductsByPrice(products, 0, products.size()-1);
        for (Product product:products) {
            System.out.println(product);
        }
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        System.out.println();
        System.out.println(mostExpensiveProduct);

        /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */

        //Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
        assertThat(shop.getProducts()).hasSize(6);
        assertThat(shop.getProducts().toString()).contains("milk","Water", "Chocolate","Juse","Chips","Oil");

       // 2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
        assertThat(shop.getMostExpensiveProduct().getTitle()).isEqualTo("milk");
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(120);

        //3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
        assertThat(shop.sortProductsByPrice(products, 0, products.size()-1))
                .hasSize(6);
        assertThat(shop.sortProductsByPrice(products, 0, products.size()-1).get(0).getCost()).isEqualTo(14);
        assertThat(shop.sortProductsByPrice(products, 0, products.size()-1).get(products.size()-1).getCost()).isEqualTo(120);

    }


}




