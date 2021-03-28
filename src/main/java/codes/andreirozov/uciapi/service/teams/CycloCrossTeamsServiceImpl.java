package codes.andreirozov.uciapi.service.teams;

import codes.andreirozov.uciapi.dao.teams.CycloCrossTeamRepository;
import codes.andreirozov.uciapi.entity.teams.CycloCrossTeam;
import codes.andreirozov.uciapi.specification.teams.CycloCrossTeamSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CycloCrossTeamsServiceImpl implements CycloCrossTeamsService {

    @Autowired
    CycloCrossTeamRepository cycloCrossTeamRepository;

    @Override
    public ArrayList<CycloCrossTeam> getFilteredTeams(String year, String teamCategory, String country, String continent) {

        return new ArrayList<>(cycloCrossTeamRepository.findAll(Specification
                .where(CycloCrossTeamSpecification.withCategory(teamCategory))
                .and(CycloCrossTeamSpecification.withCountry(country))
                .and(CycloCrossTeamSpecification.withContinent(continent))
                .and(CycloCrossTeamSpecification.withYear(year))));
    }
}
