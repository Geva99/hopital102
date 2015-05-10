/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche;

import Connexion.Connexion;
import java.sql.SQLException;
import java.util.ArrayList;
import Stockage.Employe;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Map.Entry;

/**
 *
 * @author Twentycent_ONE
 */
public class Rechercheemploye extends Recherche_info {
    
    
    Rechercheemploye Rechemp = new Rechercheemploye();

    /**
     *
     */
    public ArrayList<Employe> tableauEmploye = new ArrayList<Employe>();
    
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
            liste.add(rsetMeta.getColumnLabel(0));
       }
        num.add
        String[] num;
        num = (String[])rsetMeta.getColumnLabel(0).getValue();
        setnum(num);
        // Retourner l'ArrayList
        return liste;
    }
    public ArrayList<Employe> rechEmployeParNom (String nomEmploye, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE employe.nom == '"+nomEmploye+"";
        ArrayList liste = Rechemp.ajouterRequeteMulti (req, coco);
        return (liste);
    }
    
    public Employe rechEmploye (String employe, String nomEmp, String prenomEmp, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE (employe.nom == '"+nomEmp+"&&employe.prenom == '"+prenomEmp+"')"; 
        ArrayList liste = Rechemp.ajouterRequeteMulti (req, coco);
    
//        Rechercheemploye doc = Rechemp.ajouterRequeteMaj(req);
//        RechObjetParNomPrenom (employe nomDocteur, prenomDocteur, coco );
        
    }
    
    
    
    
}