package view;

import java.util.Scanner;

import dao.*;
import model.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Op��o 1 - Cadastro de Cliente: ");
		System.out.println("Op��o 5 - Sair");
		int option = sc.nextInt();
		while(option != 5) {
			
			if(option == 1) {
				
				System.out.println("Digite o nome do usu�rio: ");
				String nome = sc.next();
				
				System.out.println("Digite o id do usu�rio, lembrando que n�o pode ser repetir: ");
				int id = sc.nextInt();
				
				Cliente cliente = new Cliente(nome, id);
				
				ClienteDao clienteDao = new ClienteDao();
				clienteDao.create(cliente);
			}
			
				System.out.println("Op��o 1 - Cadastro de Cliente: ");
				System.out.println("Op��o 5 - Sair");
				
				option = sc.nextInt();
			}
			sc.close();
		}
	}
