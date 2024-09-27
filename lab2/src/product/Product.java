package product;

public class Product {
    private int id;
    private String name;
    private String manufacturer;
    private double price;
    private int shelfLife; // Термін зберігання в днях
    private int quantity;

    public Product(int id, String name, String manufacturer, double price, int shelfLife, int quantity) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getShelfLife() {
        return shelfLife;
    }
    
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', manufacturer='" + manufacturer + "', price=" + price
                + ", shelfLife=" + shelfLife + ", quantity=" + quantity + "}";
    }
}
