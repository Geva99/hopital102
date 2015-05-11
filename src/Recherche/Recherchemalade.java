/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche;

import java.sql.SQLException;
import java.util.ArrayList;
import Connexion.Connexion;
import Stockage.Malade;
import java.sql.Statement;
/**
 *
 * @author Twentycent_ONE
 */
public class Recherchemalade extends Recherche_info{
    
    Recherchemalade rechMal = new Recherchemalade ();
    
public ArrayList<Malade> rechMaladeParNom (String nomMalade, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM malade WHERE malade.nom == '"+nomMalade+"";
        ArrayList liste = rechMal.ajouterRequeteMulti (req, coco);
        return liste;
    }
    
    public ArrayList rechMalade (String nomDocteur, String prenomDocteur, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM malade WHERE (malade.nom == '"+nomDocteur+"AND malade.prenom == '"+prenomDocteur+"')"; 
        ArrayList liste = rechMal.remplirChampsRequete(req, coco);
        return liste;
//        ArrayList liste = Rechdoc.ajouterRequeteMulti (req, coco);
    }
}
