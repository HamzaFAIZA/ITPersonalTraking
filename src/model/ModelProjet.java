/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Beans.Projet;
import DAO.ImpDaoProjet;
import java.util.List;

/**
 *
 * @author faiza
 */
public class ModelProjet {
    private Projet p;
    private ImpDaoProjet service = new ImpDaoProjet();
    public void setP(Projet p) {
        this.p = p;
    }
    
    public void ajoutProjet(){
        service.ajouterProjet(p);
    }
    public void modifProjet(){
        service.modifierProjet(p);
    }
    public void SupprProjet(String id){
        service.supprimerProjet(id);
    }
    public List<Projet> listeProjet(){
        return service.listerProjet();
    }
    
    
}
