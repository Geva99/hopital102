/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;
import java.sql.SQLException;
import java.util.ArrayList;
import Stockage.Docteur;
import java.sql.ResultSet;
import java.sql.Statement;
import Connexion.Connexion;
import java.sql.ResultSetMetaData;


/**
 *
 * @author Gunness
 */
public class Reportingspecialite {
    
    public int specialite() throws SQLException{
    Statement stmt;
    stmt= Connexion.conn.createStatement();
    String myQuery = ("SELECT specialite, COUNT(*) FROM docteur, GROUP BY specialite ");
    ResultSet rs1 = stmt.executeQuery (myQuery);
    stmt.commit();
    
    
//        ResultSet rset;
//        ResultSetMetaData rsetMeta;
//        stmt.executeUpdate(requeteMaj);
    }
}
