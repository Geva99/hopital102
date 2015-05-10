/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;
import Connexion.Connexion;
import static Connexion.Connexion.conn;
import java.sql.SQLException;
import java.util.ArrayList;
import Stockage.Docteur;
import java.sql.ResultSet;
import java.sql.Statement;
import Connexion.Connexion;
/**
 *
 * @author Gunness
 */
public class Reportingspecialite {
    Statement stmt;
    stmt= Connexion.conn.createStatement();
    String myQuery = ("SELECT specialite, COUNT(*) FROM docteur, GROUP BY specialite ");
    ResultSet rs1 = stmt.executeQuery (myQuery);
    stmt. commit();
    
    
}
