package com.hr.springcloud.po;

/**
 * @author 刘焕燃 🐇
 * @date 2021/2/18 17:01
 */
public class Order {
    private String id;
    private Double price;
    private String receiverName;
    private String receiverAdress;
    private String receiverPhone;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", receiverName='" + receiverName + '\'' +
                ", receiverAdress='" + receiverAdress + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                '}';
    }

    public Order(String id, Double price, String receiverName, String receiverAdress, String receiverPhone) {
        this.id = id;
        this.price = price;
        this.receiverName = receiverName;
        this.receiverAdress = receiverAdress;
        this.receiverPhone = receiverPhone;
    }
    public Order(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAdress() {
        return receiverAdress;
    }

    public void setReceiverAdress(String receiverAdress) {
        this.receiverAdress = receiverAdress;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
}
