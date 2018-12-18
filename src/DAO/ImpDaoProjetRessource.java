/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Projet;
import Beans.Ressource;
import Utilities.SingletonConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author faiza
 */
public class ImpDaoProjetRessource implements IDaoProjetRessource{

    static Connection Con=SingletonConnexion.getCon();
    
    @Override
    public void affecterRessource(String r,String p) {
        try{
            PreparedStatement ps=Con.prepareStatement("insert into rgerep values(?,?)");
            ps.setString(1, r);
            ps.setString(2, p);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"La ressource "+r+" est affecté au projet "+p);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }            
    }
    
}
