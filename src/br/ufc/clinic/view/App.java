package br.ufc.clinic.view;

import java.sql.Date;
import java.util.List;

import br.ufc.clinic.controller.AdministradorController;
import br.ufc.clinic.controller.AgendaController;
import br.ufc.clinic.controller.ClienteController;
import br.ufc.clinic.controller.EnderecoController;
import br.ufc.clinic.controller.MedicoController;
import br.ufc.clinic.model.Agenda;
import br.ufc.clinic.model.Cliente;

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

		/*
		 * ClienteController.cadastraCliente("000000000-04", "Edinete Miranda",
		 * "edinete@teste.com", "ufc", 88, 911111111,
		 * java.sql.Date.valueOf("1987-07-07"), "001", "DesembaRgador Américo Militão",
		 * "Centro", "Altos", "638000-00");
		 * ClienteController.cadastraCliente("000000000-05", "Júlio Serafim",
		 * "julio@teste.com", "ufc", 88, 911111112, java.sql.Date.valueOf("1993-03-12"),
		 * "002", "DesembaRgador Américo Militão", "Centro", null, "638000-00");
		 * ClienteController.cadastraCliente("000000000-11", "Teste", "teste", "teste",
		 * 00, 00, java.sql.Date.valueOf("1999-10-01"), "teste", "teste", "teste",
		 * "teste", "teste");
		 */

		/*
		 * List<Cliente> clientes = ClienteController.findByNome("Júlio Serafim");
		 * 
		 * for (Cliente cliente : clientes) { System.out.println(cliente); }
		 */

		/*
		 * ClienteController.updateNome("Fernanda Albuquerque", "teste");
		 * ClienteController.updateSenha("ufc", "teste");
		 * ClienteController.updateEmail("fernanda@teste.com", "teste");
		 * ClienteController.updateCpf("000000000-08", "fernanda@teste.com"); Date data
		 * = java.sql.Date.valueOf("1999-11-09");
		 * ClienteController.updateDataAniver(data, "fernanda@teste.com");
		 * 
		 * EnderecoController.updateEndereco(3, "002", "Avenida Brasil", null, null,
		 * null);
		 */

		MedicoController.cadastraMedico("00000000001", "Bruno Almeida", "bruno@teste", "ufc", "Cardiologista");

	}

}
