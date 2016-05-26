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
public class Shop implements Serializable{
    
    private int id;
    private String name;
    private List<ModelProduct> modelProducts;

    public Shop(int id, String name) {
        this.id = id;
        this.name = name;
        modelProducts = new ArrayList<>();
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

    public List<ModelProduct> getModelProducts() {
        return modelProducts;
    }

    public void setModelProducts(List<ModelProduct> modelProducts) {
        this.modelProducts = modelProducts;
    }
     
}
