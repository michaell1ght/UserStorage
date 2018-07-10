package userinfo;

import java.util.Objects;

public class UserData {
    private StringBuffer userName;
    private StringBuffer userSurname;
    private StringBuffer userPatronumic;
    private StringBuffer userAdress;
    private long userPhone;
    private String userId;

    public void setUserName(StringBuffer userName) throws NullPointerException {
        UserDataValidator.ValidateNillableAndEmptyData(userName);
        this.userName=new StringBuffer(userName);
    }

    public void setUserSurame(StringBuffer userSuRame) {
        UserDataValidator.ValidateNillableAndEmptyData(userSuRame);
        this.userSurname = new StringBuffer(userSuRame);
    }

    public void setUserPatronumic(StringBuffer userPatronumic) {
        UserDataValidator.ValidateNillableAndEmptyData(userPatronumic);
        this.userPatronumic = new StringBuffer(userPatronumic);
    }

    public void setUserAdress(StringBuffer userAdress) throws NullPointerException {
        UserDataValidator.ValidateNillableAndEmptyData(userAdress);
        this.userAdress = new StringBuffer(userAdress);
    }

    public void setUserPhone(long userPhone) throws NullPointerException {
        this.userPhone = userPhone;
    }

    public void setUserId() {
        userId = GuidGenerator.generateGuid();
    }

    public StringBuffer getUserName() {
        return userName;
    }

    public StringBuffer getUserSurname() {
        return userSurname;
    }

    public StringBuffer getUserPatronumic() {
        return userPatronumic;
    }

    public StringBuffer getUserAdress() {
        return userAdress;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return userPhone == userData.userPhone &&
                Objects.equals(userName, userData.userName) &&
                Objects.equals(userSurname, userData.userSurname) &&
                Objects.equals(userPatronumic, userData.userPatronumic) &&
                Objects.equals(userAdress, userData.userAdress) &&
                Objects.equals(userId, userData.userId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userName, userSurname, userPatronumic, userAdress, userPhone, userId);
    }
}

