/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Beans.Tache;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author faiza
 */
public class ModelTableTache extends AbstractTableModel{
    

    private List<Tache> ligne;
    private List<String> colonne;
    
    public ModelTableTache(List<Tache> ligne) {
        this.ligne = ligne;
        this.colonne = Arrays.asList("ID","Nom","Description","delai","Fonction","Num d'ordre","ID Projet","NCIN Ressource");
    }
    
    public String getColumnName(int col) {
        return colonne.get(col);
    }
    
    @Override
    public int getRowCount() {
        return ligne.size();
    }
    
    @Override
    public int getColumnCount() {
        return colonne.size();
    }
    
    @Override
    public Object getValueAt(int i, int i1) {
        Tache t = ligne.get(i);
        switch (i1) {
            case 0:
                return t.getIdTache();
            case 1:
                return t.getNomTache();
            case 2:
                return t.getDescriptionTache();
            case 3: 
                return t.getDelaiTache();
            case 4:
                return t.getNumOrdreRessource();
            case 5:
                return t.getFonctionRessource();
            case 6 :
                return t.getIdProjet();
            case 7:
                return t.getIdRessource();
                
            
        }
        
        return null;
    }
    
}
