package codes.andreirozov.uciapi.dao.teams;

import codes.andreirozov.uciapi.entity.teams.CycloCrossTeam;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CycloCrossTeamRepository extends CrudRepository<CycloCrossTeam, Long>, JpaSpecificationExecutor<CycloCrossTeam> {

}
