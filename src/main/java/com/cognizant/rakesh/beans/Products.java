package com.cognizant.rakesh.beans;

import java.util.Objects;


public class Products {
    private int productId;
    private String user;
    private String productName;
    private String brandName;
    private int quantity;
    private double price;

    public Products() {

        super();        
    }

    public Products(int productId,String user, String productName, String brandName, int quantity, double price) {

        super();
        this.productId = productId;
        this.user = user;
        this.productName = productName;
        this.brandName = brandName;
        this.quantity = quantity;
        this.price = price;
    }    

    public int getProductId() {

        return productId;
    }
    public void setProductId(int productId) {

        this.productId = productId;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


    public String getProductName() {

        return productName;
    }
    public void setProductName(String productName) {

        this.productName = productName;
    }

    public String getBrandName() {

        return brandName;
    }
    public void setBrandName(String brandName) {

        this.brandName = brandName;
    }

    public int getQuantity() {

        return quantity;
    }
    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public double getPrice() {

        return price;
    }
    public void setPrice(double price) {

        this.price = price;
    }

    @Override
    public String toString() {

        return "Products [productId=" + productId + ", user= " + user +", productName=" + productName + ", brandName=" + brandName
                + ", quantity=" + quantity + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {

        return Objects.hash(user,brandName, price, productId, productName, quantity);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Products other = (Products) obj;
        return Objects.equals(brandName, other.brandName)
                && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
                && productId == other.productId && Objects.equals(productName, other.productName)
                && quantity == other.quantity;
    }

}
