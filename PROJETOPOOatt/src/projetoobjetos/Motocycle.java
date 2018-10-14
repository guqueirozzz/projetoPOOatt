/**
 * Motocycle
 * Classe que gera um veículo do tipo Motocycle
 * 
 * @author Gustavo A. Queiroz
 * @see Veiculo
 */
package projetoobjetos;


public class Motocycle extends Vehicle {
    
    Vehicle v = new Vehicle();
    /**
	 * Construtor da classe Motocycle, que usa um super para chamar o construtor da classe Veículo
	 * 
	 * @see Vehicle
	 * @param x
	 * @param y
         * @param fabrica
         * @param cor
	 * @param velocidade
	
	 */
    
    public Motocycle (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
    
}
