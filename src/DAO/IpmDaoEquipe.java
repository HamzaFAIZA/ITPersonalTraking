/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Equipe;
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
public class IpmDaoEquipe implements IDaoEquipe{
    static Connection Con=SingletonConnexion.getCon();

    @Override
    public void ajouterEquipe(Equipe e) {
        try{
            PreparedStatement ps=Con.prepareStatement("insert into equipe values (?)");
            ps.setString(1, e.getIdEquipe());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Nvlle équipe ajoutée");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        
    }
    }

    public void ajouterRessourcesAEquipe(Equipe e,String r){
        
            try{
                PreparedStatement pss=Con.prepareStatement("select * from equipe where idEquipe= ? ");
                pss.setString(1, e.getIdEquipe());
                ResultSet rx=pss.executeQuery();
                if(rx.next()){
                    
                    try{
                            PreparedStatement ps=Con.prepareStatement("insert into rappartiente values( ? , ? )");
                            ps.setString(1, r);
                            ps.setString(2, e.getIdEquipe());
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null,"la ressource "+r+" s'est ajoutée à l équipe "+e.getIdEquipe());
                        }catch(Exception exx){
                                            JOptionPane.showMessageDialog(null,exx.getMessage());
        
                                             }
                }else{
                    JOptionPane.showMessageDialog(null,"\nL'équipe est introuvable. Vous devez la créér ...");
                }
                    }catch(Exception ex){
                            JOptionPane.showMessageDialog(null,ex.getMessage()); 
                                        }
    
    }
    
    @Override
    public List<Equipe> listerEquipe() {
        List<Equipe> lst=new ArrayList<Equipe>();
        try{
            PreparedStatement ps=Con.prepareStatement("select * from equipe");
            ResultSet rs=ps.executeQuery();
            Equipe e;
            while(rs.next()){
                String id=rs.getString("idEquipe");
                e=new Equipe(id,null);
                lst.add(e);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        
    }
        
    return lst;
    }
    
    
}
