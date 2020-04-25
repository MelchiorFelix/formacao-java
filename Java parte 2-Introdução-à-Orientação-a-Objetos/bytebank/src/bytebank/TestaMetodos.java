package bytebank;

public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.deposita(500);
		c2.deposita(1500);
		
		c2.saca(250);
		c2.transfere(c1, 250);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
	}

}
