package service;

import api.UserDao;
import api.UserService;
import dao.UserDaoImpl;
import entity.User;
import exception.UserLoginAlreadyExistException;
import exception.UserShortLengthLoginException;
import exception.UserShortLengthPasswordException;
import validator.UserValidator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damia on 05.03.2019.
 */
public class UserServiceImpl implements UserService {
    //List<User> users;
    private static UserServiceImpl instance = null;
    private UserDao userDao = UserDaoImpl.getInstance();
    private UserValidator userValidator = UserValidator.getInstance();

    private UserServiceImpl(){}

    public static UserServiceImpl getInstance(){
        if(instance == null){
            instance = new UserServiceImpl();
        }
        return instance;
    }

    public List<User> getAllUsers() throws IOException {
        return userDao.getAllUsers();
    }

    public void addUser(User user) throws IOException, UserShortLengthPasswordException, UserShortLengthLoginException, UserLoginAlreadyExistException{
        if(userValidator.isValidate(user)){
            userDao.saveUser(user);
        }
    }

    public boolean isLoginAlreadyExist(String login) {
        User user = null;
        try{

        }
    }

    public void removeUserById(Long userId) throws IOException{
        try{
            for(User user : getAllUsers()){
                if(user.getId() == userId){
                    userDao.removeUserById(userId);
                    break;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
