/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Beans.Ressource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ModelRessource;
import model.ModelTableRessource;
import view.ViewRessource;

/**
 *
 * @author faiza
 */
public class ControllerRessource implements ActionListener,ListSelectionListener{
    
    private ViewRessource viewR;
    private ModelRessource modRes=new ModelRessource();
    private ModelTableRessource modtabRes;
    
    public ControllerRessource(ViewRessource v){
        this.viewR=v;
        addListeners();
        initialiserTableRessource();
    }
    
    public void initialiserTableRessource(){
        List<Ressource> lst=new ArrayList<Ressource>();
        lst=modRes.listerRessource();
        modtabRes=new ModelTableRessource(lst);
        viewR.getjTableRessource().setModel(modtabRes);
    }
    
    public void addListeners(){
        viewR.getjButton1().addActionListener(this);
        viewR.getjButton2().addActionListener(this);
        viewR.getjButton3().addActionListener(this);
        viewR.getjTableRessource().getSelectionModel().addListSelectionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Ajouter")){
            String ncin=viewR.getjTextNcin().getText();
            String prenom=viewR.getjTextPrenom().getText();
            String nom=viewR.getjTextNom().getText();
            Ressource r=new Ressource(ncin,prenom,nom,null,null);
            modRes.setRes(r);
            modRes.ajouterRessource();
            
        }
        else{
            if(ae.getActionCommand().equals("Supprimer")){
                String ncin=viewR.getjTextNcin().getText();
                modRes.supprimerRessource(ncin);
            }
            else{
                if(ae.getActionCommand().equals("Modifier")){
                    String ncin=viewR.getjTextNcin().getText();
                    String prenom=viewR.getjTextPrenom().getText();
                    String nom=viewR.getjTextNom().getText();
                    Ressource r=new Ressource(ncin,prenom,nom,null,null);
                    modRes.setRes(r);
                    modRes.modifierRessource();
                }
            }
                }
        initialiserTableRessource();
                
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        int pos=viewR.getjTableRessource().getSelectedRow();
        if(pos != -1){
            viewR.getjTextNcin().setText(String.valueOf(viewR.getjTableRessource().getValueAt(pos, 0)));
            viewR.getjTextPrenom().setText(String.valueOf(viewR.getjTableRessource().getValueAt(pos, 1)));
            viewR.getjTextNom().setText(String.valueOf(viewR.getjTableRessource().getValueAt(pos, 2)));
        }
    }
    
    
}
