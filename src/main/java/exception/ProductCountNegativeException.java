package exception;

/**
 * Created by Damia on 25.04.2019.
 */
public class ProductCountNegativeException extends Exception {
    public ProductCountNegativeException(){}

    public ProductCountNegativeException(String message) {
        super(message);
    }
}
