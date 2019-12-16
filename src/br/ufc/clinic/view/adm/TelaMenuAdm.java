package br.ufc.clinic.view.adm;

import br.ufc.clinic.view.atendente.TelaCadastroAtedente;
import br.ufc.clinic.view.telasIniciais.TelaLogin;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Font;

public class TelaMenuAdm extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	public TelaMenuAdm() {
		initComponents();
	}

	private void initComponents() {

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("I9Life");
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setToolTipText("I9Life");

		lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(TelaMenuAdm.class.getResource("/br/ufc/clinic/imagens/logo.png")));

		jLabelMenuAMtxt = new javax.swing.JLabel("BEM VINDO ADMINISTRADOR!");
		jLabelMenuAMtxt.setFont(new Font("Dialog", Font.BOLD, 24));
		jLabelMenuAMtxt.setForeground(new java.awt.Color(0, 0, 51));

		jButtonPesquisar = new javax.swing.JButton("PESQUISAR USUÁRIOS");
		jButtonPesquisar.setIcon(new ImageIcon(TelaMenuAdm.class.getResource("/br/ufc/clinic/imagens/PesquisarP.png")));
		jButtonPesquisar.setBackground(new java.awt.Color(255, 255, 255));
		jButtonPesquisar.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonPesquisar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

			}
		});

		jButtonConfiguracoes = new javax.swing.JButton("  INFORMAÇÕES PESSOAIS");
		jButtonConfiguracoes
				.setIcon(new ImageIcon(TelaMenuAdm.class.getResource("/br/ufc/clinic/imagens/infoPessoaisP.png")));
		jButtonConfiguracoes.setBackground(new java.awt.Color(255, 255, 255));
		jButtonConfiguracoes.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonConfiguracoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

			}
		});

		jButtonCadastrarAtendente = new javax.swing.JButton("CADASTRAR ATENDENTE");
		jButtonCadastrarAtendente
				.setIcon(new ImageIcon(TelaMenuAdm.class.getResource("/br/ufc/clinic/imagens/cadastroP.png")));
		jButtonCadastrarAtendente.setBackground(new java.awt.Color(255, 255, 255));
		jButtonCadastrarAtendente.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonCadastrarAtendente
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonCadastrarAtendente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCadastrarAtendenteActionPerformed(evt);
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

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(87)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jButtonPesquisar, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
								.addComponent(jButtonConfiguracoes, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonCadastrarAtendente, GroupLayout.PREFERRED_SIZE, 267,
										GroupLayout.PREFERRED_SIZE))
						.addGap(69))
				.addGroup(Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(47)
								.addComponent(lblNewLabel, 0, 0, Short.MAX_VALUE).addGap(42).addComponent(
										jLabelMenuAMtxt, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(37).addComponent(lblNewLabel))
								.addGroup(
										jPanel1Layout.createSequentialGroup().addGap(46).addComponent(jLabelMenuAMtxt,
												GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(29).addComponent(
										jButtonCadastrarAtendente, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(39).addComponent(
										jButtonConfiguracoes, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
						.addGap(94)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jButtonPesquisar, GroupLayout.PREFERRED_SIZE, 125,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGap(36)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 788, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}

	private void jButtonCadastrarAtendenteActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
		
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

	}

	private javax.swing.JButton jButtonPesquisar;
	private javax.swing.JButton jButtonConfiguracoes;
	private javax.swing.JButton jButtonCadastrarAtendente;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JLabel jLabelMenuAMtxt;
	private javax.swing.JPanel jPanel1;
	private JLabel lblNewLabel;
}
