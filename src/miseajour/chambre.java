/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miseajour;

import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import Connexion.*;
import Recherche.Recherche_info;

/**
 *
 * @author Twentycent_ONE
 */
public class chambre {
    
    
    public void insertchambre (String codeSer, String numCha, String surveillant, String nbLits)
    {
//        Statement stmt = conn.createStatement();
//        ResultSet rs = stmt.executeQuery("INSERT INTO chambre VALUES ('codeSer','numCha','surveillant','nbLits')");
        String cmd = "INSERT INTO chambre VALUES ('codeSer','numCha','surveillant','nbLits')";
        ajouterRequete (cmd);
    }
    
    //        ResultSet rs = stmt.executeQuery("UPDATE chambre SET surveillant = 'numSurv' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')");

    
    public void modifChambreSurveillant (String codeSer, String numCha, String numSurv)
    {
        String cmd = "UPDATE chambre SET surveillant = 'numSurv' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')";
        ajouterRequete (cmd);
    }
    
     public void modifChambreService (String codeSer, String numCha)
    {
        String cmd = "UPDATE chambre SET code_service = 'codeSer' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')";
        ajouterRequete (cmd);
    }
     
          public void modifChambreNum (String codeSer, String numCha)
    {
        String cmd = "UPDATE chambre SET no_chambre = 'numCha' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')";
        ajouterRequete (cmd);
    }
          
               public void modifChambreNbLits (String codeSer, String numCha, String nbLits)
    {
        String cmd = "UPDATE chambre SET nb_lits = 'nbLits' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')";
        ajouterRequete (cmd);
    }
     
}