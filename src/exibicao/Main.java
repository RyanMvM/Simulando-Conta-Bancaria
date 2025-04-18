package exibicao;

import java.util.Locale;

import conta.ContaBancaria;
import menu.Menu;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		ContaBancaria conta = new ContaBancaria("seunome", "numeroDaConta", 2000.0); 
		
		Menu menu = new Menu(conta); 
		menu.exibirMenu();
	}

}
