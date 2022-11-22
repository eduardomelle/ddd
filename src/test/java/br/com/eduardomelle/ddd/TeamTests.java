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

}
