package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int somaPares = 0, npares = 0;
		double mediaPares;

		System.out.print("Quantos elementos vai ter o vetor?: ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				somaPares = somaPares + numeros[i];
				npares++;
			}
		}

		if (npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediaPares = (double)somaPares/npares;
			System.out.println("MEDIA DOS PARES: "+mediaPares);
		}

		sc.close();

	}

}
