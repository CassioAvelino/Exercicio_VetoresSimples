package application;

import java.util.Scanner;

public class ProgramMaisVelho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String [] nomes = new String[n];
		int [] idades = new int[n];
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Dados da "+(i+1)+"° Pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		int inicioIdade = idades[0];
		int posicao = 0;
		for (int i = 0; i < idades.length; i++) {
			if (inicioIdade < idades[i]) {
				inicioIdade = idades[i];
			}
			posicao++;
			i++;
		}
		System.out.println("Pessoa Mais Velha: "+nomes[posicao]);
		
		sc.close();

	}

}
