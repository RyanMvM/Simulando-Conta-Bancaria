package operacoes;

import conta.ContaBancaria;

public class Deposito {

	public static void deposito(ContaBancaria conta, double valor) {

		conta.depositar(valor);

	}
}
