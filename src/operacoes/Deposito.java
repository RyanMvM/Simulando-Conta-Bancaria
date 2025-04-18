package operacoes;

import conta.ContaBancaria;

public class Deposito {

	public static void deposita (ContaBancaria conta, double valor) {
		
		conta.depositar(valor); 
		System.out.println();
	}
}
