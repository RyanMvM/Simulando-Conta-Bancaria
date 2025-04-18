package operacoes;

import conta.ContaBancaria;

public class ConsultaBancaria {

	public static void consultarSaldo(ContaBancaria conta) {
		
		System.out.println("Saldo atual da conta " + conta.getNumeroConta() + " é R$ " + conta.getSaldo());
	}
	
}
