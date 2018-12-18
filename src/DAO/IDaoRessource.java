/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Ressource;
import java.util.List;

/**
 *
 * @author faiza
 */
public interface IDaoRessource {
    public void ajouterRessource(Ressource r);
    public void modifierRessource(Ressource r);
    public void supprimerRessource(String ncin);
    public List<Ressource> listeRessource();
    public List<String> listerRessourceParEquipe(String idEquipe);
}
