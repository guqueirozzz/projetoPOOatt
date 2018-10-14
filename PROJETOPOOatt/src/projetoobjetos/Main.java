/**
 * @author Gustavo A. Queiroz RA: 22216039-2
 */

package projetoobjetos;


public abstract class Main {

    
    public static void main(String[] args) throws InterruptedException{
      
        	World w = new World();
		
		w.geraVeiculos(); 
		w.desenhaMundo(); 
		
		int i = 0;
		
		while (i == 0) {
			w.atualizaMundo(); 
			Thread.sleep(300);  
		}
        
    }
    
}
