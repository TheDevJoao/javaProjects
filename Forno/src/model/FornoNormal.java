package model;

public class FornoNormal {
	
	private int id;
	private int temperatura;
	private boolean ligado;
	private int temperaturaMaxima;
	
	public FornoNormal (int id, int temperaturaMaxima, boolean ligado) {
		this.id= id;
		this.temperaturaMaxima = temperaturaMaxima;
		this.ligado = ligado;
		
		
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
	
// Setters
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
	
	// toString
	
	@Override
	public String toString() {
		return "Forno N°: " + this.id + "\n"+
			   "Forno está: " + Ligado() + "!\n" +
		       "A temperatura inicial é: " + getTemperatura() + "°C" + "!" + "\n"+
		       "A temperatura Maxima é: " + getTemperaturaMaxima()+ "°C" + "! \n";
		
	}
	
	
	
	
	
	
	
}
