package codes.andreirozov.uciapi.service.teams;

import codes.andreirozov.uciapi.entity.teams.MtbTeam;
import java.util.ArrayList;

public interface MtbTeamsService {
    ArrayList<MtbTeam> getFilteredTeams(String year, String teamCategory, String country, String continent);
}
