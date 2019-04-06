package exception;

/**
 * Created by Damia on 05.04.2019.
 */
public class UserShortLengthLoginException extends Exception {
    public UserShortLengthLoginException(){}

    public UserShortLengthLoginException(String message) {
        super(message);
    }

}
