package codes.andreirozov.uciapi.service.members;

import codes.andreirozov.uciapi.dao.members.CycloCrossMemberRepository;
import codes.andreirozov.uciapi.entity.members.CycloCrossMember;
import codes.andreirozov.uciapi.specification.members.CycloCrossMemberSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CycloCrossMembersServiceImpl implements CycloCrossMembersService {

    @Autowired
    CycloCrossMemberRepository cycloCrossMemberRepository;

    @Override
    public ArrayList<CycloCrossMember> getFilteredMembers(String year, String function, String gender, String teamCategory, String country, String continent, String teamCode, String teamName) {

        return new ArrayList<>(cycloCrossMemberRepository.findAll(Specification
                .where(CycloCrossMemberSpecification.withFunction(function))
                .and(CycloCrossMemberSpecification.withGender(gender))
                .and(CycloCrossMemberSpecification.withCategory(teamCategory))
                .and(CycloCrossMemberSpecification.withCountry(country))
                .and(CycloCrossMemberSpecification.withContinent(continent))
                .and(CycloCrossMemberSpecification.withTeamCode(teamCode))
                .and(CycloCrossMemberSpecification.withTeamName(teamName))
                .and(CycloCrossMemberSpecification.withYear(year))));

    }
}
