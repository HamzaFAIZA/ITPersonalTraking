/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import Beans.Equipe;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author faiza
 */
public class ModelTableEquipe extends AbstractTableModel{
    private List<Equipe> ligne;
    private List<String> colonne;
    
    public ModelTableEquipe(List<Equipe> ligne) {
        this.ligne = ligne;
        this.colonne = Arrays.asList("Identifiant équipe");
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
        Equipe p = ligne.get(i);
        switch (i1) {
            case 0:
                return p.getIdEquipe();
                                
        }
        
        return null;
    }
 
    
}
