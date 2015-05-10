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
public class infirmier extends miseajour {
infirmier inf = new infirmier ();
    
    public void insertInf (int numeroinf, String codeservice ,String rotation, String nomemp, String prenomemp, String adresse,int tel) throws SQLException
    {
        String cmd1 = "INSERT INTO infirmier VALUES ('"+numeroinf+"','"+codeservice+"','"+codeservice+"')";
        inf.executeUpdate(cmd1);
        String cmd2 = "INSERT INTO employe VALUES ('"+numeroinf+"','"+nomemp+"','"+prenomemp+"','"+adresse+"','"+tel+"')";
        inf.executeUpdate(cmd2);
    }
    
    //        ResultSet rs = stmt.executeQuery("UPDATE chambre SET surveillant = 'numSurv' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')");

    public void modifInf (int anciennumeroinf, int numeroinf, String codeservice, String rotation) throws SQLException
    {
        //On modifie un docteur
        String maj1 = "UPDATE infirmier SET infirmier.numero == '"+numeroinf+"' WHERE (infirmier.numero=='"+anciennumeroinf+"')";
        inf.executeUpdate (maj1);
        String maj2 = "UPDATE infirmier SET infirmier.code_service == '"+codeservice+"' WHERE (infirmier.numero=='"+anciennumeroinf+"')";
        inf.executeUpdate (maj2);
        
            //On modifie en même temps un employé
        String maj3 = "UPDATE employé SET employé. == '"+numeroinf+"' WHERE (employe.numero=='"+anciennumeroinf+"')";
        inf.executeUpdate (maj3);
        // On modifie ou on essaie de modifier dans les tables infirmier et docteur:
        
    }
    
    public void supprDoc (int numeroinf) throws SQLException
    {
        String cmd1 = "DELETE FROM employe WHERE (employe.numero=='"+numeroinf+"')";
        inf.executeUpdate(cmd1);
        String cmd2 = "DELETE FROM infirmier WHERE (infirmier.numero=='"+numeroinf+"')";
        inf.executeUpdate(cmd2);
    }
    
}
