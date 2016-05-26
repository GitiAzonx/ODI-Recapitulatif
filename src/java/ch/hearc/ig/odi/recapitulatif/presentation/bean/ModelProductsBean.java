/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.recapitulatif.presentation.bean;

import ch.hearc.ig.odi.recapitulatif.business.ModelProduct;
import ch.hearc.ig.odi.recapitulatif.services.Services;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author silvio.gutierre
 */
@Named(value = "customersBean")
@RequestScoped
public class ModelProductsBean implements Serializable {
    
    @Inject Services services;

    public ModelProductsBean(){
        
    }
    
    /**
     * Retourne une liste de clients
     * @return Une liste de clients
     */
    public List<ModelProduct> getModelProducts(){
        return services.getModelProducts();
    }
}
