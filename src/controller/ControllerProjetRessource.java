/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Beans.Projet;
import Beans.Ressource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ModelProjet;
import model.ModelProjetRessource;
import model.ModelRessource;
import model.ModelTableProjetRessource;
import view.ViewProjetRessource;

/**
 *
 * @author faiza
 */
public class ControllerProjetRessource implements ActionListener{
    
    private ViewProjetRessource viewPR;
    private ModelProjetRessource modprores=new ModelProjetRessource();
    //private ModelTableProjetRessource modtabpr;
    private ModelRessource modRes=new ModelRessource();
    private ModelProjet modpro=new ModelProjet();
    
    public ControllerProjetRessource(ViewProjetRessource v){
        this.viewPR=v;
        initialiserJComboRessource();
        initialiserTableau();
        initialiserJComboProjet();
        addListener();
    }
    public void addListener(){
        viewPR.getjButtonaffecter().addActionListener(this);
    }
    
    public void initialiserTableau(){
        
    }
    
    public void initialiserJComboRessource(){
        List<Ressource> lstRes=new ArrayList<Ressource>();
        lstRes=modRes.listerRessource();
        for(int i=0;i<lstRes.size();i++){
            viewPR.getjComboRessources().addItem(lstRes.get(i).getNcin());
        }    
}
    public void initialiserJComboProjet(){
        List<Projet> lst=new ArrayList<Projet>();
        lst=modpro.listeProjet();
        for(int i=0;i<lst.size();i++){
        viewPR.getjComboProjet().addItem(lst.get(i).getIdProjet());
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Affecter")){
            String idr=String.valueOf(viewPR.getjComboRessources().getSelectedItem());
            String idp=String.valueOf(viewPR.getjComboProjet().getSelectedItem());
            modprores.affectRessource(idr, idp);
        }
    }

    
}
