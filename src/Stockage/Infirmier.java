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

    /**
     *
     * @return
     */
        public String getservice(){
        return code_service;
    }
    
    /**
     *
     * @return
     */
    public String getrotation(){
        return rotation;
    }
    
    /**
     *
     * @return
     */
    public float getsalaire(){
        return salaire;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getnom(){
        return(inf.getnom());
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getprenom(){
        return(inf.getprenom());
    }
    
    /**
     *
     * @return
     */
    public String getadresse(){
        return(inf.getadresse());
    }
    
    /**
     *
     * @return
     */
    @Override
    public int gettel(){
        return(inf.gettel());
    }
    
    
    //Mutateurs

    /**
     *
     * @param service
     */
        public void setservice(String service){
        code_service = service;
    }
    
    /**
     *
     * @param rot
     */
    public void setrotation(String rot){
        rotation = rot;
    }
    
    /**
     *
     * @param sal
     */
    public void setsal(float sal){
        salaire = sal;
    }
    
}
