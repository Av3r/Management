package exception;

/**
 * Created by Damia on 25.04.2019.
 */
public class ProductNameEmptyException extends Exception {
    public ProductNameEmptyException(){}

    public ProductNameEmptyException(String message) {
        super(message);
    }
}
