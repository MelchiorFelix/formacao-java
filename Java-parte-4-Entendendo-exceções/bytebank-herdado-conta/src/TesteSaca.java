
public class TesteSaca {
	
	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca(555, 666);
		
		ContaCorrente cc = new ContaCorrente(123,456);
		cc.deposita(200.0);
		try {
			cc.transfere(250.0, cp);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		
		
	}
}
