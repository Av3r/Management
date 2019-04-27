package validator;

import entity.Product;
import exception.ProductCountNegativeException;
import exception.ProductNameEmptyException;
import exception.ProductPriceNoPositiveException;
import exception.ProductWeightNoPositiveException;

/**
 * Created by Damia on 25.04.2019.
 */
public class ProductValidator {
    private static ProductValidator instance = null;

    private final int MIN_PRICE = 0;
    private final int MIN_AMOUNT_PRODUCT = 0;
    private final int MIN_WEIGHT = 0;
    private final int MIN_NAME_LENGTH = 0;

    private ProductValidator(){
    }

    public ProductValidator getInstance(){
        if (instance == null) {
            instance = new ProductValidator();
        }
        return instance;
    }

    public boolean isValidate(Product product) throws ProductPriceNoPositiveException, ProductCountNegativeException, ProductWeightNoPositiveException, ProductNameEmptyException {
        if(isCorrectPrice(product.getPrice()))
            throw new ProductPriceNoPositiveException("Price < 0");
        if(isCorrectAmountProduct(product.getProductCount()))
            throw new ProductCountNegativeException("Product doesn't exist");
        if(isCorrectWeight(product.getWeight()))
            throw new ProductWeightNoPositiveException("Product weight < 0");
        if(isCorrectProductNameLenght(product.getProductName()))
            throw new ProductNameEmptyException("Product name too short");
        return true;
    }

    private boolean isCorrectPrice(Float price){
        return price > MIN_PRICE;
    }
    private boolean isCorrectAmountProduct(Integer productCount){
        return productCount > MIN_AMOUNT_PRODUCT;
    }

    private boolean isCorrectWeight(Float weight) {
        return weight > MIN_WEIGHT;
    }

    private boolean isCorrectProductNameLenght(String productname) {
        return productname.length() > MIN_NAME_LENGTH;
    }
}
