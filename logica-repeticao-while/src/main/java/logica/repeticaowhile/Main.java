package logica.repeticaowhile;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		
		double nota;
		int cont = 1;
		double soma = 0; //Toda vez que colocar uma nota, esse variavel vai contando a soma.
		
		do {
			System.out.println("Digite a nota " + cont++ + ":");
			nota = Console.readDouble();
			//cont++; //cont = cont + 1;
			//soma = soma + nota; Na proxima repetição vai ser a soma + a nova nota e assim por diante
			
			if (nota != -1) {
				soma += nota; // Mesma coisa que soma = soma + nota;
				System.out.println(("soma = ") + soma);
			}
			
		} while (nota != -1);
		
		double media = soma / (cont - 2);
		
		System.out.println("Media = " + media);
		
		
	}

}
