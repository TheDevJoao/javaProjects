package view;

import java.util.Scanner;

import dao.*;
import model.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Opção 1 - Cadastro de Cliente: ");
		System.out.println("Opção 5 - Sair");
		int option = sc.nextInt();
		while(option != 5) {
			
			if(option == 1) {
				
				System.out.println("Digite o nome do usuário: ");
				String nome = sc.next();
				
				System.out.println("Digite o id do usuário, lembrando que não pode ser repetir: ");
				int id = sc.nextInt();
				
				Cliente cliente = new Cliente(nome, id);
				
				ClienteDao clienteDao = new ClienteDao();
				clienteDao.create(cliente);
			}
			
				System.out.println("Opção 1 - Cadastro de Cliente: ");
				System.out.println("Opção 5 - Sair");
				
				option = sc.nextInt();
			}
			sc.close();
		}
	}
