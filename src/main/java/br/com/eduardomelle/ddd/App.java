/**
 * 
 */
package br.com.eduardomelle.ddd;

/**
 * @author eduardo
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Team team = Team.of("Java");

		ChampionsLeague championsLeague = null;
		championsLeague.subscribe(team);

		TeamDAO teamDAO = new TeamDAO();
		teamDAO.insert(team);
	}

}
