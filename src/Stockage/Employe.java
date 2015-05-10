/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stockage;

/**
 *
 * @author Gunness
 */
public abstract class Employe extends Personne {
    int numero;
    String nom;
    String prenom;
    String adresse;
    int tel;
    
    public int getnumero(){
    return numero;
    }
    
    public String getnom(){
    return nom;
    }
    
    public String getprenom(){
    return prenom;
    }
    
    public String getsadresse(){
    return adresse;
    }
    
    public int gettel(){
    return tel;
    }
    
    public void setnum(int num){
        numero = num;
    }
    
    public void setnom(String name){
        nom = name;
    }
    
    public void setprenom(String pre){
        prenom = pre;
    }
    
    public void setadresse(String adr){
        adresse = adr;
    }
    
    public void settel(int telephone){
        tel = telephone;
    }
    
}
