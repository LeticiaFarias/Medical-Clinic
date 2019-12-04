package br.ufc.clinic.view.telasIniciais;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.ufc.clinic.view.adm.TelaCadastroAdm;
import br.ufc.clinic.view.medico.TelaCadastroMedico;

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
		jButtonSair = new javax.swing.JButton();

		jLabel1.setFont(new java.awt.Font("Code Light", 0, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 0, 51));
		jLabel1.setText("Cadastrar medico");

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setFont(new java.awt.Font("Code Light", 0, 11)); // NOI18N
		jButton3.setText("CRIAR CONTA");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Acesso");
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setToolTipText("Acesso");

		// jLabel4.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("logosuperp.png")));

		jButtonADM.setBackground(new java.awt.Color(255, 255, 255));
		jButtonADM.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonADM.setText("ADM");
		jButtonADM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonADM.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TelaCadastroAdm telaCadastroAdm = new TelaCadastroAdm();
				telaCadastroAdm.setVisible(true);

				dispose();
			}
		});

		jLabelCriarContaTXT.setFont(new java.awt.Font("Code Light", 0, 24));
		jLabelCriarContaTXT.setForeground(new java.awt.Color(0, 0, 51));
		jLabelCriarContaTXT.setText("Cadastre-se");

		// Chama 'telaCadatroMedico'
		jButtonMedico.setBackground(new java.awt.Color(255, 255, 255));
		jButtonMedico.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonMedico.setText("MEDICO");
		jButtonMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonMedico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TelaCadastroMedico telaCadastroMedico = new TelaCadastroMedico();
				telaCadastroMedico.setVisible(true);

				dispose();
			}
		});

		// Botão sair
		jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
		jButtonSair.setFont(new java.awt.Font("Code Light", 0, 11));
		jButtonSair.setText("SAIR");
		jButtonSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButtonSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(35)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
						.createSequentialGroup().addGap(38)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jButtonMedico, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)
										.addGap(42).addComponent(jButtonADM, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(54, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel4)
								.addPreferredGap(ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
								.addComponent(jLabelCriarContaTXT, GroupLayout.PREFERRED_SIZE, 218,
										GroupLayout.PREFERRED_SIZE)
								.addGap(45)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(19)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabelCriarContaTXT, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
				.addGap(27)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButtonMedico, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButtonADM, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
				.addComponent(jButtonSair, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE).addGap(38)));
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
	private javax.swing.JButton jButtonSair;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabelCriarContaTXT;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables
}
