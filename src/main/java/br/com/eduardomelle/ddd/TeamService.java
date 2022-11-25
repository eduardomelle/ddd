/**
 * 
 */
package br.com.eduardomelle.ddd;

import javax.money.MonetaryAmount;

/**
 * @author eduardo
 *
 */
// Service
public class TeamService {

	public void contratar(Player player) {
		Email email = player.getEmail();
		// Enviar e-mail

		MonetaryAmount salary = player.getSalary();
		// Verificar salário
		// Verificar se tenho dinheiro
		// Manda um e-mail confirmando o jogador
		// Anuncio a imprensa
		// Adiciona no time
	}

}
