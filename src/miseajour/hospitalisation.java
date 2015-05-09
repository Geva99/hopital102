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
        public void inserthospitalisation (String codeSer, String numCha, String surveillant, int lit) throws SQLException
    {
        String cmd = "INSERT INTO hospitalisation VALUES ('codeSer','numCha','surveillant','nbLits')";
        executeUpdate(cmd);
    }
    public void modifhospitalisation (String numMalade, String codeSer, String numCha, int lit) throws SQLException
    {
        String maj1 = "UPDATE hospitalisation SET no_malade = '"+numMalade+"' WHERE (no_malade = '"+numMalade+"')";
        executeUpdate(maj1);
        String maj2 = "UPDATE hospitalisation SET code_service = '"+codeSer+"' WHERE (no_malade = '"+numMalade+"')";
        executeUpdate(maj2);
        String maj3 = "UPDATE hospitalisation SET no_chambre = '"+numCha+"' WHERE (no_malade = '"+numMalade+"')";
        executeUpdate(maj3);
        String maj4 = "UPDATE hospitalisation SET no_chambre = '"+lit+"' WHERE (no_malade = '"+numMalade+"')";
        executeUpdate(maj4);
        
    }   
    
    public void supprhospitalisation (String numSurv, String codeSer, String numCha)
    {
        String cmd = "DELETE FROM hospitalisation WHERE (code_service = '"+codeSer+"' && no_chambre = '"+numCha+"')"
        executeUpdate(cmd);
    }
    
}
