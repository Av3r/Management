package service;

import entity.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damia on 06.03.2019.
 */
public class ProductServiceImpl {
    List<Product> products;

    public ProductServiceImpl(){
        products = new ArrayList<Product>();
    }
    public ProductServiceImpl(List<Product> products){
        this.products = products;
    }

    public List<Product> getAllProducts(){
        return products;
    }
    public int getCountProducts(){
        return products.size();
    }
    public Product getProductByName(String name){
        for(Product product : products){
            if(product.getProductName().equals(name)){ // wyciaga nazwe produktu i spr
                return product;
            }
        }
        return null;
    }
    public boolean isProductOnWareHouse(String productName){
        for(Product product : products){
            if(isProductExist(productName) && product.getProductCount() > 0)
                return true;
        }
        return false;
    }
    public boolean isProductExist(String productName){
        for(Product product : products){
            if(product.getProductName().equals(productName))
                return true;
        }
        return false;
    }
    public boolean isProductExist(Long productId){
        for(Product product : products){
            if(product.getId().equals(productId))
                return true;
        }
        return false;
    }

}
