package application;

import java.util.Scanner;

public class ProgramNegativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você ira digitar: ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NÚMERO NEGATIVOS: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();

	}

}
