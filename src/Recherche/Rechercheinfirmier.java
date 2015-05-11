/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche;

import Connexion.Connexion;
import Stockage.Docteur;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Twentycent_ONE
 */
public class Rechercheinfirmier extends Rechercheemploye{
    
        Rechercheinfirmier Rechinf = new Rechercheinfirmier();

    public ArrayList<Docteur> rechInfirmierParNom (String nomDocteur, Connexion coco) throws SQLException
    {
        String req1 = "SELECT * FROM employe WHERE employe.nom= '"+nomDocteur+"";
        ArrayList liste1 = Rechinf.ajouterRequeteMulti (req1, coco);
        
//        liste1.addAll(liste2);
        return (liste1);
    }
        
    public ArrayList rechInfirmierParNum (String nomDocteur, String prenomDocteur, Connexion coco) throws SQLException{
        String req = "SELECT * FROM infirmier WHERE employe.numero = infirmier.numero" ;
        ArrayList liste = Rechinf.ajouterRequeteMulti (req, coco);
        return liste;
    }
    public ArrayList rechInfirmierNuit (String nomDocteur, String prenomDocteur, Connexion coco) throws SQLException{
        String req = "SELECT employe.nom, employe.prenom FROM `infirmier`, `employe` WHERE (employe.numero = infirmier.numero AND rotation LIKE 'NUIT')";
        ArrayList liste = Rechinf.ajouterRequeteMulti (req, coco);
        return liste;
    }
    
    public ArrayList rechInfirmierJour (String nomDocteur, String prenomDocteur, Connexion coco) throws SQLException{
        String req = "SELECT employe.nom, employe.prenom FROM `infirmier`, `employe` WHERE (employe.numero = infirmier.numero AND rotation LIKE 'JOUR')";
        ArrayList liste = Rechinf.ajouterRequeteMulti (req, coco);
        return liste;
    }
}
