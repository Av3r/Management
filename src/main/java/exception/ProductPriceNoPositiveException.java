package exception;

/**
 * Created by Damia on 25.04.2019.
 */
public class ProductPriceNoPositiveException extends Exception {
    public ProductPriceNoPositiveException(){}

    public ProductPriceNoPositiveException(String message) {
        super(message);
    }
}
