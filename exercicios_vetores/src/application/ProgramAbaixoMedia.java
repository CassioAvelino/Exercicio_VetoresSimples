package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAbaixoMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] numeros = new double[n];

		double sum = 0.0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			sum += numeros[i];
		}

		double mediaVetor = sum / n;

		System.out.println("MEDIA DO VETOR = " + mediaVetor);

		System.out.println("ELEMNTOS ABAIXO DA MÉDIA: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < mediaVetor) {
				System.out.println(numeros[i]);
			}
		}

		sc.close();

	}

}
