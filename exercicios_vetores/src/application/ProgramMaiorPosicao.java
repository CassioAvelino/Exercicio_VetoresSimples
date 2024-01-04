package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		System.out.println();
		
		double []numeros = new double [n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		double maiorValor = numeros[0];
		int posicao = 0;
		for(int i = 0; i < numeros.length; i++) {
			if (maiorValor < numeros[i]) {
				maiorValor = numeros[i];
				posicao = i;
				i++;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = "+maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR = "+posicao);
		sc.close();
	}

}
