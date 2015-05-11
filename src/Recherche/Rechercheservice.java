/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche;

import Connexion.Connexion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Twentycent_ONE
 */
public class Rechercheservice extends Recherche_info{
    
    public ArrayList rechChambreParService (int numChambre, String service, Connexion coco) throws SQLException
    {
        //Donne pour chaque service, son nom, son bâtiment, ainsi que les prénom, nom et spécialité de son directeur
    String req = "SELECT DISTINCT (service.nom), service.batiment, employe.prenom, employe.nom, specialite FROM `docteur`, `service`, `employe` WHERE (directeur = docteur.numero AND docteur.numero =employe.numero)";
    ArrayList liste = remplirChampsRequete(req, coco);
    return liste;
    }
    
}
