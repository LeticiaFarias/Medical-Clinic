package br.ufc.clinic.view;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.ufc.clinic.controller.AdministradorController;
import br.ufc.clinic.controller.AtendenteController;
import br.ufc.clinic.controller.ClienteController;
import br.ufc.clinic.controller.MedicoController;
import br.ufc.clinic.util.ValidaUtil;

import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JTextField;

public class TelaLogin extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	public TelaLogin() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		buttonEntrar = new javax.swing.JButton();
		buttonVoltar = new javax.swing.JButton();
		txtLogin = new javax.swing.JTextField();
		txtSenha = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Acesso");
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setToolTipText("Acesso");

		// jLabel4.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("logoppp.png"))); // NOI18N

		txtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("LOGIN"));

		txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("SENHA"));

		buttonEntrar.setBackground(new java.awt.Color(255, 255, 255));
		buttonEntrar.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		buttonEntrar.setText("Entrar");
		buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonEntrarActionPerformed(evt);
			}
		});

		buttonVoltar.setBackground(new java.awt.Color(255, 255, 255));
		buttonVoltar.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		buttonVoltar.setText("VOLTAR");
		buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TelaCriarConta telaCriarConta = new TelaCriarConta();
				telaCriarConta.setVisible(true);
				dispose();
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(126, Short.MAX_VALUE)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 111,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18)
														.addComponent(buttonEntrar, GroupLayout.PREFERRED_SIZE, 111,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(jLabel4)))
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, 237,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, 235,
														GroupLayout.PREFERRED_SIZE))))
						.addGap(74)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE).addGap(38)
						.addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(32)
						.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(buttonEntrar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGap(43)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
		setLocationRelativeTo(null);
	}

	public void restaurar() {
		txtLogin.setText("");
		txtSenha.setText("");
	}

	private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {
		if (ValidaUtil.validaEmail(txtLogin.getText()) == 1) {
			// CHAMA TELA DE MENU DO ADMINISTRADOR

		} else if (ValidaUtil.validaEmail(txtLogin.getText()) == 2) {
			if (AtendenteController.login(txtLogin.getText(), txtSenha.getText()) == true) {
				TelaMenuAtendente telaMenuAtendente = new TelaMenuAtendente();

				telaMenuAtendente.setVisible(true);
				dispose();
			} else {
				txtSenha.setText("");

				JOptionPane.showMessageDialog(null, "Senha incorreta!");
			}

		} else if (ValidaUtil.validaEmail(txtLogin.getText()) == 3) {
			if (MedicoController.login(txtLogin.getText(), txtSenha.getText()) == true) {
				TelaMenuMedico telaMenuMedico = new TelaMenuMedico();

				telaMenuMedico.setVisible(true);
				dispose();
			} else {
				txtSenha.setText("");

				JOptionPane.showMessageDialog(null, "Senha incorreta!");
			}

		} else if (ValidaUtil.validaEmail(txtLogin.getText()) == 4) {
			// chama a tela menu cliente;
		} else if (ValidaUtil.validaEmail(txtLogin.getText()) == 0) {
			txtLogin.setText("");
			JOptionPane.showMessageDialog(null, "Email incorreto!");
		} else {
			restaurar();

			JOptionPane.showMessageDialog(null,
					"Ocorreu um erro inesperado ao realizar login.\nPor favor, tente novamente.");
		}
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaLogin().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonEntrar;
	private javax.swing.JButton buttonVoltar;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField txtLogin;
	private javax.swing.JPasswordField txtSenha;

	// End of variables declaration//GEN-END:variables
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
