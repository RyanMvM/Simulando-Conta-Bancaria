package conta;

public class ContaBancaria {

	private String titular;
	private String numeroConta;
	private double saldo;

	public ContaBancaria(String titular, String numeroConta, double saldo) {

		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double depositar (double valor) {
		return saldo; 
		
	}
	public boolean sacar(double valor) {

	boolean sucesso = (saldo >= valor); 
	saldo = sucesso ? saldo - valor : saldo; 
	return sucesso; 
	
	}

	public String toString() {

		return "/nNome: " + this.getTitular() + "/nNumero da COnta: " + this.getNumeroConta() + "/nSaldo: "
				+ this.getSaldo();

	}

}
