package userinfo;

public class UserDataValidator {
    public static void ValidateNillableAndEmptyData(StringBuffer userParam) {
        if (userParam== null ){
        throw new NullPointerException();
}
}
// проверка фио на наличие только букв
// проверка телефона на маску.

}