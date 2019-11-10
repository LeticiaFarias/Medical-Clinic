package controller;

import java.util.List;

import model.Administrador;

public class AdministradorController {

	public static Administrador administrador = new Administrador();

	public static void cadastraAdm(int id, String nome, String email, String senha) {
		administrador.cadastraAdm(id, nome, email, senha);
	}

	public static void findByNomeAdm(String nome) {
		List<Administrador> administradores = administrador.findByNome(nome);

		for (Administrador administrador : administradores) {
			System.out.println(administrador);
		}
	}

	public static void findByEmailAdm(String email) {
		List<Administrador> administradores = administrador.findByEmail(email);

		for (Administrador administrador : administradores) {
			System.out.println(administrador);
		}
	}

	public static void findAllAdm() {
		List<Administrador> administradores = administrador.findByAll();

		for (Administrador administrador : administradores) {
			System.out.println(administrador);
		}
	}

	public static void deleteAdm(String email) {
		administrador.delete(email);
	}
}
