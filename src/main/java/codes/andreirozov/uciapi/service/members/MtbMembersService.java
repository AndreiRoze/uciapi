package codes.andreirozov.uciapi.service.members;

import codes.andreirozov.uciapi.entity.members.MtbMember;
import java.util.ArrayList;

public interface MtbMembersService {
    ArrayList<MtbMember> getFilteredMembers(String year, String function, String gender, String teamCategory, String country, String continent, String teamCode, String teamName);
}
