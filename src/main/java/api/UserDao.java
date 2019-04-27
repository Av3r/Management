package api;

import entity.Product;
import entity.User;

import java.io.IOException;
import java.util.List;

/**
 * Created by Damia on 10.03.2019.
 */
public interface UserDao {
    void saveUser(User user) throws IOException;
    void saveUsers(List<User> users) throws IOException;
    List<User> getAllUsers() throws IOException;
    void removeUserByLogin(String login) throws IOException;
    void removeUserById(Long userId) throws IOException;

//    User getUserByLogin(String login) throws IOException;
//    User getUserById(Long userId) throws IOException;
}
