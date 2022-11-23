package br.com.eduardomelle.ddd;

import java.util.Objects;

import javax.money.MonetaryAmount;

import lombok.Builder;

@Builder
public class Player {

	private String name;

	private String city;

	private Email email;

	private MonetaryAmount salary;

	public Player(String name, String city, Email email, MonetaryAmount salary) {
		super();
		this.name = name;
		this.city = city;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public Email getEmail() {
		return email;
	}

	public MonetaryAmount getSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", city=" + city + ", email=" + email + ", salary=" + salary + "]";
	}

	public static PlayerBuilder builder() {
		return new PlayerBuilder();
	}

}
