/**
 * 
 */
package br.com.eduardomelle.ddd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author eduardo
 *
 */
public class TeamTests {

	@Test
	public void shouldCreateTeam() {
		Team bahia = Team.of("Bahia");

		Assertions.assertNotNull(bahia);
		Assertions.assertEquals("Bahia", bahia.getName());
		Assertions.assertTrue(bahia.isEmpty());
	}

	@Test
	public void shouldNotBeOverPlayer() {
		Team bahia = Team.of("Bahia");

		for (int index = 0; index < 11; index++) {
			Player player = Player.builder().name("Player " + index).build();
			bahia.add(player);
		}

		TeamException teamException = Assertions.assertThrows(TeamException.class, () -> {
			bahia.add(Player.builder().name("Otavio").build());
		});

		System.err.println("Error message: " + teamException.getMessage());
	}

}
