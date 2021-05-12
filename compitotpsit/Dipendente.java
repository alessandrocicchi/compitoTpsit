/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitotpsit;

import static java.lang.Thread.sleep;

/**
 *
 * @author informatica
 */
public class Dipendente extends Thread{
    
    private static int numConsumo = 0; 
    private Bancone b ;
    
    public Dipendente(Bancone ban){
        
        b = ban;
    }
    
    
    public void run(){
        
        try{
            
            b.prelieva();
            
            sleep((long) Math.random()*30000); //tempo per mangiare il piatto
            
            numConsumo++;
            
        } catch(InterruptedException e){
            
        }
        
        System.out.println("consumo: " + numConsumo);
        
        
        
    }

}
