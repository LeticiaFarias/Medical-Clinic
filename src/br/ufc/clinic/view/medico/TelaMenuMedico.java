package br.ufc.clinic.view.medico;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

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
		jButtonConfiguracoes = new javax.swing.JButton();

		jLabel1.setFont(new java.awt.Font("Code Light", 0, 24));
		jLabel1.setForeground(new java.awt.Color(0, 0, 51));
		jLabel1.setText("Cadastrar medico");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Acesso");
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setToolTipText("Acesso");

		jLabelMenuMedicoTXT.setFont(new Font("Dialog", Font.BOLD, 24));
		jLabelMenuMedicoTXT.setForeground(new java.awt.Color(0, 0, 51));
		jLabelMenuMedicoTXT.setText("BEM VINDO MÉDICO(A)!");

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

		jButtonConfiguracoes.setBackground(new java.awt.Color(255, 255, 255));
		jButtonConfiguracoes.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonConfiguracoes.setText("INFORMAÇÕES PESSOAIS");
		jButtonConfiguracoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonConfiguracoesActionPerformed(evt);
			}
		});

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaMenuMedico.class.getResource("/br/ufc/clinic/imagens/logo.png")));

		btnSair = new JButton("SAIR");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(77).addComponent(lblNewLabel).addGap(18)
								.addComponent(jLabelMenuMedicoTXT))
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(65).addComponent(
										jButtonPesquisar, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(51).addComponent(
										jButtonConfiguracoes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)))
								.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup()
														.addComponent(jButtonAgenda, GroupLayout.PREFERRED_SIZE, 270,
																GroupLayout.PREFERRED_SIZE)
														.addGap(76))
										.addGroup(Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup()
														.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 98,
																GroupLayout.PREFERRED_SIZE)
														.addGap(166)))))
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(jLabel4)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(58).addComponent(jLabel4,
								GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(31)
												.addComponent(lblNewLabel).addGap(43)
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(jButtonPesquisar, GroupLayout.PREFERRED_SIZE, 117,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jButtonAgenda, GroupLayout.PREFERRED_SIZE, 118,
																GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel1Layout
												.createSequentialGroup().addGap(44).addComponent(jLabelMenuMedicoTXT,
														GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
								.addGap(45)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jButtonConfiguracoes, GroupLayout.PREFERRED_SIZE, 98,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnSair))))
				.addContainerGap(74, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 774, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

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
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabelMenuMedicoTXT;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private JButton jButtonConfiguracoes;
	private JLabel lblNewLabel;
	private JButton btnSair;
}
