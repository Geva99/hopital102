/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miseajour;


import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import Recherche.Recherche_info;
import Stockage.Hospitalisation;
/**
 *
 * @author Twentycent_ONE
 */
public class hospitalisation extends miseajour {
        public void inserthospitalisation (String codeSer, int numCha, int surveillant, int lit) throws SQLException
    {
        String cmd = "INSERT INTO hospitalisation VALUES ('codeSer','numCha','surveillant','nbLits')";
        executeUpdate(cmd);
    }
    public void modifhospitalisation (int anciennumMalade, int numMalade, String codeSer, int numCha, int lit) throws SQLException
    {
        
        String maj1 = "UPDATE hospitalisation SET code_service == '"+codeSer+"' WHERE (no_malade == '"+anciennumMalade+"')";
        executeUpdate(maj1);
        String maj2 = "UPDATE hospitalisation SET no_chambre == '"+numCha+"' WHERE (no_malade == '"+anciennumMalade+"')";
        executeUpdate(maj2);
        String maj3 = "UPDATE hospitalisation SET no_chambre == '"+lit+"' WHERE (no_malade == '"+anciennumMalade+"')";
        executeUpdate(maj3);
        String maj4 = "UPDATE hospitalisation SET no_malade == '"+numMalade+"' WHERE (no_malade == '"+anciennumMalade+"')";
        executeUpdate(maj4);
    }   
    
    public void supprhospitalisation (String codeSer, int numCha) throws SQLException
    {
        String cmd = "DELETE FROM hospitalisation WHERE (code_service == '"+codeSer+"' && no_chambre == '"+numCha+"')";
        executeUpdate(cmd);
    }
    
}
