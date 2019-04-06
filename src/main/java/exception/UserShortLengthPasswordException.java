package exception;

/**
 * Created by Damia on 05.04.2019.
 */
public class UserShortLengthPasswordException extends Exception {
    public UserShortLengthPasswordException(){}

    public UserShortLengthPasswordException(String message) {
        super(message);
    }
}
