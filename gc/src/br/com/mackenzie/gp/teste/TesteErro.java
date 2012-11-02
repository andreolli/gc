package br.com.mackenzie.gp.teste;

public class TesteErro {
	public static void main(String[] args) {
		
		float resultado = 0;
		
		try {
			resultado = Calculadora.dividir(9,0);
		}catch(java.lang.ArithmeticException n) {
			System.out.println("java.lang.ArithmeticException");	
			System.out.println("tratando a excessao.");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("Resutado da Divisao: " + resultado);

		System.out.println("Fim com sucesso!");

		
	}
}

class Calculadora{

	
	public static float dividir(int a, int b) throws java.lang.ArithmeticException{
		try{
			return a / b;
		}catch(java.lang.ArithmeticException n) {
			throw n;	
		}
	}
}