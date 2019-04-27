package api;

import entity.User;

import java.io.IOException;
import java.util.List;

/**
 * Created by Damia on 05.03.2019.
 */
public interface UserService {
    List<User> getAllUsers() throws IOException;
    void addUser(User user) throws Exception;
    void removeUserById(Long userId) throws IOException;

}
