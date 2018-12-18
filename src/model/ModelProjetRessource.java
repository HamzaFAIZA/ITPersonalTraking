/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Beans.Projet;
import Beans.Ressource;
import DAO.ImpDaoProjetRessource;

/**
 *
 * @author faiza
 */
public class ModelProjetRessource {
    private ImpDaoProjetRessource service = new ImpDaoProjetRessource();
    
    public void affectRessource(String r,String p){
        service.affecterRessource(r, p);
    }

    
    
}
