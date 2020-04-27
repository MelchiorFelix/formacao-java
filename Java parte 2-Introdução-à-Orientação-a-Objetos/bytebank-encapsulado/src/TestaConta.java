
public class TestaConta {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(-123, 456);
		
		Conta conta2 = new Conta(789, 101112);
		
		System.out.println(Conta.getTotal());
	}

}
