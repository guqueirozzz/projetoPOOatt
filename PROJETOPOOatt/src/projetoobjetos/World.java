/**
 * World
 * Classe que gera o mundo
 * @author Gustavo A. Queiroz
 * 
 * @see World
 */

package projetoobjetos;

import java.util.ArrayList;

public class World {
    
        /** Instanciando a Classe veículo */
    
    Vehicle v = new Vehicle();
    
        /** Criando o ArrayList de cada veículo */
	 
    
        ArrayList <Car> car = new ArrayList<>();///Carro
        
	ArrayList <Truck> truck = new ArrayList<>();///Caminhão
        
	ArrayList <Motocycle> moto = new ArrayList<>();///Moto
        
        ArrayList <Bike> bike = new ArrayList<>(); // Bicicleta
    
    
    public int mapaInicial[][]={{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            	           {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            	           {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		   {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    
    
        /** Função que gera Veículos */
	 
   public void geraVeiculos() {
		for(int i = 0; i < 10; i++) {
			car.add(new Car((v.setX()+1), (v.setY()+1), 2, "Vermelho", false));
                        
			while (mapaInicial[car.get(i).getX()][car.get(i).getY()] == 2) { 
                            
				car.get(i).setX();
				car.get(i).setY();
			}
                        

			truck.add(new Truck((v.setX()+1), (v.setY()+1), 1, "branco", false));
                        
			while (mapaInicial[truck.get(i).getX()][truck.get(i).getY()] == 2) {
				truck.get(i).setX();
				truck.get(i).setY();
			}
                        

			moto.add(new Motocycle((v.setX()+1), (v.setY()+1), 3, "azul", false));
                        
			while (mapaInicial[moto.get(i).getX()][moto.get(i).getY()] == 2) {
                            
				moto.get(i).setX();
				moto.get(i).setY();
			}
                        
		
                
			bike.add(new Bike((v.setX()+1), (v.setY()+1), 1, "Verde", false));
                        
			while (mapaInicial[bike.get(i).getX()][bike.get(i).getY()] == 2) {
                            
				bike.get(i).setX();
				bike.get(i).setY();
			}
                        
                        }
	}
        /**Função que reinicia o mapa*/
    
    public void zeraMapa() {
        
		for(int i = 0; i<30; i++) {
                    
			for(int j = 0; j < 60; j++) {
                            
				if(mapaInicial[i][j] != 1 && mapaInicial[i][j] != 2) {
                                    
					mapaInicial[i][j] = 0;
				}
			}
		}
                for (int a = 0; a < car.size(); a++) {
			
			int xcar = car.get(a).getX(); 
                        
			int ycar = car.get(a).getY();
			

			for(int i = 0; i<30; i++) {
                            
				for(int j = 0; j < 60; j++) {
                                    
					if(i == xcar && j == ycar) {
                                            
						if(mapaInicial[i][j] == 2) {
                                                    
							mapaInicial[i][j] = 2; 
							
						}
						else {
							mapaInicial[i][j] = 3;
                                                        
						}
					}
				}
			}
		}
                /** Adicionando os veiculos no mapa */
		 
		
		for(int a  = 0; a < truck.size(); a++) {
                   
			int xtruck = truck.get(a).getX();
                        
			int ytruck = truck.get(a).getY();
			
			for(int i = 0; i<30; i++) {
                            
				for(int j = 0; j < 60; j++) {
                                    
					if(i == xtruck && j == ytruck) {
                                            
						if(mapaInicial[i][j] == 2) {
                                                    
							mapaInicial[i][j] = 2;
							
						}
						else {
							mapaInicial[i][j] = 4;
						}
					}
				}
			}
		}
		
		for(int a = 0; a < moto.size(); a ++) {
                    
			int xm = moto.get(a).getX();
                        
			int ym = moto.get(a).getY();
			
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					if(i == xm && j == ym) {
						if(mapaInicial[i][j] == 2) {
                                                    
							mapaInicial[i][j] = 2;
							
						}
						else {
                                                    
							mapaInicial[i][j] = 5;
						}
					}
				}
			}	
		}
                
                for(int a = 0; a < bike.size(); a ++) {
                    
			int xm = bike.get(a).getX();
                        
			int ym = bike.get(a).getY();
			
			for(int i = 0; i<30; i++) {
                            
				for(int j = 0; j < 60; j++) {
                                    
					if(i == xm && j == ym) {
                                            
						if(mapaInicial[i][j] == 2) {
                                                    
							mapaInicial[i][j] = 2;
                                                        
							
						}
						else {
							mapaInicial[i][j] = 6;
                                                        
						}
					}
				}
			}	
		}
                
                
		
	}
    
        /** Metodo que desenha o mundo */
	 
    
    public void desenhaMundo() {
        /** Setando a cor para cada veículo, limite e mapa */
		 
        
                
                String motoAzul = "\u001B[34m";///CÓDIGO REFERENTE A COR AZUL
                String carroVermelho = "\u001B[31m";///CÓDIGO REFERENTE A COR VERMELHA
                String camiBranco = "\u001B[37m";//////CÓDIGO REFERENTE A COR BRANCA
                String bikeVerde = "\u001B[32m"; ///CÓDIGO REFERENTE A COR VERDE 
                String fabrica = "\u001B[35m";///CÓDIGO REFERENTE A COR ROSA
                String limite = "\u001B[36m" ;///CÓDIGO REFERENTE A COR AZUL CLARO 
                String mapa = "\u001B[33m";//////CÓDIGO REFERENTE A COR AMARELA
                
                 /** Contadores para exibição dos veículos no terminal */
		int carros = 0;
		int motos = 0;
		int caminhoes = 0;
                int bikes = 0;
		
			for(int i = 0; i<30; i++) {
				for(int j = 0; j < 60; j++) {
					
                                        /** Desenhando o mundo */
					
					
					if(mapaInicial[i][j] == 1) {
						System.out.print(limite + "█");
					}
					else if(mapaInicial[i][j] == 0) {
						System.out.print(mapa + "█");
					}
					
                                        
					else if(mapaInicial[i][j] == 2) {
						System.out.print(fabrica + "█");
					}
                                        
					else if(mapaInicial[i][j] == 3){
						System.out.print(carroVermelho + "█");
					}
					else if(mapaInicial[i][j] == 4){
						System.out.print(camiBranco + "█");
					}
                                        
					else if(mapaInicial[i][j] == 5){
						System.out.print(motoAzul + "█");
					}
                                        
                                        else if(mapaInicial[i][j] == 6){
						System.out.print(bikeVerde + "█");
					}
					
				}
				
				System.out.println("");
			}	
			
                         /** Colocando a legenda */
			 
			System.out.print(motoAzul + "█");
                        
			System.out.print(" Motocycles  ");
                        
			System.out.print(carroVermelho + "█");
                        
			System.out.print(" Cars   ");
                        
			System.out.print(camiBranco + "█");
                        
			System.out.print(" Trucks   ");
                 
			System.out.print(bikeVerde + "█");
                        
			System.out.println(" Bikes");
			
                        /** Implementação dos contadores dos veículos */
			
			
			for(int a = 0; a < car.size(); a++) {
				carros++;
                                
			}
			for(int a = 0; a < truck.size(); a++) {
				caminhoes++;
                                
			}
			for(int a = 0; a < moto.size(); a++) {
				motos++;
                                
			}
                       
                        
			for(int a = 0; a < bike.size(); a++) {
				bikes++;
			}
			
                System.out.println("Numero de Motos: " + motos);
                    
		System.out.println("Numero de Carros: " + carros);
                
		System.out.println("Numero de Caminhoes: " + caminhoes);
			
                System.out.println("Numero de Bikes: " + bikes);
	}
	
	/** Metodo que atualiza o mundo fazendo os veículos se moverem */
	 
	public void atualizaMundo() {
		for(int i = 0; i < car.size(); i++) {
		car.get(i).moveCarro(car.get(i));
		}
		
		for (int i = 0; i < truck.size(); i ++) {
		truck.get(i).moveTruck(truck.get(i));
		}
		
	for (int i = 0; i < moto.size(); i ++) {
	moto.get(i).moveMoto(moto.get(i));
		}
        for (int i = 0; i < bike.size(); i ++) {
	bike.get(i).moveBike(bike.get(i));
		}
		
		geraVeiculo();
                
		detectaColisao();
                
		zeraMapa();
                
		desenhaMundo();
                
                
                
	}
	/** Metodo que detecta as colisões entre veículos */
	 
	
	public void detectaColisao() {
		
		/// Colisão caminhão com caminhão
		
	for (int i = 0; i < truck.size(); i ++) {
		for (int j = 0; j < truck.size(); j++) {
			if(truck.get(j).getX() == truck.get(i).getX() && truck.get(j).getY() == truck.get(i).getY()) {
				if(i == j) {
						
					}
				else {
						truck.remove(truck.get(i));
					}	
				}
			}
		}
                /// Colisão carro com carro
	for (int i = 0; i < car.size(); i ++) {
		for (int j = 0; j < car.size(); j++) {
			if(car.get(j).getX() == car.get(i).getX() && car.get(j).getY() == car.get(i).getY()) {
					if (i == j) { 
						
					}
					else {
						car.remove(car.get(i));
					}	
				}
			}
		}
                
              
                
		/// Colisão moto com moto
		for (int i = 0; i < moto.size(); i ++) {
		for (int j = 0; j < moto.size(); j++) {
		if(moto.get(j).getX() == moto.get(i).getX() && moto.get(j).getY() == moto.get(i).getY()) {
		if(i == j) {
						
					}
		else {
						moto.remove(moto.get(i));
					}	
				}
			}
		}
		
                  //Colisão entre Bike e Bike
                for (int i = 0; i < bike.size(); i ++) {
		for (int j = 0; j < bike.size(); j++) {
		if(bike.get(j).getX() == bike.get(i).getX() && bike.get(j).getY() == bike.get(i).getY()) {
			if(i == j) {
						
				}
			else {
			bike.remove(bike.get(i));
					}	
				}
			}
		}
		/// Colisão entre caminhão e carro
		for(int i = 0; i < truck.size(); i++) {
		for (int j = 0; j < car.size(); j++) {
		if(car.get(j).getX() == truck.get(i).getX() && car.get(j).getY() == truck.get(i).getY()) {
		if(truck.size() > car.size()) {
						
					}
			else {
			car.remove(car.get(j));
				}
			}
		}
	}
		/// Colisão entre caminhão e moto
		for(int i = 0; i < truck.size(); i++) {
		for (int j = 0; j < moto.size(); j++) {
			if(moto.get(j).getX() == truck.get(i).getX() && moto.get(j).getY() == truck.get(i).getY()) {
			if(truck.size() > moto.size()) {
						
				}
			else {
		moto.remove(moto.get(j));
				}
			}
		}
	}
		/// Colisão entre moto e carro
		for(int i = 0; i < car.size(); i++) {
		for (int j = 0; j < moto.size(); j++) {
			if(moto.get(j).getX() == car.get(i).getX() && moto.get(j).getY() == car.get(i).getY()) {
			if(car.size()>moto.size()) {
						
					}
				else {
				moto.remove(moto.get(i));
					
                                      }
					
			}
		}
	}
                //Colisão entre Bike e Moto
                for(int i = 0; i < moto.size(); i++) {
			for (int j = 0; j < bike.size(); j++) {
			if(bike.get(j).getX() == moto.get(i).getX() && bike.get(j).getY() == moto.get(i).getY()) {
			if(moto.size()>bike.size()) {
						
				}
				else {
			bike.remove(bike.get(i));
				}
					
			}
		}
	}
                //Colisão entre Bike e Carro
                for(int i = 0; i < car.size(); i++) {
		for (int j = 0; j < bike.size(); j++) {
			if(bike.get(j).getX() == car.get(i).getX() && bike.get(j).getY() == car.get(i).getY()) {
				if(car.size()>bike.size()) {
						
				}
					else {
						bike.remove(bike.get(i));
				}
					
			}
		}
	}
                //Colisão entre Bike e Truck
                for(int i = 0; i < truck.size(); i++) {
		for (int j = 0; j < bike.size(); j++) {
			if(bike.get(j).getX() == truck.get(i).getX() && bike.get(j).getY() == truck.get(i).getY()) {
					
                                  if(truck.size()>bike.size()) {
						
					}
				else {
						bike.remove(bike.get(i));
				}
					
			}
			}
		}
	}
	
	/**
	 * Função que gera um veículo na fábricas quando o mesmo entra nela
	 */
	public void geraVeiculo() {
		for(int a = 0; a < car.size(); a++) {
			int x = car.get(a).getX();
			int y = car.get(a).getY();
			for(int i = 0; i < 30; i ++) {
				for(int j = 0; j < 60; j++) {
				if(i == x && j == y) {
				if(mapaInicial[i][j] == 2 && car.get(a).isFabrica() == false) {
				car.get(a).setFabrica(true);///O veículo não gera mais um outro veículo se ele ja foi gerado antes 
				car.add(new Car((v.setX()+1), (v.setY()+1), 2, "verde", false));
							}
						}
					}
				}
			}
		
		for(int a = 0; a < truck.size(); a++) {
			int x = truck.get(a).getX();
			int y = truck.get(a).getY();
			for(int i = 0; i < 30; i ++) {
				for(int j = 0; j < 60; j++) {
				if(i == x && j == y) {
					if(mapaInicial[i][j] == 2 && truck.get(a).isFabrica() == false) {
					truck.get(a).setFabrica(true);
					truck.add(new Truck((v.setX()+1), (v.setY()+1), 1, "verde", false));
					}
				}
			}
		}
	}
		
	
		for(int a = 0; a < moto.size(); a++) {
		int x = moto.get(a).getX();
		int y = moto.get(a).getY();
			for(int i = 0; i < 30; i ++) {
				for(int j = 0; j < 60; j++) {
				if(i == x && j == y) {
					if(mapaInicial[i][j] == 2 && moto.get(a).isFabrica() == false) {
					moto.get(a).setFabrica(true);
					moto.add(new Motocycle((v.setX()+1), (v.setY()+1), 3, "vermelho", false));
						}
					}
				}
			}
	}
                for(int a = 0; a < bike.size(); a++) {
		int x = bike.get(a).getX();
		int y = bike.get(a).getY();
			for(int i = 0; i < 30; i ++) {
				for(int j = 0; j < 60; j++) {
				if(i == x && j == y) {
					if(mapaInicial[i][j] == 2 && bike.get(a).isFabrica() == false) {
					bike.get(a).setFabrica(true);
						bike.add(new Bike((v.setX()+1), (v.setY()+1), 3, "Verde", false));
						}
					}
				}
			}
	}
}
        

    }
    
    

