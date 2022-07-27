package com.cognizant.rakesh.service;

import org.springframework.stereotype.Service;

import com.cognizant.rakesh.beans.Products;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductService {
	private static List<Products> products = new ArrayList<Products>();
	private static int productsCount = 3;

    static {
        products.add(new Products(1,"Rakesh", "Realme9", "Realme", 1 ,15000.00));
        products.add(new Products(2,"Rakesh", "Oneplus11", "Oneplus", 1, 48000.00));
        products.add(new Products(3, "Rakesh", "Nokia", "Nokia5", 2, 30000.00));
    }
    public List<Products> retrieveProducts(String user) {
        List<Products> filteredProducts = new ArrayList<Products>();
        for (Products products : products) {
            if (products.getUser().equals(user)) {
                filteredProducts.add(products);
            }
        }
        return filteredProducts;
    }
//    public Products retrieveProducts(int productId) {
//        for (Products products : products) {
//            if (products.getProductId() == productId) {
//                return products;
//            }
//        }
//        return null;
//    }
//
//    public void updateProducts(Products products){
//    		products.remove(products);
//    		products.add(products);
//    }
    public void addProducts(String name, String productName, String brandName, int quantity, double price) {
        products.add(new Products(++productsCount,name, productName, brandName, quantity, price));
    }
    public void deleteProducts(int productId) {
        Iterator<Products> iterator = products.iterator();
        while (iterator.hasNext()) {
            Products products = iterator.next();
            if (products.getProductId() == productId) {
                iterator.remove();
            }
        }
    }


}
