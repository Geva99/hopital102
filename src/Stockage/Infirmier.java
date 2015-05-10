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
public class Infirmier extends Employe{
    private String code_service;
    private String rotation; /* ex : Jour ou nuit*/
    private float salaire;
    Infirmier inf;
    
    
    //Accesseurs:
    public String getservice(){
        return code_service;
    }
    
    public String getrotation(){
        return rotation;
    }
    
    public float getsalaire(){
        return salaire;
    }
    
    @Override
    public String getnom(){
        return(inf.getnom());
    }
    
    @Override
    public String getprenom(){
        return(inf.getprenom());
    }
    
    public String getadresse(){
        return(inf.getadresse());
    }
    
    @Override
    public int gettel(){
        return(inf.gettel());
    }
    
    
    //Mutateurs
    public void setservice(String service){
        code_service = service;
    }
    
    public void setrotation(String rot){
        rotation = rot;
    }
    
    public void setsal(float sal){
        salaire = sal;
    }
    
}
