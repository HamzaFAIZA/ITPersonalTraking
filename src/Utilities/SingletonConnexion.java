/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author faiza
 */
public class SingletonConnexion {
    
    private static Connection Con;
    
    static{
        
            try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver détecté");
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiontachespersonnel","root","");
            System.out.println("La connexion s'établie");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Verifier votre connexion");
            System.out.println(e.getMessage());
        }
        
    }
    public static Connection getCon(){
        return Con;
    }
        }
    
    

