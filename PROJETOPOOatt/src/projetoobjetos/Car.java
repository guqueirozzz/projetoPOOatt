/**
 * Car
 * Classe que gera um veículo do tipo Carro
 * 
 * @author Gustavo A. Queiroz
 * @see Veiculo
 */

package projetoobjetos;

public class Car extends Vehicle {
    
    Vehicle v = new Vehicle();
    /**
	 * Construtor da classe Carro, que usa um super para chamar o construtor da classe Veículo
	 * 
	 * @see Vehicle
	 * @param x
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
    
    public Car (int x, int y, int velocidade, String cor, boolean fabrica) {
		super(x, y, velocidade, cor, fabrica);
	}
    
}
