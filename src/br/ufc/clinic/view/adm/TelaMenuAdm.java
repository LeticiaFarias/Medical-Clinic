package br.ufc.clinic.view.adm;

import br.ufc.clinic.view.atendente.TelaCadastroAtedente;
import br.ufc.clinic.view.telasIniciais.TelaLogin;

public class TelaMenuAdm extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	public TelaMenuAdm() {
		initComponents();
	}

	private void initComponents() {

		jLabelMenuAMtxt = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jButtonPesquisar = new javax.swing.JButton();
		jButtonConfiguracoes = new javax.swing.JButton();
		jButtonCadastrarAtendente = new javax.swing.JButton();
		jButtonSair = new javax.swing.JButton();

		jLabel1.setFont(new java.awt.Font("Code Light", 0, 24));
		jLabel1.setForeground(new java.awt.Color(0, 0, 51));
		jLabel1.setText("Cadastrar medico");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Acesso");
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setToolTipText("Acesso");

		// jLabel4.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("/img/logosuperp.png")));

		jLabelMenuAMtxt.setFont(new java.awt.Font("Code Light", 0, 24));
		jLabelMenuAMtxt.setForeground(new java.awt.Color(0, 0, 51));
		jLabelMenuAMtxt.setText("menu ADM");

		jButtonPesquisar.setBackground(new java.awt.Color(255, 255, 255));
		jButtonPesquisar.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonPesquisar.setText("PESQUISAR");
		jButtonPesquisar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonPesquisarActionPerformed(evt);
			}
		});

		jButtonConfiguracoes.setBackground(new java.awt.Color(255, 255, 255));
		jButtonConfiguracoes.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonConfiguracoes.setText("ALT INFORMAÇÕES");
		jButtonConfiguracoes.setActionCommand("ALTERAR INF PESSOAIS");
		jButtonConfiguracoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonConfiguracoesActionPerformed(evt);
			}
		});

		jButtonCadastrarAtendente.setBackground(new java.awt.Color(255, 255, 255));
		jButtonCadastrarAtendente.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonCadastrarAtendente.setText("CADASTRAR ATENDENTE");
		jButtonCadastrarAtendente.setActionCommand("");
		jButtonCadastrarAtendente
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonCadastrarAtendente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCadastrarAtendenteActionPerformed(evt);
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

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(75, 75, 75).addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
						.addComponent(jLabelMenuAMtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 218,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(50, 50, 50))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(92, 92, 92)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jButtonCadastrarAtendente,
												javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 143,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonSair, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 143,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(72, 72, 72)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(jLabel4,
								javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(49, 49, 49).addComponent(jLabelMenuAMtxt,
								javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(37, 37, 37)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButtonConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonCadastrarAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(41, 41, 41)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(82, Short.MAX_VALUE)));

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

	private void jButtonConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButtonCadastrarAtendenteActionPerformed(java.awt.event.ActionEvent evt) {
		TelaCadastroAtedente telaCadastroAtedente = new TelaCadastroAtedente();
		telaCadastroAtedente.setVisible(true);
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
			java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaMenuAdm().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonPesquisar;
	private javax.swing.JButton jButtonConfiguracoes;
	private javax.swing.JButton jButtonCadastrarAtendente;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabelMenuAMtxt;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables
}
