/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.recapitulatif.business;

import java.io.Serializable;

/**
 *
 * @author silvio.gutierre
 */
public class Product implements Serializable {
    
    private int id;
    private ModelProduct modelProduct;
    private int quantity;

    public Product(int id, ModelProduct product, int quantity) {
        this.id = id;
        this.modelProduct = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModelProduct getModelProduct() {
        return modelProduct;
    }

    public void setModelProduct(ModelProduct modelProduct) {
        this.modelProduct = modelProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
