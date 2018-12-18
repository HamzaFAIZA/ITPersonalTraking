/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.List;

/**
 *
 * @author faiza
 */
public class Equipe {
    private String idEquipe;
    private List<Ressource> lstRessource;

    public Equipe(String idEquipe, List<Ressource> lstRessource) {
        this.idEquipe = idEquipe;
        this.lstRessource = lstRessource;
    }

    public String getIdEquipe() {
        return idEquipe;
    }

    public List<Ressource> getLstRessource() {
        return lstRessource;
    }
    
    
}
