package codes.andreirozov.uciapi.controller.teams;

import codes.andreirozov.uciapi.entity.teams.RoadTeam;
import codes.andreirozov.uciapi.service.teams.RoadTeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class RoadTeamsController {

    private final RoadTeamsService roadTeamsService;
    private final List<String> correctYears = Arrays.asList("2005", "2006", "2007", "2008", "2009",
            "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"); // List of expected years.

    @Autowired
    public RoadTeamsController(RoadTeamsService roadTeamsService) {
        this.roadTeamsService = roadTeamsService;
    }

    @GetMapping("/teams/road/{year}") // Expected 2005-2020 years, otherwise return code 404.
    public ResponseEntity<ArrayList<RoadTeam>> filteredTeams(@PathVariable String year,
                                                             @RequestParam(value = "category", required = false) String teamCategory,
                                                             @RequestParam(value = "country", required = false) String country,
                                                             @RequestParam(value = "continent", required = false) String continent) {

        if (correctYears.contains(year)) {
            return new ResponseEntity<>(roadTeamsService.getFilteredTeams(year, teamCategory, country, continent), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
