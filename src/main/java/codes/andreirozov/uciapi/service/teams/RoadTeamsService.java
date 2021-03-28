package codes.andreirozov.uciapi.service.teams;

import codes.andreirozov.uciapi.entity.teams.RoadTeam;
import java.util.ArrayList;

public interface RoadTeamsService {
    ArrayList<RoadTeam> getFilteredTeams(String year, String teamCategory, String country, String continent);
}
