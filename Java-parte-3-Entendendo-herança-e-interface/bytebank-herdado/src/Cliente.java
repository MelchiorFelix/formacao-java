
public class Cliente implements Autenticador{
	
	private AutenticadorImpl impl;
	
	public Cliente() {
		this.impl = new AutenticadorImpl();
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
