package br.ufc.clinic.view;

import java.sql.Date;
import java.util.List;

import br.ufc.clinic.controller.AdministradorController;
import br.ufc.clinic.controller.AgendaController;
import br.ufc.clinic.model.Agenda;

public class App {

	public static void main(String[] args) {
		/*
		 * AdministradorController.cadastraAdm(0, "Leticia Farias", "leticia@teste.com",
		 * "ufc");
		 * 
		 * AdministradorController.cadastraAdm(0, "Érica Sousa", "erica@teste.com",
		 * "ufc");
		 * 
		 * AdministradorController.cadastraAdm(0, "Hugo Patricio", "hugo@teste.com",
		 * "ufc");
		 * 
		 * AdministradorController.cadastraAdm(0, "Jean Pantoja", "pantoja@teste.com",
		 * "ufc");
		 * 
		 * AdministradorController.cadastraAdm(0, "Breno Oliveira", "breno@teste.com",
		 * "ufc");
		 * 
		 * AdministradorController.login("erica@teste.com", "ufc");
		 * AdministradorController.cadastraAdm(0, "Teste", "teste@teste.com", "ufc");
		 * AdministradorController.updateNome("João Teste", "teste@teste.com");
		 * AdministradorController.updateEmail("joao@teste.com", "teste@teste.com");
		 * AdministradorController.updateSenha("123", "joao@teste.com");
		 * 
		 * List<Administrador> administradores = AdministradorController.findAll();
		 * 
		 * for (Administrador administrador : administradores) {
		 * System.out.println(administrador); }
		 * 
		 * AdministradorController.login("joao@teste.com", "123");
		 * AdministradorController.delete("joao@teste.com");
		 */

		/*
		 * AtendenteController.cadastraAtendente(0, "000000000-00", "Sávila Saraiva",
		 * "savila@teste", "ufc"); AtendenteController.cadastraAtendente(0,
		 * "000000000-10", "Sávila Saraiva", "teste@teste", "ufc");
		 * 
		 * List<Atendente> atendentes = AtendenteController.findAll();
		 * 
		 * for (Atendente atendente : atendentes) { System.out.println(atendente); }
		 * 
		 * 
		 * List<Atendente> atendentes = AtendenteController.findByEmail("teste@teste");
		 * 
		 * for (Atendente atendente : atendentes) { System.out.println(atendente); }
		 * 
		 * List<Atendente> atendentes =
		 * AtendenteController.findByNome("Sávila Saraiva");
		 * 
		 * for (Atendente atendente : atendentes) { System.out.println(atendente); }
		 * 
		 * AtendenteController.updateEmail("junior@teste.com", "teste@teste");
		 * AtendenteController.updateCpf("000000000-01", "junior@teste.com");
		 * AtendenteController.updateSenha("123", "junior@teste.com");
		 * AtendenteController.updateNome("Júnior Melo", "junior@teste.com");
		 * AtendenteController.login("junior@teste.com", "123");
		 */

		/*
		 * AgendaController.cadastraAgenda("Ítalo Oliveira", "Edinete Miranda",
		 * "000000000-02", java.sql.Date.valueOf("2005-02-01"), "10:00");
		 * AgendaController.cadastraAgenda("Ítalo Oliveira", "Julio Serafim",
		 * "000000000-03", java.sql.Date.valueOf("2020-02-01"), "10:00");
		 * 
		 * List<Agenda> agendas = AgendaController.findAll();
		 * 
		 * for (Agenda agenda : agendas) { System.out.println(agenda); }
		 */

		AdministradorController.cadastraAdm(0, "Teste teste", "junior@teste.com", "ufc");

	}

}