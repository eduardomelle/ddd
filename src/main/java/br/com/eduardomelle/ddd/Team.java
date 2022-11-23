/**
 * 
 */
package br.com.eduardomelle.ddd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Agregator root
 * 
 * @author eduardo
 *
 */
public class Team {

	private static final int JOGADORES_TIME = 11;

	private final String name;

	private List<Player> players;

	private Team(String name) {
		this.name = name;
		this.players = new ArrayList<>();
	}

	/**
	 * Adiciona um novo jogador ao time.
	 * 
	 * @param player Um novo jogador.
	 * @throws NullPointerException Quando o parâmetro é nulo.
	 * @throws TeamException        Quando meu time está completo.
	 */
	public void add(Player player) {
		Objects.requireNonNull(player, "Player is required.");

		if (this.players.size() == JOGADORES_TIME) {
			throw new TeamException("O meu time já está completo. Não tem espaço para o jogador " + player);
		}

		this.players.add(player);
	}

	public List<Player> getPlayers() {
		return Collections.unmodifiableList(this.players);
	}

	public String getName() {
		return this.name;
	}

	public boolean isEmpty() {
		return this.players.isEmpty();
	}

	public static Team of(String name) {
		Objects.requireNonNull(name, "Name is required.");

		return new Team(name);
	}

}
