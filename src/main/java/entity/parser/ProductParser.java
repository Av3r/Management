package entity.parser;

import entity.Boots;
import entity.Product;

/**
 * Created by Damia on 09.03.2019.
 */
public class ProductParser {

    public static Product stringToProduct(String productStr, String productType){
        if(productType.equals("PRODUCT")){
            return convertToProduct(productStr);
        } else if(productType.equals("CLOTH")){
            return convertToCloth(productStr);
        } else if(productType.equals("BOOTS")){
            return convertToBoots(productStr);
        }
        return null;
    }
    private static Boots convertToBoots(String productStr){
        String [] productInformations = productStr.split(Product.PROD_SEP);

        Long id = Long.parseLong(productInformations[0]);
        String productName = productInformations[1];
        String color = productInformations[2];
        Float price = Float.parseFloat(productInformations[3]);
        Float weight = Float.parseFloat(productInformations[4]);
        Integer productCount = Integer.parseInt(productInformations[5]);
        Integer size = Integer.parseInt(productInformations[6])
    }
}
return id + PROD_SEP + productName + PROD_SEP + color + PROD_SEP +
        price + PROD_SEP + weight +
        PROD_SEP + productCount;
        int productCount, int size, boolean isNaturalSkin
