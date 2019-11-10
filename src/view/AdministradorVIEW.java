package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AdministradorController;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class AdministradorVIEW extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministradorVIEW frame = new AdministradorVIEW();

					frame.telaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void telaCadastro() {
		JPanel contentPane;
		JTextField txtFieldNome;
		JTextField txtFieldEmail;
		JTextField txtFieldSenha;
		JLabel lblNome = new JLabel("Nome");
		JLabel lblEmail = new JLabel("Email");
		JLabel lblSenha = new JLabel("Senha");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtFieldNome = new JTextField();
		txtFieldNome.setBounds(115, 41, 255, 19);
		contentPane.add(txtFieldNome);
		txtFieldNome.setColumns(10);

		txtFieldEmail = new JTextField();
		txtFieldEmail.setBounds(115, 68, 255, 19);
		contentPane.add(txtFieldEmail);
		txtFieldEmail.setColumns(10);

		txtFieldSenha = new JTextField();
		txtFieldSenha.setBounds(115, 127, 255, 19);
		contentPane.add(txtFieldSenha);
		txtFieldSenha.setColumns(10);

		lblNome.setBounds(55, 43, 66, 15);
		contentPane.add(lblNome);

		lblEmail.setBounds(55, 70, 66, 15);
		contentPane.add(lblEmail);

		lblSenha.setBounds(55, 129, 66, 15);
		contentPane.add(lblSenha);

		// Cadastro
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				AdministradorController.cadastraAdm(0, txtFieldNome.getText(), txtFieldEmail.getText(),
						txtFieldSenha.getText());

				JOptionPane.showMessageDialog(null,
						"Administrador " + txtFieldNome.getText() + " cadastrado com sucesso!");

				txtFieldNome.setText("");
				txtFieldEmail.setText("");
				txtFieldSenha.setText("");
			}
		});

		btnCadastrar.setBounds(271, 210, 114, 25);
		contentPane.add(btnCadastrar);
	}
}
