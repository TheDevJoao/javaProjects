package logica.fibonacci;

public class Main {

	public static void main(String[] args) {

		int vezes = 10;
		
		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) { // contador inicia em 0, 
		
			System.out.print(i + " ");
			
			i = i + j;
			j = i - j;
		}
	}
}
