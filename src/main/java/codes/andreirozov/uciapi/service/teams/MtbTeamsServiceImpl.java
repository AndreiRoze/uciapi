package codes.andreirozov.uciapi.service.teams;

import codes.andreirozov.uciapi.dao.teams.MtbTeamRepository;
import codes.andreirozov.uciapi.entity.teams.MtbTeam;
import codes.andreirozov.uciapi.specification.teams.MtbTeamSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class MtbTeamsServiceImpl implements MtbTeamsService {

    @Autowired
    MtbTeamRepository mtbTeamRepository;

    @Override
    public ArrayList<MtbTeam> getFilteredTeams(String year, String teamCategory, String country, String continent) {

        return new ArrayList<>(mtbTeamRepository.findAll(Specification
                .where(MtbTeamSpecification.withCategory(teamCategory))
                .and(MtbTeamSpecification.withCountry(country))
                .and(MtbTeamSpecification.withContinent(continent))
                .and(MtbTeamSpecification.withYear(year))));
    }
}
