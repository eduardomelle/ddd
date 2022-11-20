package br.com.eduardomelle.ddd;

import java.util.Objects;

public class Email {

	private final String value;

	private Email(String value) {
		this.value = value;
	}

	public static Email of(String email) {
		Objects.requireNonNull(email, "E-mail is required.");
		return new Email(email);
	}

}
