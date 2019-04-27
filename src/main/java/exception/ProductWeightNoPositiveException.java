package exception;

/**
 * Created by Damia on 25.04.2019.
 */
public class ProductWeightNoPositiveException extends Exception {
    public ProductWeightNoPositiveException(){}

    public ProductWeightNoPositiveException(String message) {
        super(message);
    }
}
