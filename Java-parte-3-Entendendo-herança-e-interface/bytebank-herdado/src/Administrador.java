
public class Administrador extends Funcionario implements Autenticador{
	
	private AutenticadorImpl impl;
	
	public  Administrador() {
		this.impl = new AutenticadorImpl();
	}

	@Override
	public double getBonificacao() {
		return 100;
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
