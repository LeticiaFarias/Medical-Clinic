package br.ufc.clinic.view.atendente;

import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;

import br.ufc.clinic.controller.AtendenteController;
import br.ufc.clinic.view.adm.TelaMenuAdm;
import br.ufc.clinic.view.telasIniciais.TelaCriarConta;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class TelaCadastroAtedente extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public TelaCadastroAtedente() {
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
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroAtedente.class.getResource("/br/ufc/clinic/imagens/logo.png")));

		jLabelCadastrarAtendenteTXT = new javax.swing.JLabel("Cadastre seu Atendente!");
		jLabelCadastrarAtendenteTXT.setFont(new Font("Dialog", Font.BOLD, 24)); // NOI18N
		jLabelCadastrarAtendenteTXT.setForeground(new java.awt.Color(0, 0, 51));

		txtCpf = new javax.swing.JTextField();
		txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

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
				TelaMenuAdm telaMenuAdm = new TelaMenuAdm();
				telaMenuAdm.setVisible(true);

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

		buttonVoltar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonVoltar.setText("VOLTAR");
		buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
				TelaMenuAdm telaMenuAdm = new TelaMenuAdm();
				telaMenuAdm.setVisible(true);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(93)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
						.addGap(47).addComponent(jLabelCadastrarAtendenteTXT).addContainerGap(93, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(txtEmail,
										422, 422, 422))
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(216, Short.MAX_VALUE)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 120,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED, 36,
																Short.MAX_VALUE)
														.addComponent(buttonRestaurar, GroupLayout.PREFERRED_SIZE, 120,
																GroupLayout.PREFERRED_SIZE)
														.addGap(26).addComponent(buttonCadastrar,
																GroupLayout.PREFERRED_SIZE, 120,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(txtConfirmarSenha, 422, 422, 422)
												.addComponent(txtSenha, 422, 422, 422))))
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtNome, Alignment.TRAILING)
										.addComponent(txtCpf, Alignment.TRAILING, 422, 422, Short.MAX_VALUE))))
						.addGap(179)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(26).addComponent(lblNewLabel))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(41).addComponent(
										jLabelCadastrarAtendenteTXT, GroupLayout.PREFERRED_SIZE, 40,
										GroupLayout.PREFERRED_SIZE)))
						.addGap(45).addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(27)
						.addComponent(txtConfirmarSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(54)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(buttonCadastrar, GroupLayout.PREFERRED_SIZE, 29,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonRestaurar, GroupLayout.PREFERRED_SIZE, 29,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGap(59)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 817, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 567, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}

	private void buttonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {
		txtNome.setText("");
		txtCpf.setText("");
		txtEmail.setText("");
		txtSenha.setText("");
		txtConfirmarSenha.setText("");
	}

	@SuppressWarnings("deprecation")
	private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
		if (txtNome.getText().isEmpty() || txtEmail.getText().isEmpty() || txtCpf.getText().isEmpty()
				|| txtSenha.getText().isEmpty() || txtConfirmarSenha.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Campos vazios!");

		} else if (txtCpf.getText().length() != 14) {
			txtCpf.setText("");

			JOptionPane.showMessageDialog(null, "CPF inválido!\nSeu CPF deve conter 11 dígitos");

		} else if (Arrays.equals(txtSenha.getPassword(), txtConfirmarSenha.getPassword()) == false) {
			txtSenha.setText("");
			txtConfirmarSenha.setText("");

			JOptionPane.showMessageDialog(null, "As senhas informadas não correspondem!");

		} else {
			AtendenteController.cadastraAtendente(txtCpf.getText(), txtNome.getText(), txtEmail.getText(),
					txtSenha.getText());

			buttonRestaurarActionPerformed(evt);

			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
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
	private javax.swing.JLabel jLabelCadastrarAtendenteTXT;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField txtConfirmarSenha;
	private javax.swing.JTextField txtCpf;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtNome;
	private javax.swing.JPasswordField txtSenha;
	private JButton buttonVoltar;
	private JLabel lblNewLabel;
}
