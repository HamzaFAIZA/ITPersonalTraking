/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Ressource;
import Utilities.SingletonConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author faiza
 */
public class ImpDaoRessource implements IDaoRessource{
    static Connection Con=SingletonConnexion.getCon();
    
    
    @Override
    public void ajouterRessource(Ressource r) {
        try{
            PreparedStatement ps=Con.prepareStatement("insert into ressource values(?,?,?)");
            ps.setString(1, r.getNcin());
            ps.setString(2, r.getPrenom());
            ps.setString(3, r.getNom());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"produit ajouté");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    @Override
    public void modifierRessource(Ressource r) {
       
        try{
            PreparedStatement ps=Con.prepareStatement("update ressource set prenom= ? , nom= ? where ncin= ?");
            ps.setString(1, r.getPrenom());
            ps.setString(2, r.getNom());
            ps.setString(3, r.getNcin());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Ressource modifiée");            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void supprimerRessource(String ncin) {
        
        try{
            PreparedStatement ps=Con.prepareStatement("delete from ressource where ncin= ?");
            ps.setString(1, ncin);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Ressource supprimée");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }

    @Override
    public List<Ressource> listeRessource() {
        List<Ressource> lst=new ArrayList<Ressource>();
        try{
            PreparedStatement ps=Con.prepareStatement("select * from ressource");
            ResultSet rs=ps.executeQuery();
            Ressource r;
            while(rs.next()){
                String ncin=rs.getString("ncin");
                String prenom=rs.getString("prenom");
                String nom=rs.getString("nom");
                r=new Ressource(ncin,prenom,nom,null,null);
                lst.add(r);                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return lst;
    }

    @Override
    public List<String> listerRessourceParEquipe(String idEquipes) {
        List<String> lst=new ArrayList<String>();
        try{
            PreparedStatement ps=Con.prepareStatement("select ncin from rappartiente where idEquipe= ?");
            ps.setString(1, idEquipes );
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String ID=rs.getString("ncin");
                lst.add(ID);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return lst;
        
    }
    
}
