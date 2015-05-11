/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;

import Connexion.Connexion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Twentycent_ONE
 */
public class Reportingmoysalaireinfirmier extends Reporting_info{
        public ArrayList rechAvgSalInfParServ (Connexion coco) throws SQLException{
        String req = "SELECT code_service, avg(salaire) FROM infirmier GROUP BY code_service";
        ArrayList liste = remplirChampsRequete(req, coco);
        return liste;
    }
}
