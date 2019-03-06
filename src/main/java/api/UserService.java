package api;

import entity.User;

import java.util.List;

/**
 * Created by Damia on 05.03.2019.
 */
public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(Long userId);

}
