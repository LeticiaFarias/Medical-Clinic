package br.ufc.clinic.view.cliente;

import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.ufc.clinic.controller.AtendenteController;
import br.ufc.clinic.model.Atendente;

public class TelaAlterarInfCliente extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	public TelaAlterarInfCliente() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		txtNome = new javax.swing.JTextField();
		txtCpf = new javax.swing.JTextField();
		icon = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		JButton ButtonVoltar = new JButton();
		buttonRestaurar = new javax.swing.JButton();
		buttonProximo = new javax.swing.JButton();
		txtDataNasc = new javax.swing.JTextField();
		txtRua = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		txtTelefone = new javax.swing.JTextField();
		textDDD = new javax.swing.JTextField();
		textNumero = new javax.swing.JTextField();
		textBairro = new javax.swing.JTextField();
		txtCep = new javax.swing.JTextField();
		textComplemento = new javax.swing.JTextField();
		passFieldSenha = new JPasswordField();
		passFieldConfirmarSenha = new JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Cadastro");
		setBackground(new java.awt.Color(255, 255, 255));
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		setResizable(false);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("NOME"));
		txtNome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtUsuarioAlteraNomectionPerformed(evt);
			}
		});

		txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

		// icon.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("/img/logosuperp.png")));

		jLabel1.setFont(new java.awt.Font("Code Light", 0, 24));
		jLabel1.setForeground(new java.awt.Color(0, 0, 51));
		jLabel1.setText("ALTERAR INFORMAÇÕES");

		ButtonVoltar.setFont(new java.awt.Font("Code Light", 0, 11));
		ButtonVoltar.setText("VOLTAR");

		buttonRestaurar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonRestaurar.setText("LIMPAR");
		buttonRestaurar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonRestaurarActionPerformed(evt);
			}
		});

		buttonProximo.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonProximo.setText("AVANÇAR");
		buttonProximo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonProximoActionPerformed(evt);
			}
		});

		txtDataNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtDataNasc.setBorder(javax.swing.BorderFactory.createTitledBorder("DATA DE NASCIMENTO"));

		txtRua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtRua.setBorder(javax.swing.BorderFactory.createTitledBorder("ENDEREÇO"));

		txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("EMAIL"));

		txtTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("TELEFONE"));

		textDDD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		textDDD.setBorder(javax.swing.BorderFactory.createTitledBorder("DDD"));

		textNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		textNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("NÚMERO"));

		textBairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		textBairro.setBorder(javax.swing.BorderFactory.createTitledBorder("BAIRRO"));

		txtCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtCep.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP"));

		textComplemento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		textComplemento.setBorder(javax.swing.BorderFactory.createTitledBorder("COMPLEMENTO"));

		passFieldSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		passFieldSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("SENHA"));

		passFieldConfirmarSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		passFieldConfirmarSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("CONFIRMAR SENHA"));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(61)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(txtDataNasc, GroupLayout.PREFERRED_SIZE, 394,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(
										jPanel1Layout
												.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
														.createSequentialGroup()
														.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 394,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED))
												.addGroup(jPanel1Layout
														.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
																.createSequentialGroup().addComponent(
																		txtCpf, GroupLayout.PREFERRED_SIZE, 394,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED))
														.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGroup(jPanel1Layout
																				.createParallelGroup(Alignment.LEADING)
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(textDDD,
																								GroupLayout.PREFERRED_SIZE,
																								93,
																								GroupLayout.PREFERRED_SIZE)
																						.addGap(18)
																						.addComponent(txtTelefone,
																								GroupLayout.PREFERRED_SIZE,
																								287,
																								GroupLayout.PREFERRED_SIZE))
																				.addGroup(jPanel1Layout
																						.createSequentialGroup()
																						.addGap(11).addComponent(icon)
																						.addPreferredGap(
																								ComponentPlacement.RELATED,
																								104, Short.MAX_VALUE)
																						.addComponent(jLabel1)))
																		.addGap(49))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(txtNome,
																				GroupLayout.PREFERRED_SIZE, 394,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED))))))
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel1Layout
								.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ButtonVoltar, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(buttonRestaurar, GroupLayout.PREFERRED_SIZE, 120,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(buttonProximo, GroupLayout.PREFERRED_SIZE, 120,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textNumero, GroupLayout.PREFERRED_SIZE, 102,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(txtRua,
														GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
										.addComponent(textBairro, 394, 394, 394)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(txtCep, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
												.addGap(18).addComponent(textComplemento, GroupLayout.PREFERRED_SIZE,
														255, GroupLayout.PREFERRED_SIZE))
										.addComponent(passFieldSenha, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
										.addComponent(passFieldConfirmarSenha, GroupLayout.DEFAULT_SIZE, 394,
												Short.MAX_VALUE)))
						.addGap(40)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(21)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(icon)
								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGap(61)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtRua, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(textNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGap(17)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(textComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(jPanel1Layout
								.createParallelGroup(Alignment.BASELINE)
								.addComponent(passFieldSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDataNasc, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
								.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textDDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 36,
												GroupLayout.PREFERRED_SIZE))
								.addGap(84)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(buttonProximo, GroupLayout.PREFERRED_SIZE, 29,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(buttonRestaurar, GroupLayout.PREFERRED_SIZE, 29,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(ButtonVoltar, GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE)))
								.addComponent(passFieldConfirmarSenha, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(30, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 954, GroupLayout.PREFERRED_SIZE)
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

	private void txtUsuarioAlteraNomectionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	private void buttonProximoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonProximoActionPerformed

	}

	private void buttonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonRestaurarActionPerformed
		txtNome.setText("");
		txtCpf.setText("");
		txtDataNasc.setText("");
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
			java.util.logging.Logger.getLogger(TelaAlterarInfCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaAlterarInfCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaAlterarInfCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaAlterarInfCliente.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaAlterarInfCliente().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonProximo;
	private javax.swing.JButton buttonRestaurar;
	private javax.swing.JLabel icon;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField txtDataNasc;
	private javax.swing.JTextField txtRua;
	private javax.swing.JTextField txtTelefone;
	private javax.swing.JTextField txtCpf;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtNome;
	private JTextField textDDD;
	private JTextField textNumero;
	private JTextField textBairro;
	private JTextField txtCep;
	private JTextField textComplemento;
	private JPasswordField passFieldSenha;
	private JPasswordField passFieldConfirmarSenha;
}
