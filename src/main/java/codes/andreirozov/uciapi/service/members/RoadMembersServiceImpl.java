package codes.andreirozov.uciapi.service.members;

import codes.andreirozov.uciapi.dao.members.RoadMemberRepository;
import codes.andreirozov.uciapi.entity.members.RoadMember;
import codes.andreirozov.uciapi.specification.members.RoadMemberSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoadMembersServiceImpl implements RoadMembersService {

    @Autowired
    RoadMemberRepository roadMemberRepository;

    @Override
    public ArrayList<RoadMember> getFilteredMembers(String year, String function, String gender, String teamCategory, String country, String continent, String teamCode, String teamName) {

        return new ArrayList<>(roadMemberRepository.findAll(Specification
                .where(RoadMemberSpecification.withFunction(function))
                .and(RoadMemberSpecification.withGender(gender))
                .and(RoadMemberSpecification.withCategory(teamCategory))
                .and(RoadMemberSpecification.withCountry(country))
                .and(RoadMemberSpecification.withContinent(continent))
                .and(RoadMemberSpecification.withTeamCode(teamCode))
                .and(RoadMemberSpecification.withTeamName(teamName))
                .and(RoadMemberSpecification.withYear(year))));
    }
}
