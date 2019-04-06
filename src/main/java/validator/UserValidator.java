package validator;

import api.UserDao;
import dao.UserDaoImpl;
import entity.User;
import exception.UserLoginAlreadyExistException;
import exception.UserShortLengthLoginException;
import exception.UserShortLengthPasswordException;

import java.io.IOException;

/**
 * Created by Damia on 05.04.2019.
 */
public class UserValidator {

    private final int MIN_LENGTH_PASSWORD = 6;
    private final int MIN_LENGTH_LOGIN = 4;
    private UserDao userdao = UserDaoImpl.getInstance();

    private UserValidator(){}

    //User user;
    static UserValidator instance = null;

    public static UserValidator getInstance(){
        if(instance.equals(null)){
            instance = new UserValidator();
        }
        return instance;
    }

    public boolean isValidate(User user) throws UserShortLengthPasswordException, UserShortLengthLoginException, UserLoginAlreadyExistException {
    if(isCorrectPasswordLength(user.getPassword()))
        throw new UserShortLengthPasswordException("Password is too short");
    if(isCorrectLoginLength(user.getLogin()))
        throw new UserShortLengthLoginException("Login is too short");
    if(isUserByLoginExist(user.getLogin()))
        throw new UserLoginAlreadyExistException("User with this login already exists");
    return true;
    }

    private boolean isCorrectPasswordLength(String password){
        return password.length() >= MIN_LENGTH_PASSWORD;
    }

    private boolean isCorrectLoginLength(String login){
        return login.length() >= MIN_LENGTH_LOGIN;
    }
    private boolean isUserByLoginExist(String login){
        User user = null;
        try{
            user = userdao.getUserByLogin(login);
        } catch (IOException e ){
            e.printStackTrace();
        }
        if(user == null) return false;

        return true;
    }
}
