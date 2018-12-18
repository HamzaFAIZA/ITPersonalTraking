/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Beans.Projet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ModelProjet;
import model.ModelTableProjet;
import view.ViewProjet;

/**
 *
 * @author faiza
 */
public class ControllerProjet implements ActionListener,ListSelectionListener{
    
    private ViewProjet viewP;
    private ModelProjet modpro=new ModelProjet();
    private ModelTableProjet modtabpro;
    public ControllerProjet(ViewProjet viewP) {
        this.viewP = viewP;
        addListeners();
        initialiserTableau();
    }
    
    public void initialiserTableau(){
        List<Projet> lst=new ArrayList<Projet>();
        lst=modpro.listeProjet();
        modtabpro= new ModelTableProjet(lst);
        viewP.getjTableProjet().setModel(modtabpro);
    }
    public void addListeners(){
        viewP.getjButtonAjout().addActionListener(this);
        viewP.getjButtonModifier().addActionListener(this);
        viewP.getjButtonSupprimer().addActionListener(this);
        viewP.getjTableProjet().getSelectionModel().addListSelectionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Ajouter")){
            String id=viewP.getjTextIDPro().getText();
            String nom=viewP.getjTextNomPro().getText();
            String desc=viewP.getjTextDescPro().getText();
            Date datdeb=viewP.getjDateChooserDebut().getDate();
            Date datfin=viewP.getjDateChooserFin().getDate();
            
            Projet p=new Projet(id,nom,desc,datdeb,datfin,null,null);
            modpro.setP(p);
            modpro.ajoutProjet();
        }else{
            if(ae.getActionCommand().equals("Modifier")){
                String id=viewP.getjTextIDPro().getText();
                String nom=viewP.getjTextNomPro().getText();
                String desc=viewP.getjTextDescPro().getText();
                Date datdeb=viewP.getjDateChooserDebut().getDate();
                Date datfin=viewP.getjDateChooserFin().getDate();
            
                Projet p=new Projet(id,nom,desc,datdeb,datfin,null,null);
                modpro.setP(p);
                modpro.modifProjet();
            }
            else{
                if(ae.getActionCommand().equals("Supprimer")){
                    String id=viewP.getjTextIDPro().getText();
                    modpro.SupprProjet(id);
                }
            }
        }
        initialiserTableau();
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        int pos=viewP.getjTableProjet().getSelectedRow();
        if(pos != -1){
            viewP.getjTextIDPro().setText(String.valueOf(viewP.getjTableProjet().getValueAt(pos, 0)));
            viewP.getjTextNomPro().setText(String.valueOf(viewP.getjTableProjet().getValueAt(pos, 1)));
            viewP.getjTextDescPro().setText(String.valueOf(viewP.getjTableProjet().getValueAt(pos, 2)));
            viewP.getjDateChooserDebut().setDate((Date)viewP.getjTableProjet().getValueAt(pos, 3));
            viewP.getjDateChooserFin().setDate((Date)viewP.getjTableProjet().getValueAt(pos, 4));
        }
    }
    
}
