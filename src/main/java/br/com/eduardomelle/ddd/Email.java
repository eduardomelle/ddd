package br.com.eduardomelle.ddd;

import java.util.Objects;

public class Email {

	private final String value;

	private Email(String value) {
		this.value = value;
	}

	/**
	 * Cria uma instância de e-mail válida.
	 * 
	 * @param email Um texto a ser validado.
	 * @return Uma instância de e-mail.
	 * @throws NumberFormatException    quando o parâmetro é nulo.
	 * @throws IllegalArgumentException quando a String não é válida.
	 */
	public static Email of(String email) {
		Objects.requireNonNull(email, "E-mail is required.");
		return new Email(email);
	}

}
