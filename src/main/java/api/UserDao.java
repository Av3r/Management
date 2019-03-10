package api;

import entity.User;

import java.util.List;

/**
 * Created by Damia on 10.03.2019.
 */
public interface UserDao {
    saveUser(User user);
    saveUsers(List<User> users);
    getAllUsers();
    getUserByLogin(String login);
    getUserById(Long userId);
    removeUserByLogin(String login);
    removeUserById(Long userId);
}
