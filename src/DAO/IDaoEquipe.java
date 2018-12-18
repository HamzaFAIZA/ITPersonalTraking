/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Equipe;
import java.util.List;

/**
 *
 * @author faiza
 */
public interface IDaoEquipe {
    public void ajouterEquipe(Equipe e);
    public List<Equipe> listerEquipe();
    public void ajouterRessourcesAEquipe(Equipe e,String r);
    
}
