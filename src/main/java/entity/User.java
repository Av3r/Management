package entity;
/**
 * Created by Damia on 28.02.2019.
 */
public class User {
    public final static String USER_SEP = "#";
    private Long id;
    private String login, password;

    public User(Long id, String login, String password){
        this.id=id;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return id + USER_SEP + login + USER_SEP + password;
    }
}
