package codes.andreirozov.uciapi.service.teams;

import codes.andreirozov.uciapi.entity.teams.CycloCrossTeam;
import java.util.ArrayList;

public interface CycloCrossTeamsService {
    ArrayList<CycloCrossTeam> getFilteredTeams(String year, String teamCategory, String country, String continent);
}
