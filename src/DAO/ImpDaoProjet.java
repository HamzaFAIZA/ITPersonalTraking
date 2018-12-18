/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Projet;
import Utilities.SingletonConnexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author faiza
 */
public class ImpDaoProjet implements IDaoProjet{

    static Connection Con=SingletonConnexion.getCon();
    
    @Override
    public void ajouterProjet(Projet p) {
        try{
            PreparedStatement ps=Con.prepareCall("insert into projet values(?,?,?,?,?)");
            ps.setString(1, p.getIdProjet());
            ps.setString(2, p.getNomProjet());
            ps.setString(3, p.getDescriptionProjet());
            java.sql.Date dated = new java.sql.Date(p.getDateDebut().getTime());
            ps.setDate(4, dated);
            java.sql.Date datef = new java.sql.Date(p.getDateFin().getTime());
            ps.setDate(5, datef);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Nouveau projet ajouté");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void modifierProjet(Projet p) {
        try{
            PreparedStatement ps=Con.prepareCall("update projet set nomProjet= ? , descriptionProjet= ? , dateDebut= ? , dateFin= ? where idProjet= ? ");
            ps.setString(5, p.getIdProjet());
            ps.setString(1, p.getNomProjet());
            ps.setString(2, p.getDescriptionProjet());
            java.sql.Date dated = new java.sql.Date(p.getDateDebut().getTime());
            ps.setDate(3, dated);
            java.sql.Date datef = new java.sql.Date(p.getDateFin().getTime());
            ps.setDate(4, datef);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Le projet est modifié avec succés");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void supprimerProjet(String id) {
        try{
            PreparedStatement ps=Con.prepareCall("delete from projet where idProjet= ?");
            ps.setString(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Le Projet est supprimé");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public List<Projet> listerProjet() {
        List<Projet> lst=new ArrayList<Projet>();
        try{
            PreparedStatement ps=Con.prepareCall("select * from projet");
            ResultSet rs=ps.executeQuery();
            Projet p;
            while(rs.next()){
                String id=rs.getString("idProjet");
                String no=rs.getString("nomProjet");
                String des=rs.getString("descriptionProjet");
                java.util.Date Dated = new Date(rs.getDate("dateDebut").getTime());
                java.util.Date Datef = new Date(rs.getDate("dateFin").getTime());
                p=new Projet(id,no,des,Dated,Datef,null,null);
                lst.add(p);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return lst;
    }
    
}
