package entity.parser;

import entity.User;

import static entity.User.USER_SEP;

/**
 * Created by Damia on 10.03.2019.
 */
public class UserParser {

   /* public static User stringToUser(String productStr, String productType){ //version before week 4
        if(productType.equals("USER")){
            return convertToUser(productStr);
        }
        return null;
    }*/
    public static User stringToUser(String productStr){
        String [] userInformation = productStr.split(User.USER_SEP);

        Long id = Long.parseLong(userInformation[0]);
        String login = userInformation[1];
        String password = userInformation[2];

        return new User(id, login, password);
    }

 /*   private static User convertToUser(String productStr){ //before week 4
        String [] userInformation = productStr.split(USER_SEP);

        Long id = Long.parseLong(userInformation[0]);
        String login = userInformation[1];
        String password = userInformation[2];

        return new User(id, login, password);
    } */
}
