/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Beans.Tache;
import DAO.ImpDaoTache;
import java.util.List;

/**
 *
 * @author faiza
 */
public class ModelTache {
    private Tache t;
    private ImpDaoTache service=new ImpDaoTache();

    public void setT(Tache t) {
        this.t = t;
    }
    
    public void ajouterTache(String idPro,String idRes){
        service.AjoutTach(t,idPro, idRes);
    }
    
    public List<Tache> listeTache(){
        return service.listerTache();
    }
}
