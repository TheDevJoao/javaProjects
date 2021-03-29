package model;

public class FornoEletrico {

	private int id;
	private int temperatura;
	private boolean ligado;
	private int temperaturaMaxima;
	private int potencia;
	
	
	public FornoEletrico (int id, int temperaturaMaxima, boolean ligado, int potencia) {
		this.id= id;
		this.temperaturaMaxima = temperaturaMaxima;
		this.ligado = ligado;
		this.potencia = potencia;
		
		
	}
	
	// Setters
	
		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public void setTemperaturaMaxima(int temperaturaMaxima) {
		
				this.temperaturaMaxima = temperaturaMaxima;	
		}
		
		public void setLigado(boolean ligado) {
			this.ligado = ligado;
		}
		
		public void setTemperatura(int temperatura) {
			if (temperatura > this.temperaturaMaxima) {
				this.temperatura = this.temperaturaMaxima;
			}		
			else {
				this.temperatura = temperatura;
			}	
		}
	
	// Getters
	
	public int getId() {
		return this.id;
	}
	
	public int getTemperaturaMaxima() {
		return this.temperaturaMaxima;
	}
    
	public boolean isLigado() {
		return this.ligado;
	}
	
	public int getTemperatura() {
		return this.temperatura;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	
	
	public void manterQuente () {
		this.temperatura= this.temperaturaMaxima / 2;
	}
	

	public String Ligado() {
		if (ligado == true) {
			return "LIGADO";
		}
		else {
			return "DESLIGADO";
		}
		
	}
	
	//toString
	
	@Override
	public String toString() {
		return "O forno " + this.id + " está " + Ligado() + " em " + this.temperatura +
				" graus, e sua potencia é de " + this.potencia + " watts.";  
	}
}
