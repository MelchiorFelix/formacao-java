
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini metodo main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			String msg = e.getMessage();
			System.out.println("Exception: " + msg);
			e.printStackTrace();
			
		}
		System.out.println("Fim meto main");
	}
	
	public static void metodo1() {
		System.out.println("Ini metodo metodo1");
		metodo2();
		System.out.println("Fim meto metodo1");
	}
	
	public static void metodo2() {
		System.out.println("Ini metodo metodo2");
		for(int i = 1; i <= 5;i++) {
			System.out.println(i);
			//int n = i/0;
			Conta c = null;
			c.deposita();
			
			
		}
		System.out.println("Fim meto metodo2");
	}

}
