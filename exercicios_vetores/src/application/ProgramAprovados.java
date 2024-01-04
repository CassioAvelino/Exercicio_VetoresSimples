package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String [] nomes = new String [n];
		double [] nota1 = new double [n];
		double [] nota2 = new double [n];
		
		for (int i = 0; i < nota1.length; i++) { //Obtendo dados
			System.out.println("Digite nome, primeira e segunda nota do " +(i+1)+"° aluno: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		
		for (int i = 0; i < nota1.length; i++) { //Calculando a média
			double media = (nota1[i] + nota2[i])/2;
				if(media >= 6) {
						System.out.println(nomes[i]); //Exibindo nome
					}
				}
		
		sc.close();

	}

}
