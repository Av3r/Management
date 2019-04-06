package service;

import api.UserDao;
import api.UserService;
import dao.UserDaoImpl;
import entity.User;
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
    public void addUser(User user){
        users.add(user);
    }
    public void removeUserById(Long userId){
        for(int i = 0; i < users.size() ; i ++){
            User userFromList = users.get(i);
            if(userFromList.getId() == userId){
                users.remove(i);
                break;
            }
        }
    }

}
