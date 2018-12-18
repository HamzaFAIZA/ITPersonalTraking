/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Beans.Equipe;
import DAO.IpmDaoEquipe;
import java.util.List;

/**
 *
 * @author faiza
 */
public class ModelEquipe {
    private Equipe eq;
    private IpmDaoEquipe service=new IpmDaoEquipe();
    
    public List<Equipe> listerEquipes(){
        return service.listerEquipe();
    }

    public void ajouterRessourceAEquipes(String r){
        service.ajouterRessourcesAEquipe(eq,r);
    }
    
    public void ajouterEquipes(){
        service.ajouterEquipe(eq);
    }
    
    public void setEq(Equipe eq) {
        this.eq = eq;
    }
    
}
