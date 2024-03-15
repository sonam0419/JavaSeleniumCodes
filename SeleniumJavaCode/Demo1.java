package SeleniumJavaCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product1 {
    String name;
    double price;

    public Product1(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Demo1 {

    // Function to find the lowest priced product in a given category
    public static double findLowestPrice(Map<String, Product1[]> products, String category) {
        double lowestPrice = Double.MAX_VALUE;
        boolean found = false;

        if (products.containsKey(category)) {
            for (Product1 product : products.get(category)) {
                if (product.price < lowestPrice) {
                    lowestPrice = product.price;
                    found = true;
                }
            }
        }

        if (found) {
            return lowestPrice;
        } else {
            return -1; // Indicates that the category does not exist
        }
    }

    public static void main(String[] args) {
        // Sample data
        Map<String, Product1[]> products = new HashMap<>();
        products.put("Electronics", new Product1[]{new Product1("Laptop", 899.99), new Product1("Smartphone", 499.99)});
        products.put("Clothing", new Product1[]{new Product1("T-shirt", 19.99), new Product1("Jeans", 39.99)});
        products.put("Books", new Product1[]{new Product1("Novel", 12.99), new Product1("Textbook", 59.99)});

        Scanner scanner = new Scanner(System.in);

        // Prompt user for category
        System.out.print("Enter the category: ");
        String category = scanner.nextLine();

        // Find lowest priced product in the given category
        double lowestPrice = findLowestPrice(products, category);

        // Print the result
        if (lowestPrice != -1) {
            System.out.println("Lowest price in category " + category + ": $" + lowestPrice);
        } else {
            System.out.println("Category " + category + " does not exist.");
        }
    }
}
