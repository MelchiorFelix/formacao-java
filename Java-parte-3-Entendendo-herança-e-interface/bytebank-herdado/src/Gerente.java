//Gerente é um Funcionario,Gerente herda da class Funcionario
public class Gerente extends Funcionario implements Autenticador{
	
	private AutenticadorImpl impl;
	
	public Gerente() {
		this.impl = new AutenticadorImpl();
	}
	

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
		return  super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.impl.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha)  {
		return this.impl.autentica(senha);
	}

}
