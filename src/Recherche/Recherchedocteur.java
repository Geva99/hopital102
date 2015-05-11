/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche;



import Connexion.Connexion;
import java.sql.SQLException;
import java.util.ArrayList;
import Stockage.Docteur;
/**
 *
 * @author Twentycent_ONE
 */
public class Recherchedocteur extends Rechercheemploye{
    
    Recherchedocteur Rechdoc = new Recherchedocteur();
    
    public ArrayList<Docteur> rechDocteurParNom (String nomDocteur, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE employe.nom == '"+nomDocteur+"";
        ArrayList liste = Rechdoc.ajouterRequeteMulti (req, coco);
        return liste;
    }
    
    public ArrayList rechDocteur (String nomDocteur, String prenomDocteur, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE (employe.nom == '"+nomDocteur+"&&employe.prenom == '"+prenomDocteur+"')"; 
        ArrayList liste = remplirChampsRequete(req, coco);
        return liste;
//        ArrayList liste = Rechdoc.ajouterRequeteMulti (req, coco);
    }
}
