package br.ufc.clinic.view.atendente;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.ufc.clinic.view.agenda.TelaAgenda;
import br.ufc.clinic.view.cliente.TelaCadastroCliente;
import br.ufc.clinic.view.medico.TelaCadastroMedico;
import br.ufc.clinic.view.telasIniciais.TelaLogin;

public class TelaMenuAtendente extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	public TelaMenuAtendente() {
		initComponents();
	}

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
		jButtonPesquisarCliente.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonPesquisarCliente.setText("PESQUISAR cliente");
		jButtonPesquisarCliente
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Code Light", 0, 24));
		jLabel2.setForeground(new java.awt.Color(0, 0, 51));
		jLabel2.setText("menu Atendente");

		jButtonCadastrarMedico.setBackground(new java.awt.Color(255, 255, 255));
		jButtonCadastrarMedico.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonCadastrarMedico.setText(" cadastrar medico");
		jButtonCadastrarMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonCadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCadastrarMedicoActionPerformed(evt);
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

		jButton5.setBackground(new java.awt.Color(255, 255, 255));
		jButton5.setFont(new java.awt.Font("Code Light", 0, 11));
		jButton5.setText("SAIR");
		jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TelaLogin telaLogin = new TelaLogin();
				telaLogin.setVisible(true);

				dispose();
			}
		});

		jButtonPesquisarMedico.setBackground(new java.awt.Color(255, 255, 255));
		jButtonPesquisarMedico.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonPesquisarMedico.setText("PESQUISAR medico");
		jButtonPesquisarMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonPesquisarMedico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButtonCadastrarCliente.setBackground(new java.awt.Color(255, 255, 255));
		jButtonCadastrarCliente.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonCadastrarCliente.setText("CADASTRAR cliente");
		jButtonCadastrarCliente
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCadastrarClienteActionPerformed(evt);
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

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		TelaCadastroAtedente tc = new TelaCadastroAtedente();
		tc.setVisible(true);
	}

	private void jButtonCadastrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {
		TelaCadastroMedico telaCadastroMedico = new TelaCadastroMedico();
		telaCadastroMedico.setVisible(true);
	}

	private void jButtonCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {
		TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
		telaCadastroCliente.setVisible(true);

		dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {
		TelaAgenda telaAgenda = new TelaAgenda();
		telaAgenda.setVisible(true);
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

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
