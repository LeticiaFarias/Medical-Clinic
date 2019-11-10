package util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ValidaUtil {

	public static boolean validaAdm(String email) {
		return false;
	}

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
