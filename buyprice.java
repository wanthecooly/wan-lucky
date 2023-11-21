import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<Product> getItems() {
        return items;
    }
}

public class buyprice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Product> availableProducts = new ArrayList<>();
        availableProducts.add(new Product("Laptop", 1000.0));
        availableProducts.add(new Product("Phone", 500.0));
        availableProducts.add(new Product("Headphones", 50.0));

        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("Available Products:");
            int i = 1;
            for (Product product : availableProducts) {
                System.out.println(i++ + ". " + product.getName() + " - $" + product.getPrice());
            }

            System.out.print("Enter the number of the product to add to cart (0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice < 0 || choice > availableProducts.size()) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            Product selectedProduct = availableProducts.get(choice - 1);
            cart.addItem(selectedProduct);
            System.out.println(selectedProduct.getName() + " added to cart.");
        }

        System.out.println("\nItems in the Cart:");
        for (Product item : cart.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        System.out.println("\nTotal Price: $" + cart.calculateTotal());

        scanner.close();
    }
}