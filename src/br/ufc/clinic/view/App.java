package br.ufc.clinic.view;

import br.ufc.clinic.view.telasIniciais.TelaLogin;

public class App {
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaLogin().setVisible(true);
			}
		});
	}
}
