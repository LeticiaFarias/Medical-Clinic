package br.ufc.clinic.view;

import java.util.Arrays;
import javax.swing.JOptionPane;

import br.ufc.clinic.controller.MedicoController;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class TelaCadastroMedico extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	public TelaCadastroMedico() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		icon = new javax.swing.JLabel();
		jLabelCadastraMedicoTXT = new javax.swing.JLabel();
		buttonVoltar = new javax.swing.JButton();
		buttonRestaurar = new javax.swing.JButton();
		buttonCadastrar = new javax.swing.JButton();
		txtCpf = new javax.swing.JTextField();
		txtNome = new javax.swing.JTextField();
		txtSenha = new javax.swing.JPasswordField();
		txtConfirmarSenha = new javax.swing.JPasswordField();
		txtEspecialidade = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		txtCrm = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Cadastro");
		setBackground(new java.awt.Color(255, 255, 255));
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		setResizable(false);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		// icon.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("/img/logosuperp.png"))); //
		// NOI18N

		jLabelCadastraMedicoTXT.setFont(new java.awt.Font("Code Light", 0, 24));
		jLabelCadastraMedicoTXT.setForeground(new java.awt.Color(0, 0, 51));
		jLabelCadastraMedicoTXT.setText("Cadastrar medico");

		txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("NOME"));

		txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

		txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("EMAIL"));

		txtCrm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtCrm.setBorder(javax.swing.BorderFactory.createTitledBorder("CRM"));

		txtEspecialidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtEspecialidade.setBorder(javax.swing.BorderFactory.createTitledBorder("ESPECIALIDADE"));

		txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("SENHA"));

		txtConfirmarSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtConfirmarSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("CONFIRMAR SENHA"));

		buttonRestaurar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonRestaurar.setText("LIMPAR");
		buttonRestaurar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonRestaurarActionPerformed(evt);
			}
		});

		buttonCadastrar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonCadastrar.setText("AVANÇAR");
		buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonCadastrarActionPerformed(evt);
			}
		});

		buttonVoltar.setFont(new java.awt.Font("Code Light", 0, 11));
		buttonVoltar.setText("VOLTAR");
		buttonVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonVoltarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(61)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(11).addComponent(icon).addGap(49)
								.addComponent(jLabelCadastraMedicoTXT))
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEspecialidade, GroupLayout.PREFERRED_SIZE, 394,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtConfirmarSenha, GroupLayout.PREFERRED_SIZE, 394,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(buttonRestaurar, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(buttonCadastrar,
												GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCrm, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(60, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(19)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jLabelCadastraMedicoTXT, GroupLayout.PREFERRED_SIZE, 40,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(icon))
				.addGap(63).addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(txtCrm, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(txtEspecialidade, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(txtConfirmarSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonCadastrar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonVoltar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonRestaurar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGap(28)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}

	private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
		TelaCriarConta telaCriarConta = new TelaCriarConta();
		telaCriarConta.setVisible(true);

		dispose();
	}

	private void buttonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {
		txtNome.setText("");
		txtCpf.setText("");
		txtEmail.setText("");
		txtCrm.setText("");
		txtEspecialidade.setText("");
		txtSenha.setText("");
		txtConfirmarSenha.setText("");
	}

	@SuppressWarnings("deprecation")
	private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
		if (txtNome.getText().isEmpty() || txtCpf.getText().isEmpty() || txtEmail.getText().isEmpty()
				|| txtCrm.getText().isEmpty() || txtEspecialidade.getText().isEmpty() || txtSenha.getText().isEmpty()
				|| txtConfirmarSenha.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Campos vazios!");

		} else if (txtCpf.getText().length() != 14) {
			txtCpf.setText("");

			JOptionPane.showMessageDialog(null, "CPF inválido!\nSeu CPF deve conter 11 números.");

		} else if (Arrays.equals(txtSenha.getPassword(), txtConfirmarSenha.getPassword()) == false) {
			txtSenha.setText("");
			txtConfirmarSenha.setText("");

			JOptionPane.showMessageDialog(null, "As senhas informadas não correspondem!");

		} else {
			MedicoController.cadastraMedico(txtCrm.getText(), txtNome.getText(), txtEmail.getText(), txtSenha.getText(),
					txtEspecialidade.getText());

			buttonRestaurarActionPerformed(evt);

			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

			TelaMenuMedico telaMenuMedico = new TelaMenuMedico();
			telaMenuMedico.setVisible(true);

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
			java.util.logging.Logger.getLogger(TelaCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaCadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonCadastrar;
	private javax.swing.JButton buttonRestaurar;
	private javax.swing.JLabel icon;
	private javax.swing.JLabel jLabelCadastraMedicoTXT;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField txtConfirmarSenha;
	private javax.swing.JTextField txtCpf;
	private javax.swing.JTextField txtEspecialidade;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtCrm;
	private javax.swing.JTextField txtNome;
	private javax.swing.JPasswordField txtSenha;
	private JButton buttonVoltar;
	// End of variables declaration//GEN-END:variables
}
