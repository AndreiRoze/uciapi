package codes.andreirozov.uciapi.dao.members;

import codes.andreirozov.uciapi.entity.members.MtbMember;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface MtbMemberRepository extends CrudRepository<MtbMember, Long>, JpaSpecificationExecutor<MtbMember> {

}
