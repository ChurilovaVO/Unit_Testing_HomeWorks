package hw.Test_2;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по цене список продуктов
     */
    public List<Product> sortProductsByPrice(List<Product> products, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = products.get((startPosition + endPosition) / 2).getCost();
        do {
            while (products.get(leftPosition).getCost() < pivot) {
                leftPosition++;
            }
            while (products.get(rightPosition).getCost() > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    Product temp = products.get(leftPosition);
                    products.set(leftPosition, products.get(rightPosition));
                    products.set(rightPosition, temp);
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);
        if (leftPosition < endPosition) {
            sortProductsByPrice(products, leftPosition, endPosition);
        }
        if (startPosition < rightPosition) {
            sortProductsByPrice(products, startPosition, rightPosition);
        }
        return products;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        Product mostExpensiveProduct = products.get(0);
        for (int i = 1; i < products.size(); i++) {
            if (products.get(i).getCost() > mostExpensiveProduct.getCost()) {
                mostExpensiveProduct = products.get(i);
            }
        }
        return mostExpensiveProduct;
    }
}