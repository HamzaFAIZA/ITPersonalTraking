/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Beans.Projet;
import Beans.Ressource;
import Beans.Tache;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ModelProjet;
import model.ModelRessource;
import model.ModelTableTache;
import model.ModelTache;
import view.ViewTache;

/**
 *
 * @author faiza
 */
public class ControllerTache implements ActionListener,ListSelectionListener{
    private ViewTache viewT;
    private ModelTache modtache=new ModelTache();
    private ModelTableTache modtabta;
    private ModelRessource modRes=new ModelRessource();
    private ModelProjet modpro=new ModelProjet();
    
    public ControllerTache( ViewTache v){
        this.viewT=v;
        addListeners();
        initialiserTableau();
        initialiserJComboRessource();
        initialiserJComboProjet();
    }
    public void addListeners(){
        viewT.getjButtonAjouterTache().addActionListener(this);
    }

    public void initialiserTableau(){
        List<Tache> lst=new ArrayList<Tache>();
        lst=modtache.listeTache();
        modtabta=new ModelTableTache(lst);
        viewT.getjTable1().setModel(modtabta);
    }
    public void initialiserJComboProjet(){
        List<Projet> lst=new ArrayList<Projet>();
        lst=modpro.listeProjet();
        for(int i=0;i<lst.size();i++){
        viewT.getjComboIdPro().addItem(lst.get(i).getIdProjet());
        }
        
    }
    
    public void initialiserJComboRessource(){
        List<Ressource> lstRes=new ArrayList<Ressource>();
        lstRes=modRes.listerRessource();
        for(int i=0;i<lstRes.size();i++){
            viewT.getjComboIDRT().addItem(lstRes.get(i).getNcin());
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Ajouter Nvlle Tâche")){
            String idT=viewT.getjTextIDTache().getText();
            String nomT=viewT.getjTextNomT().getText();
            String desc=viewT.getjTextDescTache().getText();
            Date del=viewT.getjDateChooserDelai().getDate();
            String fonc=viewT.getjTextFontionT().getText();
            String NumOr=viewT.getjTextNumOrdreT().getText();
            String idPro=String.valueOf(viewT.getjComboIdPro().getSelectedItem());
            String idRes=String.valueOf(viewT.getjComboIDRT().getSelectedItem());
            
            
            Tache t=new Tache(idT,nomT,desc,del,fonc,Integer.parseInt(NumOr),null,null);
            modtache.setT(t);
            modtache.ajouterTache(idPro,idRes);
        }
        initialiserTableau();
        
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        
    }
    
    
}
