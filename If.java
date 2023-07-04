package Fundamentos;

import java.util.Scanner;

public class If {
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			
			System.out.println("Informe a media: ");
			double media = entrada.nextDouble();
			
			if (media >= 7) {
				System.out.println("Voce passou! ");
				System.out.println("Parabens!");
			}
			 if (media >= 5 && media  <= 7) {
				 System.out.println("Voce esta de recuperação");
			 }
			
			if (media < 5 && media >= 0 ) {
				System.out.println("Voce esta reprovado! ");
			}
			//estrutura de controle
			entrada.close();
		}

}
