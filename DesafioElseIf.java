package Fundamentos;

import java.util.Scanner;

public class DesafioElseIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println(
				"Digite o numero respectivo ao dia");
		int numero = entrada.nextInt();
		
		if (numero > 7 || numero < 1) {
			System.out.println("Numero invalido!");
		}
		
		if (numero == 1) {
			System.out.println("Domigo");
		}else if (numero == 2) {
			System.out.println("Segunda-Feira");
		}else if (numero == 3) {
			System.out.println("Terça-Feira");
		}else if (numero == 4) {
			System.out.println("Quarta-Feira");
		}else if (numero == 5) {
			System.out.println("Sexta-Feira");
		}else if (numero == 6) {
			System.out.println("Sabado");
		}	
		
		entrada.close();
	}
}
