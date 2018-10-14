/*
 * Vehicle
 * Classe que gera um veículo que sera usado por car, motocycle, truck e bike
 * 
 * @author Gustavo A. Queiroz
 * 
 * @see Veiculo
 */

package projetoobjetos;

import java.util.Random;

public class Vehicle {
    
    
        private int x; /// Coordenada X do veículo
	private int y; /// Coordenada Y do veículo
	private double velocidade; /// Velocidade do veículo
	private boolean fabrica; /// Informa se o veículo está¡ ou não em uma fábrica
	private String cor; ///Cor dos veículo
    
    	Random r = new Random();/// Função random, utilizada para gerar posições aleatórias 
        
        /**
	 * Construtor padrão da classe Vehicle
	 * Incializa as váriaveis de veículo
	 */
    
    public Vehicle() {
        velocidade = 0; 
        fabrica = false;
        x = 0; 
        y = 0;  
        cor = null; 
	}
    
    	/**
	 * Construtor da classe Vehicle(parametrizado)
	 * Cria veículos com variáveis que são recebidas na chamada das funções de cada veículo específico
	 * 
	 * @param x 
	 * @param y
	 * @param velocidade
	 * @param cor
	 * @param fabrica
	 */
    
    public Vehicle(int x, int y, double velocidade, String cor, boolean fabrica) {
        
        
		this.x = x;
		this.y = y;
		this.velocidade = velocidade;
		this.cor = cor;
		this.fabrica = fabrica;
                
	}
    
    /**
	 * Cria um valor aleatório para o Y do veículo
	 * 
	 * @return O valor gerado para Y
	 */
    
    public int setY() {
        
	y = r.nextInt(58);
        
	return y;
    }
    
    /**
	 * Cria um valor aleatório para o X do veículo
	 * 
	 * @return O valor gerado para X
	 */
    public int setX() {
        
        x =  r.nextInt(28);
        
        return x;
    }
   

    /**
	 * @return O valor de Y do veículo
	 */

    public int getY() {
        return y;
    }
    
     /**
	 * @return O valor de X do veículo
	 */
    public int getX() {
        return x;
    }
    
    /**
	 * Altera o valor de X de um veículo com base no que será passado dentro de cada veículo
	 * 
	 * @param x
	 */

    public void MoveX(int x) {
        this.x = x;
    }
    /**
	 * Altera o valor de Y de um veículo com base no que será passado dentro de cada veículo 
	 * 
	 * @param y
	 */
    
    public void MoveY(int y) {
        
	this.y = y;
        
    }
    

    /**
	 * @return Se um veículo passou ou não em uma fabrica
	 */

    public boolean isFabrica() {
        return fabrica;
    }
    /**
	 * Define se um veiculo passou ou não em uma fabrica */
	

    public void setFabrica(boolean fabrica) {
        this.fabrica = fabrica;
    }

    
    

    
    /**
	 * @return A velocidade do veículo
	 */

    public double getVelocidade() {
        return velocidade;
    }
    /**
	 * @return A cor do veículo
	 */

    public String getCor() {
        return cor;
    }
        /**
	 * Random utilizado para gerar movimentos aleatórios
	 */
    Random car = new Random();
    
        /**
	 * Função que movimenta o carro, recebendo um objeto da classe Car como parâmetro
	 * @param ca
	 */
    
    public void moveCarro(Car ca){
        int mov;///"mov" recebe o número aleatório
        
        	mov = car.nextInt(4); ///< gera posições aleatorias, abrindo de 0 a 4 jeitos de se movimentar(cima,baixo,esquerda,direta)
		
		/**
		 * Ifs para verificar o resultado obtido no random e 
                 * poder decidir em qual direção o carro irá se movimentar
		 */
                
		if(mov == 0) {
			int x1 = ca.getX(); // Obtendo o valor atual de X
			x1 = x1 + 2;
			ca.MoveX(verificaX(x1));// Chamando a função moveX da classe Veículo para realizar a movimentação 
		}	
                /**
		 * O if a cima se repete no restante da função, só muda a direção 
		 */
		
		if(mov == 1) {
			int x2 = ca.getX();
			x2 = x2 - 2;
			ca.MoveX(verificaX(x2));
		}
		
		if(mov == 2) {
			int y1 = ca.getY();
			y1 = y1 + 2;
			ca.MoveY(verificaY(y1));
		}
		
		if(mov == 3) {
			int y2 = ca.getY();
			y2 = y2 - 2;
			ca.MoveY(verificaY(y2));
		}          
             
               
    }
    
        /**
	 * Random utilizado para gerar movimentos aleatórios
	 */
    Random truck = new Random();
    
    /**
	 * Método que movimenta o caminhão, recebendo um objeto da classe caminhão como parâmetro
	 * @param tru
	 */
    
     public void moveTruck(Truck tru){
         
        int mov;///"mov" recebe o número aleatório
        
        	mov = truck.nextInt(4);//gera posições aleatorias, abrindo de 0 a 4 jeitos de se movimentar(cima,baixo,esquerda,direta) 
		
                /**  Ifs para verificar o resultado obtido no random*/
		 
                 
		
		if(mov == 0) {
			int x1 = tru.getX(); //* Obtendo o valor atual de X*/
			x1 = x1 + 1;/** Somando 1 (velocidade do caminhão) no valor atual de X */
			tru.MoveX(verificaX(x1)); /** Chamando a função moveX da classe Veículo para realizar a movimentação */
		}		
		
               
                
		if(mov == 1) {
			int x2 = tru.getX();
			x2 = x2 - 1;
			tru.MoveX(verificaX(x2));
		}
		
		if(mov == 2) {
			int y1 = tru.getY();
			y1 = y1 + 1;
			tru.MoveY(verificaY(y1));
		}
		
		if(mov == 3) {
			int y2 = tru.getY();
			y2 = y2 - 1;
			tru.MoveY(verificaY(y2));
		}        
        
    }
        /** Random para gerar movimentos aleatoriamente */
	 
     Random motocy = new Random();
     
     /**
	 * Método que movimenta a moto, recebendo um objeto da classe Motocycle como parâmetro
	 * @param m
	 */
     
      public void moveMoto(Motocycle m){
          
          int mov;/**"mov" recebe o número aleatório*/
        
        	mov = motocy.nextInt(4);// Recebendo um numero aletório para movimentar o veiculo em 4 direções(cima,baixo,esquerda,direta) 
		
		
		if(mov == 0) {
			int x1 = m.getX(); ///Obtendo o valor atual de X
			x1 = x1 + 3; /// Somando 3 (velocidade da moto) no valor atual de X
			m.MoveX(verificaX(x1)); ///< Chamando a função moveX da classe Veículo para realizar a movimentação
		}
                
                /**
		 * O if a cima se repete no restante da função, só muda a direção 
		 */
		
		if(mov == 1) {
			int x2 = m.getX();
			x2 = x2 - 3;
			m.MoveX(verificaX(x2));
		}
		
		if(mov == 2) {
			int y1 = m.getY();
			y1 = y1 + 3;
			m.MoveY(verificaY(y1));
		}
		
		if(mov == 3) {
			int y2 = m.getY();
			y2 = y2 - 3;
			m.MoveY(verificaY(y2));
		}        
        
        
    }
      
      Random bmx = new Random();
     
     /**
	 * Método que movimenta a Bike, recebendo um objeto da classe Bike como parâmetro
	 * @param b
	 */
      public void moveBike(Bike b){
          
          int mov;
        
        	mov = bmx.nextInt(4);/** Recebendo um numero aletório para movimentar o veiculo em 4 direções(cima,baixo,esquerda,direta) */
		
		
		if(mov == 0) {
			int x1 = b.getX(); // Obtendo o valor atual de X
                        
			x1 = x1 + (1/2); // Somando 1 (velocidade da moto) no valor atual de X
                        
			b.MoveX(verificaX(x1)); //Chamando a função moveX da classe Veículo para realizar a movimentação
                        
		}
                
               
		
		if(mov == 1) {
			int x2 = b.getX();
                        
			x2 = x2 - 1;
                        
			b.MoveX(verificaX(x2));
		}
		
		if(mov == 2) {
			int y1 = b.getY();
                        
			y1 = y1 + (1/2);
                        
			b.MoveY(verificaY(y1));
		}
		
		if(mov == 3) {
			int y2 = b.getY();
                        
			y2 = y2 - 1;
                        
			b.MoveY(verificaY(y2));
                        
		}        
        
        
    }
      /**
	 /** Função que verifica se o veículo chegou ao limite do mapa em X e reseta a coordenada*/
	 /** @param x*/
	 /** @return*/
	 
      public int verificaX(int x) {
		if (x >= 29) {
                    
			x = 1;
                        
		}
		if(x <= 0) {
                    
			x = 28;
                        
		}
                
		return x;
	}
      
      /**
	 /** Função que verifica se o veículo chegou ao limite do mapa em Y e reseta a coordenada*/
	 /** @param Y*/
	 /** @return*/
	
	
	public int verificaY(int y) {
		if (y >= 59) {
                    
			y = 1;
                        
		}
		if(y <= 0) {
                    
			y = 58;
                        
		}
                
		return y;
	}  
    
    
    
    
    
        
    
}
