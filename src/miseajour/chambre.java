/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miseajour;

import java.sql.SQLException;
import java.util.ArrayList;
import Connexion.*;
import Recherche.Recherche_info;
import Stockage.Chambre;
import miseajour.miseajour.*;

/**
 *
 * @author Twentycent_ONE
 */
class chambre extends miseajour{
    
    chambre chambr = new chambre(); 
    public void insertchambre (String codeSer, int numCha, int surveillant, int nbLits) throws SQLException
    {
        String cmd = "INSERT INTO chambre VALUES ('"+codeSer+"','"+numCha+"','"+surveillant+"','"+nbLits+"')";
        chambr.executeUpdate(cmd);
    }
    
    //        ResultSet rs = stmt.executeQuery("UPDATE chambre SET surveillant = 'numSurv' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')");

    public void modifChambre (String codeSer, int numCha, int numSurv, int nbLits) throws SQLException
    {
        String maj1 = "UPDATE chambre SET surveillant = '"+numSurv+"' WHERE (code_service = '"+codeSer+"' && no_chambre = '"+numCha+"')";
        chambr.executeUpdate (maj1);
        String maj2 = "UPDATE chambre SET code_service = '"+codeSer+"' WHERE (code_service = '"+codeSer+"' && no_chambre = '"+numCha+"')";
        chambr.executeUpdate (maj2);
        String maj3 = "UPDATE chambre SET no_chambre = '"+numCha+"' WHERE (code_service = '"+codeSer+"' && no_chambre = '"+numCha+"')";
        chambr.executeUpdate (maj3);
        String maj4 = "UPDATE chambre SET nb_lits = '"+nbLits+"' WHERE (code_service = '"+codeSer+"' && no_chambre = '"+numCha+"')";
        chambr.executeUpdate (maj4);
        
    }
    
    public void supprChambre (int codeSer, int numCha) throws SQLException
    {
        String cmd = "DELETE FROM chambre WHERE (code_service = '"+codeSer+"' && no_chambre = 'numCha')";
        chambr.executeUpdate(cmd);
    }
    
//     public void modifChambreService (String codeSer, String numCha) throws SQLException
//    {
//        String maj2 = "UPDATE chambre SET code_service = 'codeSer' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')";
//        chambr.executeUpdate (maj2);
//    }
//     
//          public void modifChambreNum (String codeSer, String numCha) throws SQLException
//    {
//        String maj3 = "UPDATE chambre SET no_chambre = 'numCha' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')";
//        executeUpdate (maj3);
//    }
//          
//               public void modifChambreNbLits (String codeSer, String numCha, String nbLits) throws SQLException
//    {
//        String maj4 = "UPDATE chambre SET nb_lits = 'nbLits' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')";
//        chambr.executeUpdate (maj4);
//    }
     
}