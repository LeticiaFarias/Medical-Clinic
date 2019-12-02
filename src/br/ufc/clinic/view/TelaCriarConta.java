package br.ufc.clinic.view;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

public class TelaCriarConta extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public TelaCriarConta() {
		initComponents();
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jLabelCriarContaTXT = new javax.swing.JLabel();
		
		jButton3 = new javax.swing.JButton();
		jButtonMedico = new javax.swing.JButton();
		jButtonADM = new javax.swing.JButton();
		jButtonAtendente = new javax.swing.JButton();
		jButtonSair = new javax.swing.JButton();

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

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setToolTipText("Acesso");

		// jLabel4.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("/img/logosuperp.png"))); //
		// NOI18N

		jButtonADM.setBackground(new java.awt.Color(255, 255, 255));
		jButtonADM.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButtonADM.setText("ADM");
		jButtonADM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonADM.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonADMActionPerformed(evt);
			}
		});

		jLabelCriarContaTXT.setFont(new java.awt.Font("Code Light", 0, 24)); // NOI18N
		jLabelCriarContaTXT.setForeground(new java.awt.Color(0, 0, 51));
		jLabelCriarContaTXT.setText("menu criar conta");

		jButtonMedico.setBackground(new java.awt.Color(255, 255, 255));
		jButtonMedico.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButtonMedico.setText("MEDICO");
		jButtonMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonMedico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonMedicoActionPerformed(evt);
			}
		});

		jButtonAtendente.setBackground(new java.awt.Color(255, 255, 255));
		jButtonAtendente.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButtonAtendente.setText("ATENDENTE");
		jButtonAtendente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonAtendente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAtendenteActionPerformed(evt);
			}
		});

		jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
		jButtonSair.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButtonSair.setText("SAIR");
		jButtonSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(35)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(38)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jButtonADM, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonMedico, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE))
								.addGap(42)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonAtendente, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel4).addGap(70).addComponent(
								jLabelCriarContaTXT, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(54, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(19).addComponent(jLabel4,
								GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(31).addComponent(jLabelCriarContaTXT,
								GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
				.addGap(27)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButtonAtendente, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonMedico, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addGap(27)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButtonADM, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(75, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
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

	private void jButtonADMActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	private void jButtonAtendenteActionPerformed(java.awt.event.ActionEvent evt) {
		TelaCadastroAtedente telaCadastroAtendente = new TelaCadastroAtedente();
		telaCadastroAtendente.setVisible(true);
		dispose();
	}

	private void jButtonMedicoActionPerformed(java.awt.event.ActionEvent evt) {
		TelaCadastroMedico telaCadastroMedico = new TelaCadastroMedico();
		telaCadastroMedico.setVisible(true);
		dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
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
			java.util.logging.Logger.getLogger(TelaCriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaCriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaCriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaCriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaCriarConta().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonADM;
	private javax.swing.JButton jButtonMedico;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButtonAtendente;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabelCriarContaTXT;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables
}
