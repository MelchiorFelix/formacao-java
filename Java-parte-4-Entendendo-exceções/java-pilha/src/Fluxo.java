
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini metodo main");
		metodo1();
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
		}
		System.out.println("Fim meto metodo2");
	}

}
