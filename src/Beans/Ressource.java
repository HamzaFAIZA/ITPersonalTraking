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
public class Ressource {
    private String ncin;
    private String nom;
    private String prenom;
    
    private List<Projet> lstProjet;
    private List<Equipe> lstEquipe;

    public Ressource(String ncin, String nom, String prenom, List<Projet> lstProjet, List<Equipe> lstEquipe) {
        this.ncin = ncin;
        this.nom = nom;
        this.prenom = prenom;
        
        this.lstProjet = lstProjet;
        this.lstEquipe = lstEquipe;
    }

    public String getNcin() {
        return ncin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Projet> getLstProjet() {
        return lstProjet;
    }

    public List<Equipe> getLstEquipe() {
        return lstEquipe;
    }
    
    
    
}
