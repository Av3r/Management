package api;

import entity.Product;

import java.util.List;

/**
 * Created by Damia on 09.03.2019.
 */
public interface ProductDao {
    saveProduct(Product product);
    saveProducts(List<Product> products);
    removeProductById(Long productId);
    removeProductByName(String productName);
    getAllProducts();
    getProductById(Long productId);
    getProductByProductName(String productName);
}
