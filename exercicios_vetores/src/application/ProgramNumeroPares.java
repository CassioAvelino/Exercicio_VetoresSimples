package application;

import java.util.Scanner;

public class ProgramNumeroPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		int quantidadePares = 0;
		System.out.println();
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + "  ");
				quantidadePares++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = "+quantidadePares);

		sc.close();

	}

}
