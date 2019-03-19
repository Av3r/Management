package dao;

import api.UserDao;
import entity.User;
import entity.parser.UserParser;
import utils.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damia on 10.03.2019.
 */
public class UserDaoImpl implements UserDao {
    private final String fileName;
    private String productType;

    public UserDaoImpl(String fileName, String productType) throws IOException{
        this.fileName = fileName;
        this.productType = productType;
        FileUtils.createNewFile(fileName);
    }

    public void saveUser(User user) throws IOException{
        List<User> users = getAllUsers();
        users.add(user);
        saveUsers(users);
    }

    public void saveUsers(List<User> users) throws IOException{
        FileUtils.clearFile(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        for(User user : users){
            printWriter.write(user.toString() + "\n");
        }
        printWriter.close();
    }

    public List<User> getAllUsers() throws IOException{
        List<User> users = new ArrayList<User>();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        String readLine = reader.readLine();
        while(readLine != null){
            User user = UserParser.stringToUser(readLine, productType);
            if(user != null){
                users.add(user);
            }
        }
        reader.close();
        return users;
    }

    public User getUserByLogin(String login) throws IOException{
        List<User> users = getAllUsers();

        for(User user : users){
            boolean isFoundUser = user.getLogin().equals(login);
            if(isFoundUser){
                return user;
            }
        }
        return null;
    }

    public User getUserById(Long userId) throws IOException{
        List<User> users = getAllUsers();

        for(User user: users){
            boolean isFoundUser = user.getId().equals(userId);
            if(isFoundUser){
                return user;
            }
        }
        return null;
    }

    public void removeUserByLogin(String login) throws IOException{
        List<User> users = getAllUsers();

        for(User user: users){
            boolean isFoundUser = user.getLogin().equals(login);
            if(isFoundUser){
                users.remove(user);
            }
        }
        saveUsers(users);
    }

    public void removeUserById(Long userId) throws IOException{
        List<User> users = getAllUsers();

        for(int i =0; i< users.size(); i++){
            boolean isFoundUser = users.get(i).getId().equals(userId);
            if(isFoundUser){
                users.remove(i);
            }
        }
        saveUsers(users);
    }
}
