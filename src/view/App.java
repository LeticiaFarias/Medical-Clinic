package view;

import java.awt.EventQueue;
import java.util.List;

import dao.GenericDAO;
import dao.GenericJPA_DAO;
import model.Administrador;
import model.Atendente;

public class App {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministradorCRUD frame = new AdministradorCRUD();
					frame.setVisible(true);
					AtendenteCRUD atendenteCRUD = new AtendenteCRUD();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
