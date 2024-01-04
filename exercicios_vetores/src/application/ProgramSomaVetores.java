package application;

import java.util.Scanner;

public class ProgramSomaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int []A = new int [n];
		int []B = new int [n];
		
		System.out.println("Digite os valores do Vetor A: ");
		for(int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do Vetor B: ");
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}
		
		
		int sum = 0;
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < A.length; i++) {
			sum = A[i] + B[i];
			System.out.println(sum);
		}
		
		sc.close();

	}

}
