package br.ufc.clinic.view;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TelaMenuAtendente extends javax.swing.JFrame {
	public TelaMenuAtendente() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jPanelSair = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jButtonPesquisarCliente = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jButtonCadastrarMedico = new javax.swing.JButton();
		jButtonAgenda = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButtonPesquisarMedico = new javax.swing.JButton();
		jButtonCadastrarCliente = new javax.swing.JButton();

		jLabel1.setFont(new java.awt.Font("Code Light", 0, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 0, 51));
		jLabel1.setText("Cadastrar medico");

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButton3.setText("CRIAR CONTA");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Acesso");
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		jPanelSair.setBackground(new java.awt.Color(255, 255, 255));
		jPanelSair.setToolTipText("Acesso");

		// jLabel4.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("/img/logosuperp.png"))); //
		// NOI18N

		jButtonPesquisarCliente.setBackground(new java.awt.Color(255, 255, 255));
		jButtonPesquisarCliente.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButtonPesquisarCliente.setText("PESQUISAR cliente");
		jButtonPesquisarCliente
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Code Light", 0, 24)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(0, 0, 51));
		jLabel2.setText("menu Atendente");

		jButtonCadastrarMedico.setBackground(new java.awt.Color(255, 255, 255));
		jButtonCadastrarMedico.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButtonCadastrarMedico.setText(" cadastrar medico");
		jButtonCadastrarMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonCadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButtonAgenda.setBackground(new java.awt.Color(255, 255, 255));
		jButtonAgenda.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButtonAgenda.setText("AGENDA");
		jButtonAgenda.setActionCommand("");
		jButtonAgenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setBackground(new java.awt.Color(255, 255, 255));
		jButton5.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButton5.setText("SAIR");
		jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButtonPesquisarMedico.setBackground(new java.awt.Color(255, 255, 255));
		jButtonPesquisarMedico.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButtonPesquisarMedico.setText("PESQUISAR medico");
		jButtonPesquisarMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonPesquisarMedico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButtonCadastrarCliente.setBackground(new java.awt.Color(255, 255, 255));
		jButtonCadastrarCliente.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButtonCadastrarCliente.setText("CADASTRAR cliente");
		jButtonCadastrarCliente
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout gl_jPanelSair = new javax.swing.GroupLayout(jPanelSair);
		gl_jPanelSair.setHorizontalGroup(
				gl_jPanelSair.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								Alignment.LEADING,
								gl_jPanelSair
										.createSequentialGroup().addGap(75).addComponent(jLabel4).addGap(55)
										.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 218,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(132, Short.MAX_VALUE))
						.addGroup(gl_jPanelSair.createSequentialGroup().addGap(92)
								.addGroup(gl_jPanelSair.createParallelGroup(Alignment.TRAILING)
										.addComponent(jButtonPesquisarMedico, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonCadastrarMedico, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonAgenda, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
								.addGroup(gl_jPanelSair.createParallelGroup(Alignment.LEADING)
										.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonPesquisarCliente, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonCadastrarCliente, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE))
								.addGap(98)));
		gl_jPanelSair.setVerticalGroup(gl_jPanelSair.createParallelGroup(Alignment.LEADING).addGroup(gl_jPanelSair
				.createSequentialGroup()
				.addGroup(gl_jPanelSair.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanelSair.createSequentialGroup().addGap(19).addComponent(jLabel4,
								GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jPanelSair.createSequentialGroup().addGap(46)
								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
				.addGap(37)
				.addGroup(gl_jPanelSair.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButtonCadastrarMedico, GroupLayout.PREFERRED_SIZE, 31,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonCadastrarCliente, GroupLayout.PREFERRED_SIZE, 31,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_jPanelSair.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButtonPesquisarMedico, GroupLayout.PREFERRED_SIZE, 31,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonPesquisarCliente, GroupLayout.PREFERRED_SIZE, 31,
								GroupLayout.PREFERRED_SIZE))
				.addGap(28).addComponent(jButtonAgenda, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
				.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE).addGap(61)));
		jPanelSair.setLayout(gl_jPanelSair);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanelSair,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		TelaCadastroAtedente tc = new TelaCadastroAtedente();
		tc.setVisible(true);
		dispose();
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		dispose();
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton6ActionPerformed

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton7ActionPerformed

	public static void main(String args[]) {
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
			java.util.logging.Logger.getLogger(TelaMenuAtendente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaMenuAtendente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaMenuAtendente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaMenuAtendente.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaMenuAtendente().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonPesquisarCliente;
	private javax.swing.JButton jButtonCadastrarMedico;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButtonAgenda;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButtonPesquisarMedico;
	private javax.swing.JButton jButtonCadastrarCliente;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanelSair;
	// End of variables declaration//GEN-END:variables
}
