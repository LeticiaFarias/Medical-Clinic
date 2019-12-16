package br.ufc.clinic.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import br.ufc.clinic.controller.AdministradorController;
import br.ufc.clinic.controller.AtendenteController;
import br.ufc.clinic.controller.ClienteController;
import br.ufc.clinic.controller.MedicoController;
import br.ufc.clinic.model.Administrador;
import br.ufc.clinic.model.Atendente;
import br.ufc.clinic.model.Cliente;
import br.ufc.clinic.model.Medico;

public class ValidaUtil {

	// ------------- Validações de Email ----------//

	public static boolean validaEmailAdm(String email) {
		List<Administrador> administradores = AdministradorController.findByEmail(email);

		for (Administrador administrador : administradores) {
			if (administrador.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}

	public static boolean validaEmailAtendente(String email) {
		List<Atendente> atendentes = AtendenteController.findByEmail(email);

		for (Atendente atendente : atendentes) {
			if (atendente.getEmail().equals(email)) {
				return true;
			}
		}

		return false;
	}

	public static boolean validaEmailCliente(String email) {
		List<Cliente> clientes = ClienteController.findByEmail(email);

		for (Cliente cliente : clientes) {
			if (cliente.getEmail().equals(email)) {
				return true;
			}
		}

		return false;
	}

	public static boolean validaEmailMedico(String email) {
		List<Medico> medicos = MedicoController.findByEmail(email);

		for (Medico medico : medicos) {
			if (medico.getEmail().equals(email)) {
				return true;
			}
		}

		return false;
	}

	public static int validaEmail(String email) {
		if (validaEmailAdm(email) == false) {
			if (validaEmailAtendente(email) == false) {
				if (validaEmailMedico(email) == false) {
					if (validaEmailCliente(email) == false) {
						return 0;
					} else {
						return 4;
					}
				} else {
					return 3;
				}
			} else {
				return 2;
			}
		} else {
			return 1;
		}
	}

	// ---------- Validações de Senha ----------//

	public static boolean validaSenhaAdm(String email, String senhaUser) {
		List<Administrador> administradores = AdministradorController.findByEmail(email);

		String senhaUserCriptografada = criptografaSenha(senhaUser);

		for (Administrador administrador : administradores) {
			if (administrador.getSenha().equals(senhaUserCriptografada)) {
				return true;
			}
		}
		return false;
	}

	public static boolean validaSenhaAtendente(String email, String senhaUser) {
		List<Atendente> atendentes = AtendenteController.findByEmail(email);

		String senhaUserCriptografada = criptografaSenha(senhaUser);

		for (Atendente atendente : atendentes) {
			if (atendente.getSenha().equals(senhaUserCriptografada)) {
				return true;
			}
		}
		return false;
	}

	public static boolean validaSenhaCliente(String email, String senhaUser) {
		List<Cliente> clientes = ClienteController.findByEmail(email);

		String senhaUserCriptografada = criptografaSenha(senhaUser);

		for (Cliente cliente : clientes) {
			if (cliente.getSenha().equals(senhaUserCriptografada)) {
				return true;
			}
		}
		return false;
	}

	public static boolean validaSenhaMedico(String email, String senhaUser) {
		List<Medico> medicos = MedicoController.findByEmail(email);

		String senhaUserCriptografada = criptografaSenha(senhaUser);

		for (Medico medico : medicos) {
			if (medico.getSenha().equals(senhaUserCriptografada)) {
				return true;
			}
		}
		return false;
	}

	// ---------- Validação de CPF ----------//
	public static boolean validaCpfAtendente(String cpf) {
		List<Atendente> atendentes = AtendenteController.findAll();

		for (Atendente atendente : atendentes) {
			if (atendente.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	public static boolean validaCpfCliente(String cpf) {
		List<Cliente> atendentes = ClienteController.findAll();

		for (Cliente cliente : atendentes) {
			if (cliente.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	public static boolean validaCpf(String cpf) {
		if (cpf.length() == 12) {
			if (validaCpfAtendente(cpf) == false) {
				if (validaCpfCliente(cpf) == false) {
					return false;
				}
			}
		}
		return true;
	}

	// ---------- Criptrografar Senha ----------//

	public static String criptografaSenha(String senha) {

		MessageDigest algorithm = null;

		try {
			algorithm = MessageDigest.getInstance("SHA-256");
			byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

			StringBuilder hexString = new StringBuilder();
			for (byte b : messageDigest) {
				hexString.append(String.format("%02X", 0xFF & b));
			}
			String senhaCriptografada = hexString.toString();

			return senhaCriptografada;

		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return senha;
	}

}
