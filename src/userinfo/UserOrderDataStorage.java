package userinfo;

import java.util.ArrayList;

public class UserOrderDataStorage {
    boolean userOrderIsAdded;
    ArrayList<UserOrderData> userOrderDataArrayList=new ArrayList<UserOrderData>();
    public UserOrderData getOrderId(String userId) throws NullPointerException{
            for (UserOrderData userOrderInCollection: userOrderDataArrayList) {
                if (userOrderInCollection.getOrderId().equals(userId)) {
                    return userOrderInCollection;
                }
            }
            throw new NullPointerException();
        }
    public UserOrderData getOrderByUserId(String userId) throws NullPointerException{
        for (UserOrderData userOrderInCollection: userOrderDataArrayList) {
            if (userOrderInCollection.getUserId().equals(userId)) {
                return userOrderInCollection;
            }
        }
        throw new NullPointerException();
    }
        public void addUserOrderToStorage (UserOrderData order) {
                for (UserOrderData userInCollection : userOrderDataArrayList) {
                    if (userInCollection.equals(order)) {
                        userOrderIsAdded=true;
                        System.err.println("user already added");
                    }
                }
                if (userOrderIsAdded=true){
                    userOrderDataArrayList.add(order);
                }
            }

        public void removeOrder (String orderId) {
            for (UserOrderData userInCollection : userOrderDataArrayList) {
                if (userInCollection.getOrderId().equals(orderId)) {
                    userOrderDataArrayList.listIterator().remove();
                }
            }
        }
        //нужно перегрузить метод для каждого свойства?
        // выкинуть ошибку
        public void updateUserProperty (UserOrderData user){
            for (UserOrderData userInCollection: userOrderDataArrayList){
                if (userInCollection.equals(user)) {
                    userInCollection = user;
                }
                else
                {System.err.println("user with id: \""+ user.getOrderId() + "\" not found");
                }
            }
        }

        public int countOrdersQuantity() {
            return userOrderDataArrayList.size();
        }
    }
