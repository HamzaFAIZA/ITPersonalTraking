/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Tache;
import java.util.List;

/**
 *
 * @author faiza
 */
public interface IDaoTache {
    public void AjoutTach(Tache t,String idPro,String idTa);
    public List<Tache> listerTache();
    
}
