package codes.andreirozov.uciapi.service.members;

import codes.andreirozov.uciapi.entity.members.CycloCrossMember;

import java.util.ArrayList;

public interface CycloCrossMembersService {
    ArrayList<CycloCrossMember> getFilteredMembers(String year, String function, String gender, String teamCategory, String country, String continent, String teamCode, String teamName);
}
