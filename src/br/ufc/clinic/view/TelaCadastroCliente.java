
package br.ufc.clinic.view;

import java.util.Arrays;
import javax.swing.JOptionPane;

import br.ufc.clinic.view.TelaCriarConta;

public class TelaCadastroCliente extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	public TelaCadastroCliente() {
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		txtNome = new javax.swing.JTextField();
		txtCpf = new javax.swing.JTextField();
		icon = new javax.swing.JLabel();
		jLabelCadastrarClienteTXT = new javax.swing.JLabel();
		buttonRestaurar = new javax.swing.JButton();
		buttonCadastrar = new javax.swing.JButton();
		txtDataNasc = new javax.swing.JTextField();
		txtEndereco = new javax.swing.JTextField();
		txtSenha = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		txtTelefone = new javax.swing.JTextField();

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
				txtUsuarioActionPerformed(evt);
			}
		});

		txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

		// icon.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("/img/logosuperp.png"))); //
		// NOI18N

		jLabelCadastrarClienteTXT.setFont(new java.awt.Font("Code Light", 0, 24)); // NOI18N
		jLabelCadastrarClienteTXT.setForeground(new java.awt.Color(0, 0, 51));
		jLabelCadastrarClienteTXT.setText("Cadastrar cliente");

		buttonRestaurar.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		buttonRestaurar.setText("LIMPAR");
		buttonRestaurar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonRestaurarActionPerformed(evt);
			}
		});

		buttonCadastrar.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		buttonCadastrar.setText("AVANÇAR");
		buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonProximoActionPerformed(evt);
			}
		});

		txtDataNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtDataNasc.setBorder(javax.swing.BorderFactory.createTitledBorder("DATA DE NASCIMENTO"));

		txtEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("ENDEREÇO"));

		txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF ATENDENTE"));

		txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("EMAIL"));

		txtTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("TELEFONE"));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(61, 61, 61)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(11, 11, 11).addComponent(icon)
										.addGap(49, 49, 49).addComponent(jLabelCadastrarClienteTXT))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(buttonRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(60, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabelCadastrarClienteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(icon))
								.addGap(63, 63, 63)
								.addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(17, 17, 17)
								.addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50,
										Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(buttonRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(28, 28, 28)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtUsuarioActionPerformed

	}// GEN-LAST:event_txtUsuarioActionPerformed

	private void buttonProximoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonProximoActionPerformed
		// if(txtSenha.equals(txtCSenha)){
		// JOptionPane.showMessageDialog(null, "Ok!");
		// TelaLogin tl = new TelaLogin();
		// tl.setVisible(true);
		// dispose();
		// }
		if (Arrays.equals(txtSenha.getPassword(), txtCSenha.getPassword())) {
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
			TelaCriarConta TL = new TelaCriarConta();
			TL.setVisible(true);

			// }else{
			// JOptionPane.showMessageDialog(null, "Senhas não conferem!", "Atenção",
			// JOptionPane.WARNING_MESSAGE);
			// }
		} else {
			JOptionPane.showMessageDialog(null, "As suas senhas não estão iguais!");
			txtCSenha.setText("");
			txtSenha.setText("");
		}
	}// GEN-LAST:event_buttonProximoActionPerformed

	private void buttonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonRestaurarActionPerformed
		txtNome.setText("");
		txtSenha.setText("");
		txtCpf.setText("");
		txtDataNasc.setText("");
		txtCSenha.setText("");
	}// GEN-LAST:event_buttonRestaurarActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
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
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
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
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField txtDataNasc;
	private javax.swing.JTextField txtEndereco;
	private javax.swing.JTextField txtSenha;
	private javax.swing.JTextField txtTelefone;
	private javax.swing.JTextField txtCpf;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtNome;
	// End of variables declaration//GEN-END:variables
}
