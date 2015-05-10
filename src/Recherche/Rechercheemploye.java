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
public class Rechercheemploye extends Recherche_info {
    
    
    Rechercheemploye Rechemp = new Rechercheemploye();

    /**
     *
     */
    public ArrayList<Docteur> tableauDocteur = new ArrayList<Docteur>();
    
    public ArrayList<Docteur> rechEmployeParNom (String nomEmploye, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE employe.nom == '"+nomEmploye+"";
        ArrayList liste = Rechemp.ajouterRequeteMulti (req, coco);
        return (liste);
    }
    
    public Docteur rechEmploye (String employe, String nomDocteur, String prenomDocteur, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE (employe.nom == '"+nomDocteur+"&&employe.prenom == '"+prenomDocteur+"')"; 
//        Rechercheemploye doc = Rechemp.ajouterRequeteMaj(req);
//        RechObjetParNomPrenom (employe, nomDocteur, prenomDocteur, coco );
        
    }
    
    
    
    
}