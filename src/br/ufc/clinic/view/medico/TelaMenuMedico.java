package br.ufc.clinic.view.medico;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.ufc.clinic.view.telasIniciais.TelaLogin;

import javax.swing.GroupLayout;
import javax.swing.JButton;

public class TelaMenuMedico extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	public TelaMenuMedico() {
		initComponents();
	}

	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabelMenuMedicoTXT = new javax.swing.JLabel();
		jButtonPesquisar = new javax.swing.JButton();
		jButtonAgenda = new javax.swing.JButton();
		jButtonSair = new javax.swing.JButton();
		jButtonConfiguracoes = new javax.swing.JButton();

		jLabel1.setFont(new java.awt.Font("Code Light", 0, 24));
		jLabel1.setForeground(new java.awt.Color(0, 0, 51));
		jLabel1.setText("Cadastrar medico");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Acesso");
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setToolTipText("Acesso");

		// jLabel4.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("/img/logosuperp.png"))); //
		// NOI18N

		jLabelMenuMedicoTXT.setFont(new java.awt.Font("Code Light", 0, 24));
		jLabelMenuMedicoTXT.setForeground(new java.awt.Color(0, 0, 51));
		jLabelMenuMedicoTXT.setText("menu medico");

		jButtonPesquisar.setBackground(new java.awt.Color(255, 255, 255));
		jButtonPesquisar.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonPesquisar.setText("PESQUISAR");
		jButtonPesquisar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonPesquisarActionPerformed(evt);
			}
		});

		jButtonAgenda.setBackground(new java.awt.Color(255, 255, 255));
		jButtonAgenda.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonAgenda.setText("AGENDA");
		jButtonAgenda.setActionCommand("");
		jButtonAgenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAgendaActionPerformed(evt);
			}
		});

		jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
		jButtonSair.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonSair.setText("SAIR");
		jButtonSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TelaLogin telaLogin = new TelaLogin();

				telaLogin.setVisible(true);
				dispose();
			}
		});

		jButtonConfiguracoes.setBackground(new java.awt.Color(255, 255, 255));
		jButtonConfiguracoes.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonConfiguracoes.setText("Informações Pessoais");
		jButtonConfiguracoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonConfiguracoesActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								jPanel1Layout.createSequentialGroup().addGap(75).addComponent(jLabel4)
										.addPreferredGap(ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
										.addComponent(jLabelMenuMedicoTXT, GroupLayout.PREFERRED_SIZE, 218,
												GroupLayout.PREFERRED_SIZE)
										.addGap(50))
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(105, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false).addGroup(
										jPanel1Layout.createSequentialGroup().addComponent(jButtonConfiguracoes)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 120,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jButtonPesquisar, GroupLayout.PREFERRED_SIZE, 120,
														GroupLayout.PREFERRED_SIZE)
												.addGap(48).addComponent(jButtonAgenda, GroupLayout.PREFERRED_SIZE, 120,
														GroupLayout.PREFERRED_SIZE)))
								.addGap(95)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(19).addComponent(jLabel4,
								GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(49).addComponent(jLabelMenuMedicoTXT,
								GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
				.addGap(37)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButtonAgenda, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonPesquisar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addGap(41)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonConfiguracoes, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(82, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}

	private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButtonConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {

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
			java.util.logging.Logger.getLogger(TelaMenuMedico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaMenuMedico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaMenuMedico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaMenuMedico.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaMenuMedico().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonPesquisar;
	private javax.swing.JButton jButtonAgenda;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabelMenuMedicoTXT;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private JButton jButtonConfiguracoes;
}
