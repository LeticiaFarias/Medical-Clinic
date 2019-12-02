
package br.ufc.clinic.view;

import java.util.Arrays;
import javax.swing.JOptionPane;

import br.ufc.clinic.view.TelaCriarConta;

public class TelaCadastroMedico extends javax.swing.JFrame {

	public TelaCadastroMedico() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		icon = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		buttonRestaurar = new javax.swing.JButton();
		buttonProximo = new javax.swing.JButton();
		txtData = new javax.swing.JTextField();
		txtSenha = new javax.swing.JPasswordField();
		txtCSenha = new javax.swing.JPasswordField();
		txtData1 = new javax.swing.JTextField();
		txtData2 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Cadastro");
		setBackground(new java.awt.Color(255, 255, 255));
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		setResizable(false);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setForeground(new java.awt.Color(255, 255, 255));

		//icon.setIcon(new
		//javax.swing.ImageIcon(getClass().getResource("/img/logosuperp.png"))); //
		// NOI18N

		jLabel1.setFont(new java.awt.Font("Code Light", 0, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 0, 51));
		jLabel1.setText("Cadastrar medico");

		txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

		txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("NOME"));
		txtNome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNomeActionPerformed(evt);
			}
		});

		buttonRestaurar.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		buttonRestaurar.setText("LIMPAR");
		buttonRestaurar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonRestaurarActionPerformed(evt);
			}
		});

		buttonProximo.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		buttonProximo.setText("AVANÇAR");
		buttonProximo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonProximoActionPerformed(evt);
			}
		});

		txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtData.setBorder(javax.swing.BorderFactory.createTitledBorder("ESPECIALIDADE"));

		txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("SENHA"));
		txtSenha.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtSenhaActionPerformed(evt);
			}
		});

		txtCSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtCSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("CONFIRMAR SENHA"));
		txtCSenha.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtCSenhaActionPerformed(evt);
			}
		});

		txtData1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtData1.setBorder(javax.swing.BorderFactory.createTitledBorder("EMAIL"));

		txtData2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		txtData2.setBorder(javax.swing.BorderFactory.createTitledBorder("CRM"));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(61, 61, 61)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(11, 11, 11).addComponent(icon)
										.addGap(49, 49, 49).addComponent(jLabel1))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(buttonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 394,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(buttonRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(60, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(icon))
								.addGap(63, 63, 63)
								.addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtCSenha, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37,
										Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(buttonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(buttonRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(28, 28, 28)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeActionPerformed
		
	}// GEN-LAST:event_txtNomeActionPerformed

	private void txtCSenhaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCSenhaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtCSenhaActionPerformed

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
			// JOptionPane.showMessageDialog(null, "Senhas não conferem!",
			// "Atenção",txtCpf.WARNING_MESSAGE);
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
		txtData.setText("");
		txtCSenha.setText("");
	}// GEN-LAST:event_buttonRestaurarActionPerformed

	private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSenhaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtSenhaActionPerformed

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
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				// txtCpf new TelaLogin().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonProximo;
	private javax.swing.JButton buttonRestaurar;
	private javax.swing.JLabel icon;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField txtCSenha;
	private javax.swing.JTextField txtCpf;
	private javax.swing.JTextField txtData;
	private javax.swing.JTextField txtData1;
	private javax.swing.JTextField txtData2;
	private javax.swing.JTextField txtNome;
	private javax.swing.JPasswordField txtSenha;
	// End of variables declaration//GEN-END:variables
}
