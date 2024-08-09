package session_19.challenge.exercise_14;

import java.util.*;
import java.util.stream.Collectors;

public class TestProduct {
    // Given a list of products with attributes: name, category, and price; find the category with the highest average price.

    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Product("apple", Category.FRUITS, 5.2),
                new Product("butter", Category.DAIRY, 12.5),
                new Product("tomato", Category.VEGETABLES, 8.4),
                new Product("orange", Category.FRUITS, 7.2),
                new Product("milk", Category.DAIRY, 15.0),
                new Product("cucumber", Category.VEGETABLES, 5.0),
                new Product("cashew", Category.NUTS, 25.25),
                new Product("almond", Category.NUTS, 45.0),
                new Product("pasta", Category.GRAINS, 7.0),
                new Product("veal meat", Category.MEAT, 45.0),
                new Product("chicken meat", Category.MEAT, 28),
                new Product("rice", Category.GRAINS, 5)
        );

        Map<Category, Double> averagePricesByCategory = list.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));

        Optional<Map.Entry<Category, Double>> maxAveragePriceCategory = averagePricesByCategory.entrySet()
                .stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue));

        maxAveragePriceCategory.ifPresent(entry -> {
            System.out.println("Category with highest average price: " + entry.getKey());
            System.out.println("Average price: " + entry.getValue());
        });
    }
}