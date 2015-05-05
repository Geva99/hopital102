/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miseajour;
import java.sql.*;

/**
 *
 * @author Twentycent_ONE
 */
public class chambre {
    
    
    public void insertchambre (String codeSer, String numCha, String surveillant, String nbLits)
    {
        ResultSet rs = stmt.executeQuery("INSERT INTO chambre VALUES ('codeSer','numCha','surveillant','nbLits')");
    }
    public int modifSurveillant (String numSurv, String )
    {
        "UPDATE chambre SET surveillant = 'numSurv' WHERE (code_service = 'codeSer' && no_chambre = 'numCha')";
    }
}
