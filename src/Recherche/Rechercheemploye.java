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
        
        // Recherche des employés contenant les lettres
    public ArrayList<Employe> rechEmployeParNom (String nomEmploye, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE employe.nom == '%"+nomEmploye+"%";
        ArrayList liste = Rechemp.ajouterRequeteMulti (req, coco);
        return (liste);
    }
    
    public ArrayList rechEmploye (String nomEmp, String prenomEmp, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE (employe.nom == '%"+nomEmp+"%&&employe.prenom == '%"+prenomEmp+"%')"; 
        ArrayList liste = Rechemp.remplirChampsRequete (req, coco);
        return(liste);
    }
    
    
    public ArrayList rechEmployeParNum (String numEmp, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE employe.numero = '"+numEmp+"'";
        ArrayList liste = Rechemp.remplirChampsRequete (req, coco);
        return(liste);
    }    
    
    
}