/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miseajour;

import Connexion.Connexion;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Twentycent_ONE
 */
public abstract class miseajour {
 
      /**
     * ArrayList public pour les requêtes de sélection
     */
    public ArrayList<String> requetes = new ArrayList<String>();
    /**
     * ArrayList public pour les requêtes de MAJ
     */
    public ArrayList<String> requetesMaj = new ArrayList<String>(); // liste des requêtes de MAJ
   
    
    /**
     * Méthode privée qui ajoute la requete de selection en parametre dans son ArrayList
     * @param requete
     * @throws java.sql.SQLException
     */
    public void executeUpdate(String requeteMaj) throws SQLException {
        Statement stmt;
        stmt=Connexion.conn.createStatement();
        ResultSet rset;
        ResultSetMetaData rsetMeta;
        stmt.executeUpdate(requeteMaj);
    }

    
}
