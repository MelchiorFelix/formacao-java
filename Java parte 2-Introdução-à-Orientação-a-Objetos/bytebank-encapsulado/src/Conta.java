
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (this.agencia < 0) {
			System.out.println("Opa conta não pode ser negativa");
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void setNumero(int numero) {
		if (this.numero < 0) {
			System.out.println("Opa numero não pode ser negativa");
		}
		this.numero = numero;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(Conta destino, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

}
