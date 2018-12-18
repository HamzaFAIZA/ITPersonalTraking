/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Beans.Equipe;
import Beans.Ressource;
import com.sun.corba.se.pept.transport.Selector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ModelEquipe;
import model.ModelRessource;
import model.ModelTableEquipe;
import model.ModelTableIdRessource;
import view.ViewEquipe;

/**
 *
 * @author faiza
 */
public class ControllerEquipe implements ActionListener,ListSelectionListener{
    private ViewEquipe viewE;
    private ModelEquipe modEq=new ModelEquipe();
    private ModelTableEquipe modtabEq;
    private ModelRessource modRes=new ModelRessource();
    private ModelTableIdRessource modtabid;
    
    public ControllerEquipe(ViewEquipe v){
        this.viewE=v;
        initialiserTableau();
        addlistener();
        initialiserJComboRessource();
        initialiserJComboEquipe();
    }
    public void initialiserTableau(){
        List<Equipe> lst=new ArrayList<Equipe>();
        lst=modEq.listerEquipes();
        modtabEq=new ModelTableEquipe(lst);
        viewE.getjTableEquipe().setModel(modtabEq);
        
    }
    public void addlistener(){
        viewE.getjButtonAjoutEquipe().addActionListener(this);
        viewE.getjButtonAjoutRessource().addActionListener(this);
        viewE.getjComboEquipe().addActionListener(this);
    }

    public void initialiserJComboRessource(){
        List<Ressource> lstRes=new ArrayList<Ressource>();
        lstRes=modRes.listerRessource();
        for(int i=0;i<lstRes.size();i++){
            viewE.getjComboBoxListeRessource().addItem(lstRes.get(i).getNcin());
        }
        
    }
    
    public void initialiserJComboEquipe(){
        List<Equipe> lstEq=new ArrayList<Equipe>();
        lstEq=modEq.listerEquipes();
        for(int i=0;i<lstEq.size();i++){
            viewE.getjComboEquipe().addItem(lstEq.get(i).getIdEquipe());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Ajouter une équipe")){
            String id=viewE.getjTextIdEquipe().getText();
            Equipe e=new Equipe(id,null);
            modEq.setEq(e);
            modEq.ajouterEquipes();
        }
        else{
            if(ae.getActionCommand().equals("Ajouter la ressource à l'équipe")){
                String id=viewE.getjTextIdEquipe().getText();
                String Res=String.valueOf(viewE.getjComboBoxListeRessource().getSelectedItem());
                modEq.setEq(new Equipe(id,null));
                modEq.ajouterRessourceAEquipes(Res);
            }
        }initialiserTableau();
            if(viewE.getjComboEquipe().getSelectedIndex() > 0){
                    List<String> lst=new ArrayList<String>();
                    lst=modRes.listerRessourceParEquipe(String.valueOf(viewE.getjComboEquipe().getSelectedItem()));
                    modtabid=new ModelTableIdRessource(lst);
                    viewE.getjTableEquipe().setModel(modtabid);
        }        
            
        
        
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        //
    }
    
}
