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
        public void inserthospitalisation (String codeSer, String numCha, String surveillant, String nbLits)
    {
        String cmd = "INSERT INTO hospitalisation VALUES ('codeSer','numCha','surveillant','nbLits')";
        ajouterRequete(cmd);
    }
    public void modifhospitalisationk (String numSurv, String codeSer, String numCha)
    {
        ajouterRequete("UPDATE hospitalisation SET surveillant = 'numSurv' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')");
    }
    public void modifhospitalisation (String numSurv, String codeSer, String numCha)
    {
        ajouterRequete("UPDATE hospitalisation SET surveillant = 'numSurv' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')");
    }
    
    
    public void supprhospitalisation (String numSurv, String codeSer, String numCha)
    {
        ajouterRequete("DELETE FROM hospitalisation WHERE (code_service = 'codeSer' && no_chambre = 'numCha')");
    }
    
}
