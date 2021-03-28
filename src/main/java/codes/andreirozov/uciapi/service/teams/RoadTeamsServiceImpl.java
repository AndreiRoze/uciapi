package codes.andreirozov.uciapi.service.teams;

import codes.andreirozov.uciapi.dao.teams.RoadTeamRepository;
import codes.andreirozov.uciapi.entity.teams.RoadTeam;
import codes.andreirozov.uciapi.specification.teams.RoadTeamSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class RoadTeamsServiceImpl implements RoadTeamsService {

    @Autowired
    RoadTeamRepository roadTeamRepository;

    @Override
    public ArrayList<RoadTeam> getFilteredTeams(String year, String teamCategory, String country, String continent) {

        return new ArrayList<>(roadTeamRepository.findAll(Specification
                .where(RoadTeamSpecification.withCategory(teamCategory))
                .and(RoadTeamSpecification.withCountry(country))
                .and(RoadTeamSpecification.withContinent(continent))
                .and(RoadTeamSpecification.withYear(year))));
    }
}
