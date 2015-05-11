/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche;

import Connexion.Connexion;
import Stockage.Chambre;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Twentycent_ONE
 */
public class Recherchechambre extends Recherche_info{
    
    Recherchechambre Rechcha = new Recherchechambre();
    
    /**
     *
     * @param numChambre
     * @param coco
     * @return
     * @throws SQLException
     */
    public ArrayList<Chambre> rechChambreParNum (int numChambre, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE chambre.numero == '"+numChambre+"";
        ArrayList liste = Rechcha.ajouterRequeteMulti (req, coco);
        return liste;
    }
    
    public ArrayList rechChambreParService (int numChambre, String service, Connexion coco) throws SQLException
    {
        String req = "SELECT * FROM employe WHERE (chambre.no_chambre == '"+numChambre+"&&chambre.code_service == '"+service+"')"; 
        ArrayList liste = remplirChampsRequete(req, coco);
        return liste;
//        ArrayList liste = Rechdoc.ajouterRequeteMulti (req, coco);
    }
    
}
