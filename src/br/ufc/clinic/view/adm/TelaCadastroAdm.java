package br.ufc.clinic.view.adm;

import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;

import br.ufc.clinic.controller.AdministradorController;
import br.ufc.clinic.view.atendente.TelaCadastroAtedente;
import br.ufc.clinic.view.telasIniciais.TelaCriarConta;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class TelaCadastroAdm extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public TelaCadastroAdm() {
		initComponents();
	}

	private void initComponents() {

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("I9Life");
		setBackground(new java.awt.Color(255, 255, 255));
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		setResizable(false);

		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroAdm.class.getResource("/br/ufc/clinic/imagens/logo.png")));

		jLabelCadastrarAdmTXT = new javax.swing.JLabel("Cadastre-se como Administrador");
		jLabelCadastrarAdmTXT.setFont(new Font("Dialog", Font.BOLD, 24));
		jLabelCadastrarAdmTXT.setForeground(new java.awt.Color(0, 0, 51));

		txtNome = new javax.swing.JTextField();
		txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("NOME"));

		txtEmail = new javax.swing.JTextField();
		txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("EMAIL"));

		txtSenha = new javax.swing.JPasswordField();
		txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("SENHA"));

		txtConfirmarSenha = new javax.swing.JPasswordField();
		txtConfirmarSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtConfirmarSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("CONFIRMAR SENHA"));

		buttonVoltar = new javax.swing.JButton("VOLTAR");
		buttonVoltar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TelaCriarConta telaCriarConta = new TelaCriarConta();
				telaCriarConta.setVisible(true);

				dispose();
			}
		});

		buttonRestaurar = new javax.swing.JButton("LIMPAR");
		buttonRestaurar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonRestaurar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonRestaurarActionPerformed(evt);
			}
		});

		buttonCadastrar = new javax.swing.JButton("CADASTRAR");
		buttonCadastrar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonCadastrarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel1Layout
				.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(174).addGroup(jPanel1Layout
								.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 91,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(buttonRestaurar, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addGap(27).addComponent(buttonCadastrar, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(txtConfirmarSenha, GroupLayout.PREFERRED_SIZE, 394,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(24)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(jLabelCadastrarAdmTXT, GroupLayout.PREFERRED_SIZE, 684,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(25, Short.MAX_VALUE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 90,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(35)
										.addComponent(jLabelCadastrarAdmTXT, GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addGap(58)))
						.addGap(18).addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(26).addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(22)
						.addComponent(txtConfirmarSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(34)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(buttonCadastrar, GroupLayout.PREFERRED_SIZE, 29,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonRestaurar, GroupLayout.PREFERRED_SIZE, 29,
										GroupLayout.PREFERRED_SIZE))
						.addGap(36)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 746, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);

	}

	private void buttonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {
		txtNome.setText("");
		txtEmail.setText("");
		txtSenha.setText("");
		txtConfirmarSenha.setText("");
	}

	@SuppressWarnings("deprecation")
	private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
		if (txtNome.getText().isEmpty() || txtEmail.getText().isEmpty() || txtSenha.getText().isEmpty()
				|| txtConfirmarSenha.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Campos vazios!");

		} else if (Arrays.equals(txtSenha.getPassword(), txtConfirmarSenha.getPassword()) == false) {
			txtSenha.setText("");
			txtConfirmarSenha.setText("");

			JOptionPane.showMessageDialog(null, "As senhas informadas não correspondem!");

		} else {
			AdministradorController.cadastraAdm(0, txtNome.getText(), txtEmail.getText(), txtSenha.getText());

			buttonRestaurarActionPerformed(evt);

			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

			TelaMenuAdm telaMenuAdm = new TelaMenuAdm();
			telaMenuAdm.setVisible(true);

			dispose();
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
			java.util.logging.Logger.getLogger(TelaCadastroAtedente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroAtedente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroAtedente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroAtedente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

	}

	private javax.swing.JButton buttonCadastrar;
	private javax.swing.JButton buttonRestaurar;
	private javax.swing.JLabel jLabelCadastrarAdmTXT;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField txtConfirmarSenha;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtNome;
	private javax.swing.JPasswordField txtSenha;
	private JButton buttonVoltar;
	private JLabel lblNewLabel;
}
