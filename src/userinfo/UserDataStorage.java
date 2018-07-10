package userinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UserDataStorage {

    List <UserData> userDataStorage =new ArrayList<UserData>();
    Stream<UserData> userDataStream = userDataStorage.stream();
    public UserData getUserById(String userId) throws IllegalArgumentException{
        for (UserData user: userDataStorage) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
            }
    throw new IllegalArgumentException("user with id \""+ userId + "\" not found");
    }
// проверить
    public void addUserToStorage (UserData newUser) throws IllegalArgumentException{
       if (userDataStorage.contains(newUser)){
       throw new IllegalArgumentException("user already added");}
       else
        {userDataStorage.add(newUser);}
    }

    public void removeUser (String userId) throws IllegalArgumentException {
            if (userDataStorage.contains(getUserById(userId))) {
                userDataStorage.remove(getUserById(userId));}
            else {throw new IllegalArgumentException("user doesn't exist");}
            }
      //нужно перегрузить метод для каждого свойства?
    public void updateUserProperty (UserData newUser, String userId) throws IllegalArgumentException{
        for (UserData user : userDataStorage)  {
            if (userDataStorage.contains(getUserById(userId))) {
                user.setUserName(newUser.getUserName());
                user.setUserSurame(newUser.getUserName());
                user.setUserSurame(newUser.getUserSurname());
                user.setUserPatronumic(newUser.getUserPatronumic());
                user.setUserAdress(newUser.getUserAdress());
                user.setUserPhone(newUser.getUserPhone());
            }
            else
        {
            throw new IllegalArgumentException("user with id \""+ userId + "\" doesn't exist");}
        }
    }

    public int countUsersQuantity() {
        return userDataStorage.size();
    }
}