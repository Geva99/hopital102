/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stockage;

import miseajour.employe;

/**
 *
 * @author Gunness
 */
public class Docteur extends Employe{
    Docteur doc;
    private String specialite;
    public String getspecialite(){
        return specialite;
    }
    
    @Override
    public String getnom(){
        return(doc.getnom());
    }
    
    @Override
    public String getprenom(){
        return(doc.getprenom());
    }
    
    public String getadresse(){
        return(doc.getadresse());
    }
    
    @Override
    public int gettel(){
        return(doc.gettel());
    }
    
    //Mutateurs
    public void setspecialite(String spe){
        specialite = spe;
    }
        

    /**
     *
     * @param Nom
     * @param Prenom
     */
    public Docteur (String Nom,String Prenom ){}
    
    public Docteur (String Nom) {}
    
    
}



