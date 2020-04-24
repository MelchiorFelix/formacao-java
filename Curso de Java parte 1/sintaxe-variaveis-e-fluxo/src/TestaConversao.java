
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		//long numeroGrande = 32432423523L;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		System.out.println(valor1 + valor2); //pra dinheiro não dá pra usar double :(,vamos ter que usar um lib,ehhh,viva as libs
	}

}
