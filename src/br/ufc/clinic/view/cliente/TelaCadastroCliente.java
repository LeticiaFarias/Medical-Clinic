package br.ufc.clinic.view.cliente;

import java.util.Calendar;

import javax.swing.JOptionPane;

import br.ufc.clinic.controller.ClienteController;
import br.ufc.clinic.view.atendente.TelaMenuAtendente;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaCadastroCliente extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	static JFormattedTextField formatTxtDataNasc;

	public TelaCadastroCliente() {
		initComponents();
	}

	private void initComponents() {

		icon = new javax.swing.JLabel();
	
		txtNome = new javax.swing.JTextField();
		txtCpf = new javax.swing.JTextField();
		formatTxtDataNasc = new javax.swing.JFormattedTextField();
		txtDDD = new javax.swing.JTextField();
		txtRua = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		txtTelefone = new javax.swing.JTextField();
		txtNumero = new javax.swing.JTextField();
		txtBairro = new javax.swing.JTextField();
		txtCEP = new javax.swing.JTextField();
		txtComplemento = new javax.swing.JTextField();
		txtSenha = new javax.swing.JPasswordField();
		txtConfirmarSenha = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Cadastro");
		setBackground(new java.awt.Color(255, 255, 255));
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		setResizable(false);

		jPane = new javax.swing.JPanel();
		jPane.setBackground(new java.awt.Color(255, 255, 255));
		jPane.setForeground(new java.awt.Color(255, 255, 255));


		jLabelCadastrarClienteTXT = new javax.swing.JLabel();
		jLabelCadastrarClienteTXT.setFont(new Font("Dialog", Font.BOLD, 24));
		jLabelCadastrarClienteTXT.setForeground(new java.awt.Color(0, 0, 51));
		jLabelCadastrarClienteTXT.setText("CADASTRE SEUS CLIENTES!");

		txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("NOME"));

		txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

		formatTxtDataNasc.setText((Calendar.DAY_OF_MONTH + "/" + (Calendar.MONTH) + 1) + "/" + (Calendar.YEAR));
		formatTxtDataNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		formatTxtDataNasc.setBorder(javax.swing.BorderFactory.createTitledBorder("DATA DE NASCIMENTO"));

		txtDDD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtDDD.setBorder(javax.swing.BorderFactory.createTitledBorder("DDD"));

		txtRua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtRua.setBorder(javax.swing.BorderFactory.createTitledBorder("RUA"));

		txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("EMAIL"));

		txtTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("TELEFONE"));

		txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("NÚMERO"));

		txtBairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtBairro.setBorder(javax.swing.BorderFactory.createTitledBorder("BAIRRO"));

		txtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtCEP.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP"));

		txtComplemento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtComplemento.setBorder(javax.swing.BorderFactory.createTitledBorder("COMPLEMENTO"));

		txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("SENHA"));

		txtConfirmarSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtConfirmarSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("CONFIRMAR SENHA"));

		buttonRestaurar = new javax.swing.JButton("LIMPAR");
		buttonRestaurar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonRestaurar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonRestaurarActionPerformed(evt);
			}
		});

		buttonCadastrar = new javax.swing.JButton();
		buttonCadastrar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonCadastrar.setText("CADASTRAR");
		buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonCadastrarActionPerformed(evt);
			}
		});

		buttonVoltar = new JButton("New button");
		buttonVoltar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonVoltar.setText("VOLTAR");
		buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TelaMenuAtendente telaMenuAtendente = new TelaMenuAtendente();
				telaMenuAtendente.setVisible(true);

				dispose();
			}
		});
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroCliente.class.getResource("/br/ufc/clinic/imagens/logo.png")));

		javax.swing.GroupLayout gl_jPane = new javax.swing.GroupLayout(jPane);
		gl_jPane.setHorizontalGroup(
			gl_jPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPane.createSequentialGroup()
					.addGap(61)
					.addGroup(gl_jPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPane.createSequentialGroup()
							.addGroup(gl_jPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_jPane.createSequentialGroup()
									.addGroup(gl_jPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(formatTxtDataNasc, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
										.addComponent(txtCpf, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
										.addComponent(txtNome, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
										.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
										.addGroup(gl_jPane.createSequentialGroup()
											.addComponent(txtDDD, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
											.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)))
									.addGap(58)
									.addGroup(gl_jPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtConfirmarSenha, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
										.addComponent(txtSenha, 365, 365, Short.MAX_VALUE)
										.addGroup(gl_jPane.createSequentialGroup()
											.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(txtRua, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
										.addComponent(txtBairro, 365, 365, Short.MAX_VALUE)
										.addGroup(gl_jPane.createSequentialGroup()
											.addComponent(txtCEP, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
											.addGap(18)
											.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_jPane.createSequentialGroup()
									.addComponent(buttonRestaurar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(buttonCadastrar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
							.addGap(38))
						.addGroup(gl_jPane.createSequentialGroup()
							.addGroup(gl_jPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jPane.createSequentialGroup()
									.addGap(11)
									.addComponent(icon))
								.addGroup(gl_jPane.createSequentialGroup()
									.addGap(93)
									.addComponent(lblNewLabel)
									.addGap(27)
									.addComponent(jLabelCadastrarClienteTXT)))
							.addContainerGap())))
		);
		gl_jPane.setVerticalGroup(
			gl_jPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPane.createSequentialGroup()
					.addGroup(gl_jPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPane.createSequentialGroup()
							.addGap(28)
							.addComponent(lblNewLabel)
							.addGap(16)
							.addComponent(icon))
						.addGroup(gl_jPane.createSequentialGroup()
							.addGap(39)
							.addComponent(jLabelCadastrarClienteTXT, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addGap(53)
					.addGroup(gl_jPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPane.createSequentialGroup()
							.addGroup(gl_jPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRua, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_jPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_jPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jPane.createSequentialGroup()
									.addGap(18)
									.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_jPane.createSequentialGroup()
									.addGap(17)
									.addGroup(gl_jPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jPane.createSequentialGroup()
							.addGap(158)
							.addGroup(gl_jPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDDD, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(gl_jPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(formatTxtDataNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtConfirmarSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
					.addGroup(gl_jPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonCadastrar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonRestaurar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(211))
		);
		jPane.setLayout(gl_jPane);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPane, GroupLayout.PREFERRED_SIZE, 916, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}

	@SuppressWarnings("deprecation")
	private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
		if (txtCpf.getText().isEmpty() || txtNome.getText().isEmpty() || txtEmail.getText().isEmpty()
				|| txtSenha.getText().isEmpty() || txtDDD.getText().isEmpty() || txtTelefone.getText().isEmpty()
				|| formatTxtDataNasc.getText().isEmpty() || txtNumero.getText().isEmpty() || txtRua.getText().isEmpty()
				|| txtBairro.getText().isEmpty() || txtComplemento.getText().isEmpty() || txtCEP.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Cmpos Vazios!");
		} else {
			ClienteController.cadastraCliente(txtCpf.getText(), txtNome.getText(), txtEmail.getText(),
					txtSenha.getText(), txtDDD.getText(), txtTelefone.getText(), formatTxtDataNasc.getText(),
					txtNumero.getText(), txtRua.getText(), txtBairro.getText(), txtComplemento.getText(),
					txtCEP.getText());

			buttonRestaurarActionPerformed(evt);
		}

		TelaCadastroCliente cadastroCliente = new TelaCadastroCliente();
		cadastroCliente.setVisible(true);

		dispose();
	}

	private void buttonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {
		txtNome.setText("");
		txtCpf.setText("");
		txtEmail.setText("");
		txtDDD.setText("");
		txtTelefone.setText("");
		txtNumero.setText("");
		txtRua.setText("");
		txtBairro.setText("");
		txtCEP.setText("");
		txtComplemento.setText("");
		txtSenha.setText("");
		txtConfirmarSenha.setText("");
		formatTxtDataNasc.setText("");

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
			java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaCadastroCliente().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonCadastrar;
	private javax.swing.JButton buttonRestaurar;
	private javax.swing.JLabel icon;
	private javax.swing.JLabel jLabelCadastrarClienteTXT;
	private javax.swing.JPanel jPane;
	private javax.swing.JTextField txtDDD;
	private javax.swing.JTextField txtRua;
	private javax.swing.JTextField txtTelefone;
	private javax.swing.JTextField txtCpf;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtNome;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtCEP;
	private JTextField txtComplemento;
	private JPasswordField txtSenha;
	private JPasswordField txtConfirmarSenha;
	private JButton buttonVoltar;
	private JLabel lblNewLabel;
}
