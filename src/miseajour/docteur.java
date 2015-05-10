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
public class docteur extends miseajour{
    
    docteur doc = new docteur ();
    
    public void insertDoc (int numerodoc, String spedoc, String nomemp, String prenomemp, String adresse,int tel) throws SQLException
    {
        String cmd1 = "INSERT INTO docteur VALUES ('"+numerodoc+"','"+spedoc+"')";
        doc.executeUpdate(cmd1);
        String cmd2 = "INSERT INTO employe VALUES ('"+numerodoc+"','"+nomemp+"','"+prenomemp+"','"+adresse+"','"+tel+"')";
        doc.executeUpdate(cmd2);
    }
    
    //        ResultSet rs = stmt.executeQuery("UPDATE chambre SET surveillant = 'numSurv' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')");

    public void modifDoc (int anciennumerodoc, int numerodoc, String spedoc) throws SQLException
    {
        //On modifie un docteur
        String maj1 = "UPDATE docteur SET docteur.numero == '"+numerodoc+"' WHERE (docteur.numero=='"+anciennumerodoc+"')";
        doc.executeUpdate (maj1);
        String maj2 = "UPDATE docteur SET docteur.specialité == '"+spedoc+"' WHERE (docteur.numero=='"+anciennumerodoc+"')";
        doc.executeUpdate (maj2);
        
            //On modifie en même temps un employé
        String maj3 = "UPDATE employe SET employe. == '"+numerodoc+"' WHERE (employe.numero=='"+anciennumerodoc+"')";
        doc.executeUpdate (maj3);
        // On modifie ou on essaie de modifier dans les tables infirmier et docteur:
        
    }
    
    public void supprDoc (int numerodoc) throws SQLException
    {
        String cmd1 = "DELETE FROM employe WHERE (employe.numero=='"+numerodoc+"')";
        doc.executeUpdate(cmd1);
        String cmd2 = "DELETE FROM docteur WHERE (docteur.numero=='"+numerodoc+"')";
        doc.executeUpdate(cmd2);
    }
    
}
