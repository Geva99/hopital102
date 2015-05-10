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
public class employe extends miseajour{
        employe emp = new employe(); 
    public void insertEmp (int numeroemp, String nomemp, String prenomemp, String adresse,int tel) throws SQLException
    {
        String cmd = "INSERT INTO employe VALUES ('"+numeroemp+"','"+nomemp+"','"+prenomemp+"','"+adresse+"','"+tel+"')";
        emp.executeUpdate(cmd);
    }
    
    //        ResultSet rs = stmt.executeQuery("UPDATE chambre SET surveillant = 'numSurv' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')");

    public void modifEmp (int numeroemp, String nomemp, String prenomemp, String adresse,int tel) throws SQLException
    {
        //On modifie un employé
        String maj1 = "UPDATE employe SET employe.numero == '"+numeroemp+"' WHERE (employe.numero=='"+numeroemp+"')";
        emp.executeUpdate (maj1);
        String maj2 = "UPDATE employe SET employe.nom == '"+nomemp+"' WHERE (employe.numero=='"+numeroemp+"')";
        emp.executeUpdate (maj2);
        String maj3 = "UPDATE employe SET employe.prenom == '"+prenomemp+"' WHERE (employe.numero=='"+numeroemp+"')";
        emp.executeUpdate (maj3);
        String maj4 = "UPDATE employe SET adresse == '"+adresse+"' WHERE (employe.numero=='"+numeroemp+"')";
        emp.executeUpdate (maj4);
        String maj5 = "UPDATE employe SET tel == '"+tel+"' WHERE (employe.numero=='"+numeroemp+"')";
        emp.executeUpdate (maj5);
    }
    
    public void supprEmp (int numeroemp) throws SQLException
    {
        String cmd1 = "DELETE FROM employe WHERE (employe.numero=='"+numeroemp+"')";
        emp.executeUpdate(cmd1);
    }
}
