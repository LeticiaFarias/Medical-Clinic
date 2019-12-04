package br.ufc.clinic.view.telasIniciais;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.ufc.clinic.view.adm.TelaCadastroAdm;
import br.ufc.clinic.view.medico.TelaCadastroMedico;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.SwingConstants;

public class TelaCriarConta extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public TelaCriarConta() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("I9Life");
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		jLabel4 = new javax.swing.JLabel();

		jLabel1 = new javax.swing.JLabel();
		jLabel1.setFont(new java.awt.Font("Code Light", 0, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 0, 51));
		jLabel1.setText("Cadastrar medico");

		JLabel lblNewLabel = new JLabel("                                                               CADASTRE-SE");
		lblNewLabel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(UIManager.getColor("TabbedPane.borderHightlightColor"));

		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setToolTipText("I9Life");

		jButtonAdm = new javax.swing.JButton("ADMINISTRADOR");
		jButtonAdm.setVerticalAlignment(SwingConstants.BOTTOM);
		jButtonAdm.setIcon(new ImageIcon(TelaCriarConta.class.getResource("/br/ufc/clinic/imagens/admP.png")));
		jButtonAdm.setBackground(new java.awt.Color(255, 255, 255));
		jButtonAdm.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonAdm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonAdm.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TelaCadastroAdm telaCadastroAdm = new TelaCadastroAdm();
				telaCadastroAdm.setVisible(true);

				dispose();
			}
		});

		jButtonMedico = new javax.swing.JButton("     MÉDICO");
		jButtonMedico.setIcon(new ImageIcon(TelaCriarConta.class.getResource("/br/ufc/clinic/imagens/medicoP.png")));
		jButtonMedico.setBackground(new java.awt.Color(255, 255, 255));
		jButtonMedico.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonMedico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TelaCadastroMedico telaCadastroMedico = new TelaCadastroMedico();
				telaCadastroMedico.setVisible(true);

				dispose();
			}
		});

		jButtonSair = new javax.swing.JButton("VOLTAR");
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
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
						.createSequentialGroup().addGap(35)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel4)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(jButtonAdm, GroupLayout.PREFERRED_SIZE, 295,
												GroupLayout.PREFERRED_SIZE)
										.addGap(113).addComponent(jButtonMedico, GroupLayout.PREFERRED_SIZE, 283,
												GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(lblNewLabel,
								GroupLayout.PREFERRED_SIZE, 772, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(11, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(29)
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(29)
								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
								.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addGap(39))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(75)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jButtonAdm, GroupLayout.PREFERRED_SIZE, 121,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonMedico, GroupLayout.PREFERRED_SIZE, 122,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap()))));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 795, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
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

	}

	private javax.swing.JButton jButtonMedico;
	private javax.swing.JButton jButtonAdm;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
}
