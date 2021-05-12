/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitotpsit;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 *
 * @author informatica
 */
public class Bancone {
    
    private Semaphore semVuoto = new Semaphore(0);
    private Semaphore semPieno = new Semaphore(1);
    int numClienti;
    int num = 1;
    
    
    public Bancone(int numClienti){
       
       this.numClienti = numClienti; 
    }
    
    public void deposita( boolean piattoPronto){
    
        while(piattoPronto){
            
            try {

               semVuoto.acquire();
                    
               System.out.println("Il piatto n." + num + "è stato servito");
            

               sleep((long)Math.random()*100);   //tempo di attesa del prelievo del piatto
               
               System.out.println("Il piatto n." + num + "è stato ritirato");

               num++;
               
               semPieno.release();

           } catch (InterruptedException e){

           }
           
        }
        
         
    }
    
    public void prelieva(){
        
           
            try {
                semPieno.acquire();
                                   
                numClienti--;
                //num++;
                
                semVuoto.release();
            } catch(InterruptedException e){
                
            }    
        
    }
    
    
    
}
