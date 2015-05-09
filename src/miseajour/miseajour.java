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
    protected void ajouterRequeteMaj(String requete) throws SQLException {
        Statement stmt;
        stmt=Connexion.conn.createStatement();
        requetes.add(requete);
        ResultSet rset;
        ResultSetMetaData rsetMeta;
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery(requete);

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();
    }
   
    
//    protected void ajouterRequeteMaj(String requete) {
//        requetesMaj.add(requete);
//    }


    
    
    /**
     * Méthode qui retourne l'ArrayList des champs de la table en parametre
     *
     * @param table
     * @return 
     * @throws java.sql.SQLException 
     */
    public ArrayList remplirChampsTable(String table) throws SQLException {
        // récupération de l'ordre de la requete
        Statement stmt;
        stmt=Connexion.conn.createStatement();
        ResultSet rset;
        ResultSetMetaData rsetMeta;
        rset = stmt.executeQuery("select * from " + table);//ici stmt est l'ordre qui va executer la requete: on prend "attribut" de "table"

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();

        // calcul du nombre de colonnes du resultat
        int nbColonne = rsetMeta.getColumnCount();

        // creation d'une ArrayList de String
        ArrayList<String> liste;
        liste = new ArrayList<String>();

        // Ajouter tous les champs du resultat dans l'ArrayList
        for (int i = 0; i < nbColonne; i++) {
            liste.add(rsetMeta.getColumnLabel(i + 1));
        }

        // Retourner l'ArrayList
        return liste;
    }

    
    /**
     * Methode qui retourne l'ArrayList des champs de la requete en parametre
     * @param requete
     * @return 
     * @throws java.sql.SQLException
     */
    public ArrayList remplirChampsRequete(String requete) throws SQLException {
          Statement stmt;
        stmt=Connexion.conn.createStatement();
        ResultSet rset;
        ResultSetMetaData rsetMeta;
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery(requete);

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();

        // calcul du nombre de colonnes du resultat
        int nbColonne = rsetMeta.getColumnCount();

        // creation d'une ArrayList de String
        ArrayList<String> liste;
        liste = new ArrayList<String>();

        // tant qu'il reste une ligne 
        while (rset.next()) {
            String champs;
            champs = rset.getString(1); // ajouter premier champ

            // Concatener les champs de la ligne separes par ,
            for (int i = 1; i < nbColonne; i++) {
                champs = champs + "," + rset.getString(i+1);
            }

            // ajouter un "\n" à la ligne des champs
            champs = champs + "\n";

            // ajouter les champs de la ligne dans l'ArrayList
            liste.add(champs);
        }

        // Retourner l'ArrayList
        return liste;
    }
    
    
    
        public void executeUpdate(String requeteMaj) throws SQLException {
        Statement stmt;
        stmt=Connexion.conn.createStatement();
        ResultSet rset;
        ResultSetMetaData rsetMeta;
        stmt.executeUpdate(requeteMaj);
    }

    
}
