package userinfo;

import java.util.Date;
import java.util.Objects;

//написать создание заказа
public class UserOrderData {
    private StringBuffer orderDescription;
    private String orderId;
    private StringBuffer positionType;// сделать енум
    private int positionQuantity;
    private Date orderDate;
    private int orderSumm;
    private String userId;

    public StringBuffer getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = new StringBuffer(orderDescription);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderid() {
        orderId=GuidGenerator.generateGuid();
    }

    public StringBuffer getPositionType() {
        return positionType;
    }

    public void setPositionType(StringBuffer positionType) {
        this.positionType = positionType;
    }

    public int getPositionQuantity() {
        return positionQuantity;
    }

    public void setPositionQuantity(int positionQuantity) {
        this.positionQuantity = positionQuantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderSumm() {
        return orderSumm;
    }

    public void setOrderSumm(int orderSumm) {
        this.orderSumm = orderSumm;
    }

    public void setUserId(String userId) {
        this.userId=userId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserOrderData userOrder = (UserOrderData) o;
        return positionQuantity == userOrder.positionQuantity &&
                orderSumm == userOrder.orderSumm &&
                Objects.equals(orderDescription, userOrder.orderDescription) &&
                Objects.equals(orderId, userOrder.orderId) &&
                Objects.equals(positionType, userOrder.positionType) &&
                Objects.equals(orderDate, userOrder.orderDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderDescription, orderId, positionType, positionQuantity, orderDate, orderSumm);
    }

}
