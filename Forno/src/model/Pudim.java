package model;

public class Pudim {
	
	private FornoNormal forno;
	private int tamanho;
	private boolean assado;
	
	
	public int getTamanho() {
		return tamanho;
	}
	
	public boolean isAssado() {
		return assado;
	}
	
	public FornoNormal getForno() {
		return forno;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setAssado (boolean assado) {
		this.assado = assado;
	}

	public void setForno(FornoNormal forno) {
		this.forno = forno;
	}

	public String Assado() {
		if (assado == true) {
			return "Assado";
		} else {
			return "Não está pronto!";
		}
	}
	
	@Override
	public String toString() {
		return "O tamanho do Pudim é: " + this.tamanho+"cm"+ "\n" +
			   "O pudim está: " + Assado() + "\n" +
			   "Esse pudim está no Forno: " + this.forno.getId()+ "\n";
	}
	
}

