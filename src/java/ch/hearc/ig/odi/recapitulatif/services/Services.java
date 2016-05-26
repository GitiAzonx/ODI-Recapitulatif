/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.recapitulatif.services;

import ch.hearc.ig.odi.recapitulatif.business.Basket;
import ch.hearc.ig.odi.recapitulatif.business.ModelProduct;
import ch.hearc.ig.odi.recapitulatif.business.Product;
import ch.hearc.ig.odi.recapitulatif.business.Shop;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author silvio.gutierre
 */
@SessionScoped
@Stateful
public class Services {

    private Shop shop;
    private Basket basket;

    public Services() {        
        basket = new Basket(1,"My basket");
        //try {        
        shop.getModelProducts().add(new ModelProduct(1,"Shoes"));
        shop.getModelProducts().add(new ModelProduct(2,"Short"));
        shop.getModelProducts().add(new ModelProduct(3,"T-shirt"));
        shop.getModelProducts().add(new ModelProduct(4,"Hoodie"));
        shop.getModelProducts().add(new ModelProduct(5,"Sharf"));
        shop.getModelProducts().add(new ModelProduct(6,"Cap"));
        shop.getModelProducts().add(new ModelProduct(7,"Socks"));
        shop.getModelProducts().add(new ModelProduct(8,"Pants"));
        
        //} catch (DuplicateElementException | InvalidParameterException ex) {
        // Shouldn't happen.
        //ex.printStackTrace();
        //}
    }  

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
    
    public void saveProduct(Product product){
        this.basket.getProducts().add(product);
    }
    
    public void cancelProduct(int id){
        this.basket.getProducts().remove(id);
    }
    
    public List<ModelProduct> getModelProducts(){
        return shop.getModelProducts();        
    }
}
