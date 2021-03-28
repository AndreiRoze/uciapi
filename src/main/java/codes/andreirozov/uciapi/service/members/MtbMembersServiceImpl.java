package codes.andreirozov.uciapi.service.members;

import codes.andreirozov.uciapi.dao.members.MtbMemberRepository;
import codes.andreirozov.uciapi.entity.members.MtbMember;
import codes.andreirozov.uciapi.specification.members.MtbMemberSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MtbMembersServiceImpl implements MtbMembersService {

    @Autowired
    MtbMemberRepository mtbMemberRepository;

    @Override
    public ArrayList<MtbMember> getFilteredMembers(String year, String function, String gender, String teamCategory, String country, String continent, String teamCode, String teamName) {

        return new ArrayList<>(mtbMemberRepository.findAll(Specification
                .where(MtbMemberSpecification.withFunction(function))
                .and(MtbMemberSpecification.withGender(gender))
                .and(MtbMemberSpecification.withCategory(teamCategory))
                .and(MtbMemberSpecification.withCountry(country))
                .and(MtbMemberSpecification.withContinent(continent))
                .and(MtbMemberSpecification.withTeamCode(teamCode))
                .and(MtbMemberSpecification.withTeamName(teamName))
                .and(MtbMemberSpecification.withYear(year))));
    }
}
