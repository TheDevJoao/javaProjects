package logica.decisaoif;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inicio do programa \n");
		System.out.println("Digite sua idade: \n");
		int idade = Console.readInt();
		
		if (idade >= 0 && idade <=12) {
			System.out.println("\nVoc� � uma crian�a! \n");
		} else if (idade > 12 && idade <= 17){
			System.out.println("\nVoc� � um adolescente! \n");
		} else if (idade > 17 && idade <= 59) {
			System.out.println("\nVoc� � um adulto! \n");
			
		} else if (idade > 59) {
			System.out.println("\nVoc� � idoso! \n");
		} else {
			System.out.println("\nIdade inv�lida! \n");
		}
		
		System.out.println("Fim do programa");
	}

}
