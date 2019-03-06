package entity;

/**
 * Created by Damia on 28.02.2019.
 */
public class Boots extends Product {
    private int size;
    private boolean isNaturalSkin;

    public Boots(Long id, String productName, String color, float price,
                 float weight, int productCount, int size, boolean isNaturalSkin){
        super(id, productName, color, price, weight, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize() {
        return size;
    }
    public boolean isNaturalSkin(){
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return super.toString() + "Boots{" +
                "size=" + size +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}
