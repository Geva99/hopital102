
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
    
    public void insertInf (int numeroinf, String codeservice ,String rot, float sal, String nomemp, String prenomemp, String adresse,int tel) throws SQLException
    {
        String cmd1 = "INSERT INTO infirmier VALUES ('"+numeroinf+"','"+codeservice+"','"+rot+"','"+sal+"')";
        inf.executeUpdate(cmd1);
        String cmd2 = "INSERT INTO employe VALUES ('"+numeroinf+"','"+nomemp+"','"+prenomemp+"','"+adresse+"','"+tel+"')";
        inf.executeUpdate(cmd2);
    }
    
  public void modifInf (int anciennumeroinf, int numeroinf, String codeservice, String rot, float sal) throws SQLException
    {
        //On modifie un docteur
        
        String maj1 = "UPDATE infirmier SET infirmier.code_service == '"+codeservice+"' WHERE (infirmier.numero=='"+anciennumeroinf+"')";
        inf.executeUpdate (maj1);
        String maj2 = "UPDATE infirmier SET infirmier.rotation == '"+rot+"' WHERE (infirmier.numero=='"+anciennumeroinf+"')";
        inf.executeUpdate (maj2);
        String maj3 = "UPDATE infirmier SET salaire == '"+sal+"' WHERE (infirmier.numero=='"+anciennumeroinf+"')";
        inf.executeUpdate (maj3);
        String maj4 = "UPDATE infirmier SET infirmier.numero == '"+numeroinf+"' WHERE (infirmier.numero=='"+anciennumeroinf+"')";
        inf.executeUpdate (maj4);
            //On modifie en même temps un employé
        String maj5 = "UPDATE employe SET employe. == '"+numeroinf+"' WHERE (employe.numero=='"+anciennumeroinf+"')";
        inf.executeUpdate (maj5);
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

