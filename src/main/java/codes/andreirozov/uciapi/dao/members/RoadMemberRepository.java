package codes.andreirozov.uciapi.dao.members;

import codes.andreirozov.uciapi.entity.members.RoadMember;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface RoadMemberRepository extends CrudRepository<RoadMember, Long>, JpaSpecificationExecutor<RoadMember> {

}
