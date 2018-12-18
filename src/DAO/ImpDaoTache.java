/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Projet;
import Beans.Ressource;
import Beans.Tache;
import Utilities.SingletonConnexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author faiza
 */
public class ImpDaoTache implements IDaoTache{

    private static Connection Con=SingletonConnexion.getCon();
    
    @Override
    public void AjoutTach(Tache t,String idPro, String idRes) {
        try{
            PreparedStatement ps=Con.prepareStatement("insert into tache values (?,?,?,?,?,?,?,?)");
            ps.setString(1, t.getIdTache() );
            ps.setString(2, t.getNomTache());
            ps.setString(3, t.getDescriptionTache());
            java.sql.Date sqlDate = new java.sql.Date(t.getDelaiTache().getTime());
            ps.setDate(4, sqlDate);
            ps.setString(5, t.getFonctionRessource());
            ps.setInt(6, t.getNumOrdreRessource());
            ps.setString(7, idRes);
            ps.setString(8, idPro);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Nvlle tâche ajoutée et affectée à "+idRes);
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
    }

    @Override
    public List<Tache> listerTache() {
        List<Tache> lst=new ArrayList<Tache>();
        try{
            PreparedStatement ps=Con.prepareStatement("select * from tache");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                String idt=rs.getString("idTache");
                String nomt=rs.getString("nomTache");
                String desc=rs.getString("descriptionTache");
                Date d=rs.getDate("delaiTache");
                String fn=rs.getString("fonction");
                int numO=rs.getInt("numOrdre");
                String idr=rs.getString("ncin");
                String idp=rs.getString("idProjet");
                
                Tache t=new Tache(idt,nomt,desc,d,fn,numO,idp,idr);
                
            }
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
        
    return lst;
    }

    
    
}
