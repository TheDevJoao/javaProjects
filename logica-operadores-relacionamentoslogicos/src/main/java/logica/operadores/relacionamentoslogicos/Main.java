package logica.operadores.relacionamentoslogicos;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Numero 1: ");
		int n1 = Console.readInt();
		
		System.out.println("Numero 2: ");
		int n2 = Console.readInt();
		
		boolean igual = n1 == n2; // O resultado tem que ser true
		System.out.println("Esses valores são iguais? " + igual);
		
		boolean diferente = n1 != n2;
		System.out.println("Esses valores são diferentes? " + diferente);
		
		boolean primeiroMaiorQueSegundo = n1 > n2; // Se n1 for maior que n2, resultado = true
		System.out.println("Primeiro maior que segundo? " + primeiroMaiorQueSegundo);
		
		boolean primeiroMaiorIgualQueSegundo = n1 >= n2;
		System.out.println("Primeiro maior igual que segundo? " + primeiroMaiorIgualQueSegundo);
		
		
	}

}
