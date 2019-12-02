package br.ufc.clinic.view;

public class App {
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaCadastroAtedente().setVisible(true);
			}
		});
	}
}
