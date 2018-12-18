/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Date;

/**
 *
 * @author faiza
 */
public class Tache {
    private String idTache;
    private String nomTache;
    private String descriptionTache;
    private Date delaiTache;
    private String fonctionRessource;
    private int numOrdreRessource;
    //private Projet projetPere;
    //private Ressource ressourceAGerer;
    private String idProjet;
    private String idRessource;

    /*public Tache(String idTache, String nomTache, String descriptionTache, Date delaiTache, int numOrdreRessource,String fonctionRessource,  Projet projetPere, Ressource ressourceAGerer) {
        this.idTache = idTache;
        this.nomTache = nomTache;
        this.descriptionTache = descriptionTache;
        this.delaiTache = delaiTache;
        this.fonctionRessource = fonctionRessource;
        this.numOrdreRessource = numOrdreRessource;
        this.projetPere = projetPere;
        this.ressourceAGerer = ressourceAGerer;
    }*/

    public Tache(String idTache, String nomTache, String descriptionTache, Date delaiTache, String fonctionRessource, int numOrdreRessource, String idProjet,String idRessource) {
        this.idTache = idTache;
        this.nomTache = nomTache;
        this.descriptionTache = descriptionTache;
        this.delaiTache = delaiTache;
        this.fonctionRessource = fonctionRessource;
        this.numOrdreRessource = numOrdreRessource;
        this.idProjet=idProjet;
        this.idTache=idTache;
    }

    public String getIdProjet() {
        return idProjet;
    }

    public String getIdRessource() {
        return idRessource;
    }
    

    public String getIdTache() {
        return idTache;
    }

    public String getNomTache() {
        return nomTache;
    }

    public String getDescriptionTache() {
        return descriptionTache;
    }

    public Date getDelaiTache() {
        return delaiTache;
    }

    public String getFonctionRessource() {
        return fonctionRessource;
    }

    public int getNumOrdreRessource() {
        return numOrdreRessource;
    }

    /*public Projet getProjetPere() {
        return projetPere;
    }

    public Ressource getRessourceAGerer() {
        return ressourceAGerer;
    }*/

    
    
    
    
}
