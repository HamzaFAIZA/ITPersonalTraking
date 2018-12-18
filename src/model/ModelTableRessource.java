/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Beans.Ressource;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author faiza
 */
public class ModelTableRessource extends AbstractTableModel{
    

    private List<Ressource> ligne;
    private List<String> colonne;
    
    public ModelTableRessource(List<Ressource> ligne) {
        this.ligne = ligne;
        this.colonne = Arrays.asList("NCIN","Prénom","Nom");
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
        Ressource p = ligne.get(i);
        switch (i1) {
            case 0:
                return p.getNcin();
            case 1:
                return p.getPrenom();
            case 2:
                return p.getNom();
            
        }
        
        return null;
    }
    
}
