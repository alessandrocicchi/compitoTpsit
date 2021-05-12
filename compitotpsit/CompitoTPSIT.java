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
public class CompitoTPSIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numClienti = 3;
        
        Bancone b = new Bancone(numClienti);
        
        Cuoco c = new Cuoco(b, numClienti);
        
        Dipendente d1 = new Dipendente(b);
        
        Dipendente d2 = new Dipendente(b);
        
        Dipendente d3 = new Dipendente(b);
        
        System.out.println("Inizio pausa pranzo, la mensa è aperta");
            
            c.start();
            
            d1.start();
            
            d2.start();
            
            d3.start();
            
        
        System.out.println("Fine pausa pranzo, la mensa è chiusa");
        
    }
    
}
