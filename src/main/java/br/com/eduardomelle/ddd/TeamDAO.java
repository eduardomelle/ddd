/**
 * 
 */
package br.com.eduardomelle.ddd;

/**
 * @author eduardo
 *
 */
public class TeamDAO implements ChampionsLeague {

	@Override
	public Team subscribe(Team team) {
		// id ? update : delete
		return null;
	}

	public Team insert(Team team) {
		TeamRelational relational = TeamRelational.of(team);
		return relational.toTeam();
	}

	static class TeamRelational {

		public static TeamRelational of(Team team) {
			return new TeamRelational();
		}

		public Team toTeam() {
			return null;
		}

	}

}
