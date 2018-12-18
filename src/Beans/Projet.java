/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Date;
import java.util.List;

/**
 *
 * @author faiza
 */
public class Projet {
    private String idProjet;
    private String nomProjet;
    private String descriptionProjet;
    private Date dateDebut;
    private Date dateFin;
    private List<Tache> lstTache;
    private List<Ressource> lstRessource;

    public Projet(String idProjet, String nomProjet, String descriptionProjet, Date dateDebut, Date dateFin, List<Tache> lstTache, List<Ressource> lstRessource) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.descriptionProjet = descriptionProjet;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.lstTache = lstTache;
        this.lstRessource = lstRessource;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    

    public String getIdProjet() {
        return idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public String getDescriptionProjet() {
        return descriptionProjet;
    }

    

    public List<Tache> getLstTache() {
        return lstTache;
    }

    public List<Ressource> getLstRessource() {
        return lstRessource;
    }
    
    
    
}
