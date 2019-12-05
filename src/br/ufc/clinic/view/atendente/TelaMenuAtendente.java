package br.ufc.clinic.view.atendente;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.ufc.clinic.view.agenda.TelaAgenda;
import br.ufc.clinic.view.cliente.TelaCadastroCliente;
import br.ufc.clinic.view.medico.TelaCadastroMedico;
import br.ufc.clinic.view.telasIniciais.TelaLogin;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaMenuAtendente extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	public TelaMenuAtendente() {
		initComponents();
	}

	private void initComponents() {

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Acesso");
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		jPanelSair = new javax.swing.JPanel();
		jPanelSair.setBackground(new java.awt.Color(255, 255, 255));
		jPanelSair.setToolTipText("I9Life");

		jLabel1 = new javax.swing.JLabel();
		jLabel1.setFont(new java.awt.Font("Code Light", 0, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 0, 51));
		jLabel1.setText("Cadastrar medico");

		jLabel2 = new javax.swing.JLabel("BEM VINDO ATENDENTE!");
		jLabel2.setFont(new Font("Dialog", Font.BOLD, 24));
		jLabel2.setForeground(new java.awt.Color(0, 0, 51));

		lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(TelaMenuAtendente.class.getResource("/br/ufc/clinic/imagens/logo.png")));

		jButtonPesquisarUsuarios = new javax.swing.JButton("PESQUISAR USUÁRIOS");
		jButtonPesquisarUsuarios
				.setIcon(new ImageIcon(TelaMenuAtendente.class.getResource("/br/ufc/clinic/imagens/PesquisarP.png")));
		jButtonPesquisarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
		jButtonPesquisarUsuarios.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonPesquisarUsuarios
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonPesquisarUsuarios.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonPesquisarUsuariosActionPerformed(evt);
			}
		});

		jButtonCadastrarMedico = new javax.swing.JButton("CADASTRAR MÉDICO");
		jButtonCadastrarMedico
				.setIcon(new ImageIcon(TelaMenuAtendente.class.getResource("/br/ufc/clinic/imagens/medicoP.png")));
		jButtonCadastrarMedico.setBackground(new java.awt.Color(255, 255, 255));
		jButtonCadastrarMedico.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonCadastrarMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonCadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCadastrarMedicoActionPerformed(evt);
			}
		});

		jButtonAgenda = new javax.swing.JButton("   AGENDA");
		jButtonAgenda.setIcon(new ImageIcon(TelaMenuAtendente.class.getResource("/br/ufc/clinic/imagens/agendaP.png")));
		jButtonAgenda.setBackground(new java.awt.Color(255, 255, 255));
		jButtonAgenda.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonAgenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAgendaActionPerformed(evt);
			}
		});

		jButtonSair = new javax.swing.JButton("SAIR");
		jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
		jButtonSair.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TelaLogin telaLogin = new TelaLogin();
				telaLogin.setVisible(true);

				dispose();
			}
		});

		jButtonInfoPessoais = new javax.swing.JButton("INFORMAÇÕES PESSOAIS");
		jButtonInfoPessoais.setIcon(
				new ImageIcon(TelaMenuAtendente.class.getResource("/br/ufc/clinic/imagens/infoPessoaisP.png")));
		jButtonInfoPessoais.setBackground(new java.awt.Color(255, 255, 255));
		jButtonInfoPessoais.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonInfoPessoais.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonInfoPessoais.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonInformacoesPessoaisActionPerformed(evt);
			}
		});

		jButtonCadastrarCliente = new javax.swing.JButton("CADASTRAR CLIENTE");
		jButtonCadastrarCliente
				.setIcon(new ImageIcon(TelaMenuAtendente.class.getResource("/br/ufc/clinic/imagens/cadastroP.png")));
		jButtonCadastrarCliente.setBackground(new java.awt.Color(255, 255, 255));
		jButtonCadastrarCliente.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonCadastrarCliente
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCadastrarClienteActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout gl_jPanelSair = new javax.swing.GroupLayout(jPanelSair);
		gl_jPanelSair.setHorizontalGroup(gl_jPanelSair.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanelSair
						.createSequentialGroup().addGap(
								165)
						.addGroup(gl_jPanelSair.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jPanelSair
										.createSequentialGroup()
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 248,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 353,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_jPanelSair.createSequentialGroup()
										.addGroup(gl_jPanelSair.createParallelGroup(Alignment.LEADING, false)
												.addComponent(jButtonAgenda, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButtonCadastrarCliente, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButtonCadastrarMedico, GroupLayout.DEFAULT_SIZE, 313,
														Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
										.addGroup(gl_jPanelSair.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_jPanelSair
														.createSequentialGroup()
														.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 120,
																GroupLayout.PREFERRED_SIZE)
														.addGap(71))
												.addGroup(gl_jPanelSair.createSequentialGroup().addGroup(gl_jPanelSair
														.createParallelGroup(Alignment.LEADING, false)
														.addComponent(jButtonInfoPessoais, Alignment.TRAILING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(jButtonPesquisarUsuarios, Alignment.TRAILING,
																GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
														.addPreferredGap(ComponentPlacement.RELATED)))))
						.addGap(132)));
		gl_jPanelSair.setVerticalGroup(gl_jPanelSair.createParallelGroup(Alignment.LEADING).addGroup(gl_jPanelSair
				.createSequentialGroup()
				.addGroup(gl_jPanelSair.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanelSair.createSequentialGroup().addGap(20).addComponent(lblNewLabel))
						.addGroup(gl_jPanelSair.createSequentialGroup().addGap(29)
								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
				.addGap(54)
				.addGroup(gl_jPanelSair.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButtonCadastrarMedico, GroupLayout.PREFERRED_SIZE, 114,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonPesquisarUsuarios, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
				.addGroup(gl_jPanelSair.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_jPanelSair.createSequentialGroup().addGap(58).addComponent(jButtonInfoPessoais,
								GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
						.addGroup(gl_jPanelSair.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jButtonCadastrarCliente, GroupLayout.PREFERRED_SIZE, 150,
										GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_jPanelSair.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanelSair.createSequentialGroup().addGap(114).addComponent(jButtonSair,
								GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jPanelSair.createSequentialGroup().addGap(74).addComponent(jButtonAgenda,
								GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
				.addGap(99)));
		jPanelSair.setLayout(gl_jPanelSair);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanelSair, GroupLayout.PREFERRED_SIZE, 967, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanelSair, GroupLayout.PREFERRED_SIZE, 805, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}

	private void jButtonPesquisarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {

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

	private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {
		TelaAgenda telaAgenda = new TelaAgenda();
		telaAgenda.setVisible(true);

	}

	private void jButtonInformacoesPessoaisActionPerformed(java.awt.event.ActionEvent evt) {

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
	}

	private javax.swing.JButton jButtonPesquisarUsuarios;
	private javax.swing.JButton jButtonCadastrarMedico;
	private javax.swing.JButton jButtonAgenda;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JButton jButtonInfoPessoais;
	private javax.swing.JButton jButtonCadastrarCliente;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanelSair;
	private JLabel lblNewLabel;
	
}
