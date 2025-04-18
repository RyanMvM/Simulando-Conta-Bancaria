package menu;

import java.util.Scanner;
import operacoes.ConsultaBancaria;
import conta.ContaBancaria;
import operacoes.Deposito;
import operacoes.Saque;

public class Menu {

	private ContaBancaria conta;

	public Menu(ContaBancaria conta) {
		this.conta = conta;
	}

	public void exibirMenu() {

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {

				System.out.println("\n----- MENU -----");
				System.out.println("1. Depositar");
				System.out.println("2. Sacar");
				System.out.println("3. Consultar Saldo");
				System.out.println("4. Sair");
				System.out.print("Escolha uma opção: ");

				int opcao = sc.nextInt();

				switch (opcao) {

				case 1:
					System.out.print("Digite o valor a ser depositado: R$ ");
					double deposito = sc.nextDouble();
					Deposito.deposito(conta, deposito);
					break;
				case 2:
					System.out.print("Digite o valor a ser sacado: R$ ");
					double saque = sc.nextDouble();
					Saque.sacar(conta, saque);
					break;
				case 3:
					ConsultaBancaria.consultarSaldo(conta);
					break;
				case 4:
					System.out.println("Saindo...");
					return;
				default:
					System.out.println("Opção inválida.");

				}
			}

		}
	}
}
