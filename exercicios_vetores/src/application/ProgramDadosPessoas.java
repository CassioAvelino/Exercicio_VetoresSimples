package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int qtdHomens, qtdMulheres;
		double maiorAltura, menorAltura, medAltFem, totAltFem;
		
		System.out.print("Quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		
		double [] altura = new double [n];
		char [] genero = new char [n];
		
		for(int i = 0; i < altura.length; i++) {
			System.out.print("Altura da "+(i+1)+"° pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da "+(i+1)+"° pessoa: ");
			sc.nextLine();
			genero[i] = sc.next().charAt(0);
		}
		
		maiorAltura = altura[0];
		menorAltura = altura[0];
		
		for(int i = 0; i < altura.length; i++) {
			if (altura[i] > maiorAltura){
				maiorAltura = altura[i]; 
			} 
			if (altura [i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		qtdHomens = 0;
		qtdMulheres = 0;
		totAltFem = 0;
		medAltFem = 0;
		for (int i = 0; i < altura.length; i++) {
			if (genero[i] == 'M') {
				qtdHomens++;
			} else {
				qtdMulheres++;
				totAltFem = totAltFem + altura[i];
				medAltFem = totAltFem / qtdMulheres;
				
			}
		}
		System.out.printf("Menor Altura: %.2f\n", menorAltura);
		System.out.printf("Maior Altura: %.2f\n", maiorAltura);
		System.out.printf("Media das Alturas da Mulheres: %.2f\n", medAltFem);
		System.out.printf("Quantidade de Homens: %d", qtdHomens);
		
		sc.close();

	}

}
