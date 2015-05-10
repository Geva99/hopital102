/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;
import Connexion.Connexion;
import java.sql.SQLException;
import java.util.ArrayList;
import Stockage.Docteur;
/**
 *
 * @author Gunness
 */
public class Reportingspecialite {
    
    Statement stmt1 = conn.createStatement();
    String myQuery = ("SELECT specialite, COUNT(*) FROM docteur, GROUP BY specialite ");
    ResultSet rs1 = stmt1.executeQuery (myQuery);
    stmt1. commit();
    
    
}
