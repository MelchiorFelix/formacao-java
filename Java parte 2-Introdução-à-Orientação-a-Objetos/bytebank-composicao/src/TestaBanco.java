
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.agencia = 1;
		conta.numero = 16;
		conta.saldo = 500;
		conta.titular = new Cliente();
		
		conta.titular.cpf = "555.555.555-55";
		conta.titular.nome = "Melchior Felix";
		conta.titular.profissao = "programador";
		
		System.out.println(conta.titular);
		System.out.println(conta.titular.nome);
	}
}
