/**
 * 
 */
package br.com.eduardomelle.ddd;

import javax.money.MonetaryAmount;

/**
 * @author eduardo
 *
 */
public class PlayerBuilder {

	private String name;

	private String city;

	private Email email;

	private MonetaryAmount salary;

	public PlayerBuilder name(String name) {
		this.name = name;
		return this;
	}

	public PlayerBuilder city(String city) {
		this.city = city;
		return this;
	}

	public PlayerBuilder email(Email email) {
		this.email = email;
		return this;
	}

	public PlayerBuilder salary(MonetaryAmount salary) {
		this.salary = salary;
		return this;
	}

	public Player build() {
		// Validar
		return new Player(this.name, this.city, this.email, this.salary);
	}

}
