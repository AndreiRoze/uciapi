package codes.andreirozov.uciapi.dao.teams;

import codes.andreirozov.uciapi.entity.teams.RoadTeam;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface RoadTeamRepository extends CrudRepository<RoadTeam, Long>, JpaSpecificationExecutor<RoadTeam> {

}
