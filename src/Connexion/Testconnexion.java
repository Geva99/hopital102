/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import Connexion.*;
import java.util.ArrayList;

/**
 *
 * @author Gunness
 */
public class Testconnexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
      System.out.println("Debut test connexion");
     Connexion Connexion1=new Connexion("root","");
     Testconnexion test = new Testconnexion();
      ArrayList<String> testliste;
      test.remplirRequetes();
      testliste=test.remplirChampsRequete("SELECT nom FROM employe WHERE nom=Nadal;",Connexion1);
         System.out.println(testliste);
    }
    
    
    
    public ArrayList<String> requetes = new ArrayList<String>();
    /**
     * ArrayList public pour les requêtes de MAJ
     */
    public ArrayList<String> requetesMaj = new ArrayList<String>(); // liste des requêtes de MAJ
    /**
     * Méthode privée qui ajoute la requete de selection en parametre dans son ArrayList
     */
    private void ajouterRequete(String requete) throws SQLException {

        requetes.add(requete);
    }

    /**
     * Méthode privée qui initialise la liste des requetes de selection
     */
    private void remplirRequetes() throws SQLException {
        
        /* Exemple du TP3 : */
       /* ajouterRequete("SELECT ename, sal FROM Emp ORDER BY sal;");
        ajouterRequete("SELECT Dept.*, Emp.*, Mission.* FROM Dept, Emp, Mission WHERE Dept.deptno=Emp.deptno AND Emp.empno=Mission.empno;");
        ajouterRequete("SELECT AVG (Emp.sal) FROM Emp, Mission WHERE Emp.empno = Mission.empno;");
        ajouterRequete("SELECT Dept.*, Emp.* FROM Dept, Emp WHERE Dept.deptno=Emp.deptno AND comm>0;");
        ajouterRequete("SELECT hiredate, empno, ename FROM Emp WHERE (((hiredate)>='1981-05-01' And (hiredate)<'1981-05-31'))ORDER BY hiredate;");
        ajouterRequete("SELECT ename, job FROM Emp ORDER BY job;");
        ajouterRequete("SELECT DISTINCT dname, job FROM Dept, Emp WHERE Dept.deptno=Emp.deptno AND job='Clerk';");
        */
        
        ajouterRequete("SELECT nom FROM employe WHERE nom='Nadal'';");

    }

    /**
     * Méthode privée qui ajoute la requete de MAJ en parametre dans son ArrayList
     */
    private void ajouterRequeteMaj(String requete) {
        requetesMaj.add(requete);
    }

    /**
     * Méthode privée qui initialise la liste des requetes de MAJ
     */
    private void remplirRequetesMaj() {
       
        // Exemple du TP3 :
        // Requêtes d'insertion
        ajouterRequeteMaj("INSERT INTO Dept (deptno,dname,loc) VALUES (50,'ECE','Paris');");

        // Requêtes de modification
        ajouterRequeteMaj("UPDATE Dept SET loc='Eiffel' WHERE loc='Paris';");

        // Requêtes de suppression
        ajouterRequeteMaj("DELETE FROM Dept WHERE loc='Eiffel';");
        
    }

    /**
     * Méthode qui retourne l'ArrayList des champs de la table en parametre
     *
     * @param table
     * @return 
     * @throws java.sql.SQLException 
     */
    public ArrayList remplirChampsTable(String table) throws SQLException {
        // récupération de l'ordre de la requete
        Statement stmt;
        stmt=Connexion.conn.createStatement();
        ResultSet rset;
        ResultSetMetaData rsetMeta;
        rset = stmt.executeQuery("select * from " + table);//ici stmt est l'ordre qui va executer la requete: on prend "attribut" de "table"

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();

        // calcul du nombre de colonnes du resultat
        int nbColonne = rsetMeta.getColumnCount();

        // creation d'une ArrayList de String
        ArrayList<String> liste;
        liste = new ArrayList<String>();

        // Ajouter tous les champs du resultat dans l'ArrayList
        for (int i = 0; i < nbColonne; i++) {
            liste.add(rsetMeta.getColumnLabel(i + 1));
        }

        // Retourner l'ArrayList
        return liste;
    }

    /**
     * Methode qui retourne l'ArrayList des champs de la requete en parametre
     */
    public ArrayList remplirChampsRequete(String requete, Connexion coco) throws SQLException {
          Statement stmt;
        stmt=Connexion.conn.createStatement();
        ResultSet rset;
        ResultSetMetaData rsetMeta;
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery(requete);

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();

        // calcul du nombre de colonnes du resultat
        int nbColonne = rsetMeta.getColumnCount();

        // creation d'une ArrayList de String
        ArrayList<String> liste;
        liste = new ArrayList<String>();

        // tant qu'il reste une ligne 
        while (rset.next()) {
            String champs;
            champs = rset.getString(1); // ajouter premier champ

            // Concatener les champs de la ligne separes par ,
            for (int i = 1; i < nbColonne; i++) {
                champs = champs + "," + rset.getString(i+1);
            }

            // ajouter un "\n" à la ligne des champs
            champs = champs + "\n";

            // ajouter les champs de la ligne dans l'ArrayList
            liste.add(champs);
        }

        // Retourner l'ArrayList
        return liste;
    }

    /**
     * Méthode qui execute une requete de MAJ en parametre
     */
    public void executeUpdate(String requeteMaj) throws SQLException {
        Statement stmt;
        stmt=Connexion.conn.createStatement();
        ResultSet rset;
        ResultSetMetaData rsetMeta;
        stmt.executeUpdate(requeteMaj);
    }
    
}
