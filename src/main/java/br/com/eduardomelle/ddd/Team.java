/**
 * 
 */
package br.com.eduardomelle.ddd;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author eduardo
 *
 */
public class Team {

	private List<Player> players;

	public Team() {
		this.players = new ArrayList<>();
	}

	public void add(Player player) {
		Objects.requireNonNull(player, "Player is required.");

		if (this.players.size() == 10) {

		}

		this.players.add(player);
	}

}
