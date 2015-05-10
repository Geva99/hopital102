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

 public class malade extends miseajour{
    
    malade mala = new malade ();
    
    public void insertMala (int numeromala, String nommala, String prenommala, String adresse,int tel, String mutuelle) throws SQLException
    {
        String cmd1 = "INSERT INTO malade VALUES ('"+numeromala+"','"+nommala+"','"+prenommala+"','"+adresse+"','"+tel+"')";
        mala.executeUpdate(cmd1);
    }
    
 

    public void modifMala (int anciennumeromala, int numeromala, String nommala, String prenommala, String adressemala,int telmala, String mutuelle) throws SQLException
    {
        //On modifie un malade
       
        String maj1 = "UPDATE malade SET malade.nom == '"+nommala+"' WHERE (malade.numero=='"+anciennumeromala+"')";
        mala.executeUpdate (maj1);
        String maj2 = "UPDATE malade SET malade.prenom == '"+prenommala+"' WHERE (malade.numero=='"+anciennumeromala+"')";
        mala.executeUpdate (maj2);
        String maj3 = "UPDATE malade SET malade.adresse == '"+adressemala+"' WHERE (malade.numero=='"+anciennumeromala+"')";
        mala.executeUpdate (maj3);
        String maj4 = "UPDATE malade SET malade.tel == '"+telmala+"' WHERE (malade.numero=='"+anciennumeromala+"')";
        mala.executeUpdate (maj4);
        String maj5 = "UPDATE malade SET malade.numero == '"+numeromala+"' WHERE (malade.numero=='"+anciennumeromala+"')";
        mala.executeUpdate (maj5);
        // On modifie aussi le numéro malade dans la table soigne        
       String maj6 = "UPDATE soigne SET soigne.no_malade == '"+numeromala+"' WHERE (soigne.no_malade=='"+anciennumeromala+"')";
        mala.executeUpdate (maj6);
    }
    public void supprMala (int numeromala) throws SQLException
    {
        String cmd1 = "DELETE FROM malade WHERE (malade.numero=='"+numeromala+"')";
        mala.executeUpdate(cmd1);
        String cmd2 = "DELETE FROM soigne WHERE (soigne.no_malade=='"+numeromala+"')";
        mala.executeUpdate(cmd2);
    }
    
}
