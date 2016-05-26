/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.recapitulatif.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author silvio.gutierre
 */
public class Basket implements Serializable {
    
    private int id;
    private String name;
    private List<Product> products;

    public Basket(int id, String name) {
        this.id = id;
        this.name = name;
        products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    public void addProduct(Product product){
        products.add(product);
    }
    
    public Product getProductById(int id){
        return products.get(id);        
    }
       
}
