/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miseajour;

/**
 *
 * @author Twentycent_ONE
 */
public class hospitalisation {
        public void inserthospitalisation (String codeSer, String numCha, String surveillant, String nbLits)
    {
//        Statement stmt = conn.createStatement();
        String cmd = "INSERT INTO hospitalisation VALUES ('codeSer','numCha','surveillant','nbLits')";
        ajouterRequete(cmd);
//        ResultSet rs = stmt.executeQuery("INSERT INTO chambre VALUES ('codeSer','numCha','surveillant','nbLits')");
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
