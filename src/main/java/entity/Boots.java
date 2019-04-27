package entity;

/**
 * Created by Damia on 28.02.2019.
 */
public class Boots extends Product {
    private final char PRODUCT_TYPE = 'B';
    private Integer size;
    private boolean isNaturalSkin;

    public Boots(Long id, String productName, String color, Float price,
                 Float weight, Integer productCount, Integer size, boolean isNaturalSkin){
        super(id, productName, color, price, weight, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public Integer getSize() {
        return size;
    }
    public boolean isNaturalSkin(){
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return PRODUCT_TYPE + PROD_SEP + getBasicProductString() + PROD_SEP + size + PROD_SEP + isNaturalSkin;
    }
}
