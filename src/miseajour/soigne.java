/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miseajour;

import java.sql.SQLException;

/**
 *
 * @author Twentycent_ONE
 */
public class soigne extends miseajour{
    
    soigne soi = new soigne ();
    
    public void insertSoi(int numerodoc, int numeromalade) throws SQLException
    {
        String cmd1 = "INSERT INTO soigne VALUES ('"+numerodoc+"','"+numeromalade+"')";
        soi.executeUpdate(cmd1);
    }
    

    public void modifSoi (int anciennumerodoc, int numerodoc, int anciennumeromalade, int numeromalade) throws SQLException
    {
        //On modifie le médecin qui s'occupe d'un patient
        
        String maj = "UPDATE soigne SET (soigne.no_docteur == '"+numerodoc+"' && soigne.no_malade == '"+numeromalade+"') WHERE (soigne.no_docteur=='"+anciennumerodoc+"' && soigne.no_malade=='"+numeromalade+"')";
        soi.executeUpdate (maj); 
    }
    
    public void supprSoi (int numerodoc, int numeromalade) throws SQLException
    {
        String cmd1 = "DELETE FROM soigne WHERE (soigne.numero_docteur=='"+numerodoc+"'&&soigne.numero_malade=='"+numeromalade+"')";
        soi.executeUpdate(cmd1);
    }

}
