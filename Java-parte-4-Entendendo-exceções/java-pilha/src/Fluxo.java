
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini metodo main");
		try {
			metodo1();
		} catch (Exception e) {
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
		throw new MinhaException("Deu errado denovo");
		//System.out.println("Fim meto metodo2");
	}

}
