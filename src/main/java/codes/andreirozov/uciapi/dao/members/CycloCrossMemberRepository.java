package codes.andreirozov.uciapi.dao.members;

import codes.andreirozov.uciapi.entity.members.CycloCrossMember;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CycloCrossMemberRepository extends CrudRepository<CycloCrossMember, Long>, JpaSpecificationExecutor<CycloCrossMember> {

}
