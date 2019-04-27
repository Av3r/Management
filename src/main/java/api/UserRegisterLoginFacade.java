package api;

import entity.User;

/**
 * Created by Damia on 27.04.2019.
 */
public interface UserRegisterLoginFacade {
    boolean registerUser(User user);
    boolean loginUser(String login, String password);
}
