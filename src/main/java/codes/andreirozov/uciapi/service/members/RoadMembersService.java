package codes.andreirozov.uciapi.service.members;

import codes.andreirozov.uciapi.entity.members.RoadMember;
import java.util.ArrayList;

public interface RoadMembersService {
    ArrayList<RoadMember> getFilteredMembers(String year, String function, String gender, String teamCategory, String country, String continent, String teamCode, String teamName);
}
