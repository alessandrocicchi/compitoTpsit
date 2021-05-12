/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitotpsit;

/**
 *
 * @author informatica
 */
public class Cuoco extends Thread{ //produttore
    
    int numClienti;
    boolean pronto = false; //serve per sapere quando è pronto il piatto
    Bancone b ;
    
    
    public Cuoco(Bancone ban, int numClienti){
        
        this.b = ban;
        this.numClienti = numClienti; 
    }
    
    public void run(){
        
        
        try{
            
            sleep((long)Math.random()* 300); //preparazione del piatto
            
            pronto = true;
            b.deposita(pronto);
            
        } catch (InterruptedException e){
            
        }
        
        
    }
    
}
