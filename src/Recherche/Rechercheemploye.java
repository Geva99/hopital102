/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche;

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
    
    public ArrayList<Docteur> rechDocteurNom ()
    {
        String 
        Rechemp.ajouterRequeteMaj ();

    }
    
}
