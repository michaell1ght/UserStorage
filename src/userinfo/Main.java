package userinfo;

public class Main  {
    public static void main(String[] args) {
        //add user1
        UserData user1=new UserData();
        user1.setUserName(new StringBuffer("Иван"));
        user1.setUserPatronumic(new StringBuffer ("Сергеевич"));
        user1.setUserSurame(new StringBuffer ("Шаболдин"));
        user1.setUserAdress(new StringBuffer ("ебеня"));
        user1.setUserPhone(891612311);
        user1.setUserId();
        UserDataStorage userStorage=new UserDataStorage();
        userStorage.addUserToStorage(user1);
        System.out.println("количество клиентов: " + userStorage.countUsersQuantity());
        //user1 order
        UserOrderData user1Order = new UserOrderData();
        user1Order.setOrderDescription("покуплено");
        user1Order.setOrderid();
        user1Order.setOrderSumm(123);
        user1Order.setPositionQuantity(2);
        user1Order.setUserId(user1.getUserId());
        UserOrderDataStorage orderStorage = new UserOrderDataStorage();
        orderStorage.addUserOrderToStorage(user1Order);
        System.out.println("количество заказов: " + orderStorage.countOrdersQuantity());

        //add user2
        UserData user2=new UserData();
        user2.setUserName(new StringBuffer ("Сашуля"));
        user2.setUserPatronumic(new StringBuffer ("Сашуля"));
        user2.setUserSurame(new StringBuffer ("Сашуля"));
        user2.setUserAdress(new StringBuffer ("дит"));
        user2.setUserPhone(89161212);
        user2.setUserId();
        userStorage.addUserToStorage(user2);
        System.out.println("количество клиентов: " + userStorage.countUsersQuantity());
        //user2 order
        UserOrderData user2Order = new UserOrderData();
        user2Order.setOrderDescription("куплено");
        user2Order.setOrderid();
        user2Order.setOrderSumm(220);
        user2Order.setPositionQuantity(5);
        user2Order.setUserId(user2.getUserId());
        orderStorage.addUserOrderToStorage(user2Order);
        System.out.println("количество заказов: " + orderStorage.countOrdersQuantity());
        userStorage.removeUser(user2.getUserId());
        System.out.println("количество клиентов: " + userStorage.countUsersQuantity());
        userStorage.addUserToStorage(user2);
        System.out.println("количество клиентов: " + userStorage.countUsersQuantity());
        userStorage.updateUserProperty(user2,user1.getUserId());
//        userStorage.updateUserProperty(user2,GuidGenerator.generateGuid());
//        orderStorage.removeOrder(user2Order.getOrderId());
//        System.out.println("количество заказов: " + orderStorage.countOrdersQuantity());
    }
}