package entity.parser;

import entity.Boots;
import entity.Cloth;
import entity.Product;

import java.io.PrintWriter;

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
        Integer size = Integer.parseInt(productInformations[6]);
        Boolean isNaturalSkin = Boolean.parseBoolean(productInformations[7]);

        return new Boots(id, productName,color,price, weight, productCount, size, isNaturalSkin);
    }
    private static Cloth convertToCloth(String productStr){
        String [] productInformations = productStr.split(Product.PROD_SEP);

        Long id = Long.parseLong(productInformations[0]);
        String productName = productInformations[1];
        String color = productInformations[2];
        Float price = Float.parseFloat(productInformations[3]);
        Float weight = Float.parseFloat(productInformations[4]);
        Integer productCount = Integer.parseInt(productInformations[5]);
        String size = productInformations[6];
        String material = productInformations[7];

        return new Cloth(id, productName,color,price, weight, productCount, size, material);

    }
    private static Product convertToProduct(String productStr){
        String [] productInformations = productStr.split(Product.PROD_SEP);

        Long id = Long.parseLong(productInformations[0]);
        String productName = productInformations[1];
        String color = productInformations[2];
        Float price = Float.parseFloat(productInformations[3]);
        Float weight = Float.parseFloat(productInformations[4]);
        Integer productCount = Integer.parseInt(productInformations[5]);

        return new Product(id, productName,color,price, weight, productCount);
    }
}