package codes.andreirozov.uciapi.controller.members;

import codes.andreirozov.uciapi.entity.members.RoadMember;
import codes.andreirozov.uciapi.service.members.RoadMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class RoadMembersController {

    private final RoadMembersService roadMembersService;
    private final List<String> correctYears = Arrays.asList("2005", "2006", "2007", "2008", "2009",
            "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"); // List of expected years.

    @Autowired
    public RoadMembersController(RoadMembersService roadMembersService) {
        this.roadMembersService = roadMembersService;
    }

    @GetMapping("members/road/{year}")// Expected 2005-2020 years, otherwise return code 404.
    public ResponseEntity<ArrayList<RoadMember>> filteredMembers(@PathVariable String year,
                                                                 @RequestParam(value = "function", required = false) String function,
                                                                 @RequestParam(value = "gender", required = false) String gender,
                                                                 @RequestParam(value = "team-category", required = false) String teamCategory,
                                                                 @RequestParam(value = "country", required = false) String country,
                                                                 @RequestParam(value = "continent", required = false) String continent,
                                                                 @RequestParam(value = "team-code", required = false) String teamCode,
                                                                 @RequestParam(value = "team-name", required = false) String teamName) {

        if (correctYears.contains(year)) {
            return new ResponseEntity<>(roadMembersService.getFilteredMembers(year, function, gender, teamCategory, country, continent, teamCode, teamName), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
