/**
 * Bike
 * Classe que gera um veículo do tipo Bike
 * 
 * @author Gustavo A. Queiroz
 * 
 * @see Veiculo
 */

package projetoobjetos;


public class Bike extends Vehicle {
    
    Vehicle bike = new Vehicle();
    
    /**
	 * Construtor da classe Bike, que usa um super para chamar o construtor da classe Veículo
	 * 
	 * @see Vehicle
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
    public Bike (int x, int y, double velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
    }
    
    
    
    
}
