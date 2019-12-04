package br.ufc.clinic.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextosUtil {

	public static void erro() {
		System.out.println("\nErro!\n");
	}

	public static void emailExistente() {
		System.out.println("\nEmail já existente no sistema.\n");
	}

	public static void emailInexistente() {
		System.out.println("\nEmail não existe no sistema.\n");
	}

	public static void senhaIncorreta() {
		System.out.println("\nSenha incorreta!\n");
	}

	public static void cpfExistente() {
		System.out.println("\nO CPF informado ja está cadastrado no sistema.\n");
	}

	public static void cpfInvalido() {
		System.out.println("\nCPF inválido.\n");
	}

	public static Date formatData(String data) {
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date dataAniver;
			dataAniver = df.parse(data);
			return dataAniver;
		} catch (ParseException e) {
			System.out.println("\nErro data.\n");
			e.printStackTrace();
		}

		return null;
	}

}
