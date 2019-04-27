package entity;
/**
 * Created by Damia on 28.02.2019.
 */
public class Product {
    public final static String PROD_SEP = "#";
    public final static char PRODUCT_TYPE = 'P';
    private Long id;
    private String productName, color;
    private Float price, weight;
    private Integer productCount;

    public Product(Long id, String productName, String color, Float price, Float weight, Integer productCount){
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

    public Float getPrice() {
        return price;
    }

    public Float getWeight() {
        return weight;
    }

    public Integer getProductCount() {
        return productCount;
    }


    protected String getBasicProductString(){
        return id + PROD_SEP + productName + PROD_SEP + color + PROD_SEP + price + PROD_SEP + weight + PROD_SEP + productCount;
    }

    @Override
    public String toString() {
        return PRODUCT_TYPE + PROD_SEP + getBasicProductString();
    }
}
