/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author faiza
 */
public class ModelTableProjetRessource extends AbstractTableModel{
    
    private Map<String,String> ligne;
    private List<String> colonne;
    
    public ModelTableProjetRessource(Map<String,String> ligne) {
        this.ligne = ligne;
        this.colonne = Arrays.asList("ID Projet","Nom","Description","Date Début","Date Fin");
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
        /*Map p = ligne.get(i);
        switch (i1) {
            case 0:
                return p.getIdProjet();
            case 1:
                return p.getNomProjet() ;
            case 2 : 
                return p.getDescriptionProjet();
            case 3:
                return p.getDateDebut();
            case 4:
                return p.getDateFin();
                                
        }*/
        
        return null;
    } 
    
}
