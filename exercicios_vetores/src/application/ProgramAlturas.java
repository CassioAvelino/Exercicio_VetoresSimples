package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAlturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < altura.length; i++) {
			System.out.printf("Dados da " + (i + 1) + "° Pessoa: %n");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < altura.length; i++) {
			sum += altura[i];
		}

		double avg = sum / n;
		System.out.println();
		System.out.printf("Altura média: %.2f", avg);
		
		double nmenores = 0;
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] < 16) {
				nmenores++;
			}
		}
		
		double percentualMenores = (nmenores / n) * 100.0;
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}

		sc.close();

	}

}
