package codes.andreirozov.uciapi.dao.teams;

import codes.andreirozov.uciapi.entity.teams.MtbTeam;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface MtbTeamRepository extends CrudRepository<MtbTeam, Long>, JpaSpecificationExecutor<MtbTeam> {

}
