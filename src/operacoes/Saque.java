package operacoes;

import conta.ContaBancaria;

public class Saque {

	public static void sacar(ContaBancaria conta, double valor){

		if (conta.sacar(valor)) {

			System.out.println("Saque de R$ " + valor + " realizado com sucesso!");

		}
	}
}
