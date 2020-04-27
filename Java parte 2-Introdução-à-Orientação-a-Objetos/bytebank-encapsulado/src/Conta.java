
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
        if(agencia >= 0) {
        	this.agencia = agencia;
        } else {
        	System.out.println("Opa,Agencia não pode ser negativa");
        	return;
        }
        if(agencia >= 0) {
        	this.numero = numero;
        } else {
        	System.out.println("Opa,numero não pode ser negativa");
        	return;
        }
        
        this.saldo = 100;
        System.out.println("Estou criando uma conta" + this.numero);
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (this.agencia <= 0) {
			System.out.println("Opa,Agencia não pode ser negativa");
			return;
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
		if (this.numero <= 0) {
			System.out.println("Opa,numero não pode ser negativa");
			return;
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
	
	public static int getTotal() {
		return total;
	}

}
