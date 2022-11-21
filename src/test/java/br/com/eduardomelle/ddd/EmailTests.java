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
public class EmailTests {

	@Test
	public void shouldReturnNPEWhenParameterIsNull() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			Email.of(null);
		});
	}

}
