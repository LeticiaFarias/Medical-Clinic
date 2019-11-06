package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.GenericJPA_DAO;
import model.Administrador;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministradorCRUD extends JFrame {

	private static final long serialVersionUID = 1L;

	public JPanel contentPane;
	private JTextField txtFieldNome;
	private JTextField txtFieldEmail;
	private JTextField txtFieldLogin;
	private JTextField txtFieldSenha;
	private JLabel lblLogin;
	private JLabel lblSenha;

	public AdministradorCRUD() {
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

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(55, 43, 66, 15);
		contentPane.add(lblNome);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(55, 70, 66, 15);
		contentPane.add(lblEmail);

		lblLogin = new JLabel("Login");
		lblLogin.setBounds(55, 98, 66, 15);
		contentPane.add(lblLogin);

		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(55, 129, 66, 15);
		contentPane.add(lblSenha);

		txtFieldEmail = new JTextField();
		txtFieldEmail.setBounds(115, 68, 255, 19);
		contentPane.add(txtFieldEmail);
		txtFieldEmail.setColumns(10);

		txtFieldLogin = new JTextField();
		txtFieldLogin.setBounds(115, 96, 255, 19);
		contentPane.add(txtFieldLogin);
		txtFieldLogin.setColumns(10);

		txtFieldSenha = new JTextField();
		txtFieldSenha.setBounds(115, 127, 255, 19);
		contentPane.add(txtFieldSenha);
		txtFieldSenha.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (txtFieldNome.getText().isEmpty() || txtFieldEmail.getText().isEmpty()
						|| txtFieldLogin.getText().isEmpty() || txtFieldSenha.getText().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Campos vazios");
				} else {
					Administrador administrador = new Administrador(0, txtFieldNome.getText(), txtFieldEmail.getText(),
							txtFieldLogin.getText(), txtFieldSenha.getText());

					GenericJPA_DAO<Administrador> genericDAO = new GenericJPA_DAO<Administrador>(null);

					genericDAO.persist(administrador);

					JOptionPane.showMessageDialog(null,
							"Administrador " + txtFieldLogin.getText() + " cadastrado com sucesso!");
				}

				txtFieldNome.setText("");
				txtFieldEmail.setText("");
				txtFieldLogin.setText("");
				txtFieldSenha.setText("");
			}
		});

		btnCadastrar.setBounds(271, 210, 114, 25);
		contentPane.add(btnCadastrar);
	}

}
