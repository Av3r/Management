package entity;
/**
 * Created by Damia on 28.02.2019.
 */
public class Product {
    private Long id;
    private String productName, color;
    private float price, weight;
    private int productCount;

    public Product(Long id, String productName, String color, float price, float weight, int productCount){
        this.id = id;
        this.productName = productName;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.productCount = productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public int getProductCount() {
        return productCount;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", productCount=" + productCount +
                '}';
    }
}
