/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Beans.Ressource;
import DAO.ImpDaoRessource;
import java.util.List;

/**
 *
 * @author faiza
 */
public class ModelRessource {
    private Ressource Res;
    private ImpDaoRessource service=new ImpDaoRessource();
    
    
    public void ajouterRessource(){
        service.ajouterRessource(Res);
    }
    
    public void supprimerRessource(String ncin){
        service.supprimerRessource(ncin);
    }
    
    public void modifierRessource(){
        service.modifierRessource(Res);
    }
    
    public List<Ressource> listerRessource(){
        return service.listeRessource();
    }

    public void setRes(Ressource Res) {
        this.Res = Res;
    }
    
    public List<String> listerRessourceParEquipe(String idEquipe){
        return service.listerRessourceParEquipe(idEquipe);
    }
    
    
    
}
