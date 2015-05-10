/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recherche;

import java.sql.SQLException;
import java.util.ArrayList;
import Connexion.Connexion;
import java.sql.Statement;
/**
 *
 * @author Twentycent_ONE
 */
public class Recherchemalade extends Recherche_info{
//    public boolean rechercher_malade_mutuelle() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
//    {
//        //R1. Prénom et nom des malades affiliés à la mutuelle « MAAF ».
//        boolean recherche=false;
//        String requete = null;
//        ArrayList<String> resultat; 
//       
//        Connexion conn = DatabaseConnector.getInstance().getConnection();
//
//        if(conn!=null)
//        {
//
//            requete = "Select numero,prenom,nom from malade where mutuelle = 'MAAF'";
//           
//            System.out.println("recherche en cours...");
//            Statement stmt;
//            stmt=Connexion.conn.createStatement();
//
//            resultat = DatabaseConnector.getInstance().executerRequete(requete);
//            System.out.println("Le résultat est : ");
//            for (int i=0;i<resultat.size();i++)
//            {
//                System.out.print(resultat.get(i));
//            }
//
//            recherche=true;
//        }
//        return recherche;
//        
//    }
}
