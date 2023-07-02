package Fundamentos;

public class Logicos {
	public static void main(String[] args) {
		
		boolean valor = true;
		boolean valor2 = 3 > 7;
		
		System.out.println(valor);
		System.out.println(valor2);
		
		
		System.out.println(valor && valor2); //AND 
		System.out.println(valor || valor2); //OR 
		System.out.println(valor ^ valor2); //OU exclusivo "XOR"
		System.out.println(!valor); //NOT, Negação
		
		
		
	}

}
