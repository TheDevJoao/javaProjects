package model;

public class Cliente {

	private int id;
	private String nome;
	
	public Cliente(String nome, int id) {
		this.id = id;
		this.nome = nome;
	}
	
	public Cliente() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
