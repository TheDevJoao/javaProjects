package view;

import model.FornoNormal;
import model.FornoEletrico;
import model.Pudim;

public class Main {

	public static void main(String[] args) {

	    FornoNormal forno1 = new FornoNormal(1, 300, true);
	    
	    forno1.setTemperatura(220);
	  
	    System.out.println(forno1);
	    
	
	    Pudim pudim1 = new Pudim();
	    
	    pudim1.setTamanho(50);
	    pudim1.setForno(forno1);
	    pudim1.setAssado(true);
	    
	    System.out.println(pudim1);
	    
	    FornoEletrico fe1 = new FornoEletrico(45, 400, true, 1400);
	    
	    fe1.setTemperatura(220);
	    
	    System.out.println(fe1);
	}

}
