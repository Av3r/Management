package exception;

/**
 * Created by Damia on 05.04.2019.
 */
public class UserLoginAlreadyExistException extends Exception {
    public UserLoginAlreadyExistException(){}

    public UserLoginAlreadyExistException(String message) {
        super(message);
    }
}
