package api;

import entity.Product;

import java.util.List;

/**
 * Created by Damia on 06.03.2019.
 */
public interface ProductService {
    List<Product> getAllProducts();
    int getCountProduct();
    Product getProductByName();


}
