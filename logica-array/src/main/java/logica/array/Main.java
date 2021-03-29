package logica.array;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		/*
		System.out.println("Nota 1: ");
		double nota1 = Console.readInt();
		
		System.out.println("Nota 2: ");
		double nota2 = Console.readInt();
		
		System.out.println("Nota 3: ");
		double nota3 = Console.readInt();
		
		System.out.println("Notas: ");
		System.out.println(nota1);
		System.out.println(nota2);
		System.out.println(nota3);
		*/
		
		double [] notas = new double [2];
		
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ":");
			notas [i] = Console.readDouble();
		}
		
		for (int i = 0; i< notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
}
