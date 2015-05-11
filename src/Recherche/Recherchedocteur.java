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
        // On recherche les attributs des docteurs dont on donne le nom
        String req ="SELECT specialite, employe.nom, employe.prenom, employe.adresse, employe.tel FROM docteur, employe WHERE (employe.nom == '%"+nomDocteur+"%' AND docteur.numero==employe.numero)";
        ArrayList liste = Rechdoc.ajouterRequeteMulti (req, coco);
        return liste;
    }
    
    public ArrayList rechDocteur (String nomDocteur, String prenomDocteur, Connexion coco) throws SQLException
    {
        //On recherche un docteur particulier
        String req = "SELECT * FROM employe WHERE (employe.nom == '"+nomDocteur+" AND employe.prenom == '"+prenomDocteur+"')"; 
        ArrayList liste = Rechdoc.remplirChampsRequete(req, coco);
        return liste;
    }
}
