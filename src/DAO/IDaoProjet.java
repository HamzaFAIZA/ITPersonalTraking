/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Projet;
import java.util.List;

/**
 *
 * @author faiza
 */
public interface IDaoProjet {
    
    public void ajouterProjet(Projet p);
    public void modifierProjet(Projet p);
    public void supprimerProjet(String id);
    public List<Projet> listerProjet();
}
