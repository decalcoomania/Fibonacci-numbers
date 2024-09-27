package main;

import product.Product;

public class Main {
    public static void main(String[] args) {
        Product[] products = createProducts();

        System.out.println("Products with name 'Milk':");
        printProductsByName(products, "Milk");

        System.out.println("\nProducts with name 'Milk' and price not exceeding 15.0:");
        printProductsByNameAndPrice(products, "Milk", 15.0);

        System.out.println("\nProducts with shelf life greater than 30 days:");
        printProductsByShelfLife(products, 30);
    }

    public static Product[] createProducts() {
        Product[] products = new Product[5];
        products[0] = new Product(1, "Milk", "Milka", 10.5, 20, 100);
        products[1] = new Product(2, "Bread", "Breedy", 5.0, 7, 200);
        products[2] = new Product(3, "Milk", "MilkBoom", 12.0, 15, 150);
        products[3] = new Product(4, "Cheese", "Milka", 25.0, 60, 80);
        products[4] = new Product(5, "Butter", "ButterLand", 20.0, 90, 50);
        return products;
    }

    public static void printProductsByName(Product[] products, String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    public static void printProductsByNameAndPrice(Product[] products, String name, double maxPrice) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getPrice() <= maxPrice) {
                System.out.println(product);
            }
        }
    }

    public static void printProductsByShelfLife(Product[] products, int minShelfLife) {
        for (Product product : products) {
            if (product.getShelfLife() > minShelfLife) {
                System.out.println(product);
            }
        }
    }
}
