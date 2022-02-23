package com.example.qualtribe.models;

public class Order {
    String email;
    String price;
    String pkgDec;
    String requirements;
    String sellerId;
    String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Order(String email, String price, String pkgDec, String requirements, String sellerId) {
        this.email = email;
        this.price = price;
        this.pkgDec = pkgDec;
        this.requirements = requirements;
        this.sellerId = sellerId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Order() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPkgDec() {
        return pkgDec;
    }

    public void setPkgDec(String pkgDec) {
        this.pkgDec = pkgDec;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    @Override
    public String toString() {
        return "Order{" +
                "email='" + email + '\'' +
                ", price='" + price + '\'' +
                ", pkgDec='" + pkgDec + '\'' +
                ", requirements='" + requirements + '\'' +
                ", sellerId='" + sellerId + '\'' +
                '}';
    }
}


