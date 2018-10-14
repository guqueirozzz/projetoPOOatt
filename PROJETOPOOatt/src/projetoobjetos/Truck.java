/**
 * Truck
 * 
 * Classe que gera um veículo do tipo Truck
 * 
 * @author Gustavo A. Queiroz
 * 
 * @see Veiculo
 */
package projetoobjetos;


public class Truck extends Vehicle {
    
    Vehicle v = new Vehicle();
    /**
	 * Construtor da classe Truck, que usa um super para chamar o construtor da classe Veículo
	 * 
	 * @see Vehicle
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
    
    public Truck (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
    
}
