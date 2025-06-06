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

	public void depositar(double valor) {
		if (valor > 0) {

			saldo += valor;
			System.out.println("Deposito de R$ " + valor + " realiado com sucesso!");
		} else {
			System.out.println("Deposito inválido!");
		}

	}

	public boolean sacar(double valor) {

		boolean sucesso = (saldo >= valor);
		saldo = sucesso ? saldo - valor : saldo;
		return sucesso;

	}

	public String toString() {

		return "/nNome: " + this.getTitular() + "/nNumero da Conta: " + this.getNumeroConta() + "/nSaldo: "
				+ this.getSaldo();

	}

}
