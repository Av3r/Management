package entity.parser;

import entity.User;

import static entity.User.USER_SEP;

/**
 * Created by Damia on 10.03.2019.
 */
public class UserParser {

    public static User stringToUser(String productStr, String productType){
        if(productType.equals("USER")){
            return convertToUser(productStr);
        }
        return null;
    }

    private static User convertToUser(String productStr){
        String [] productInformation = productStr.split(USER_SEP);

        Long id = Long.parseLong(productInformation[0]);
        String login = productInformation[1];
        String password = productInformation[2];

        return new User(id, login, password);
    }
}
