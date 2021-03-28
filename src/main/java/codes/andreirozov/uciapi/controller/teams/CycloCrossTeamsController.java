package codes.andreirozov.uciapi.controller.teams;

import codes.andreirozov.uciapi.entity.teams.CycloCrossTeam;
import codes.andreirozov.uciapi.service.teams.CycloCrossTeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class CycloCrossTeamsController {

    private final CycloCrossTeamsService cycloCrossTeamsService;
    private final List<String> correctYears = Arrays.asList("2017-2018", "2018-2019", "2019-2020", "2020-2021"); // List of expected years.

    @Autowired
    public CycloCrossTeamsController(CycloCrossTeamsService cycloCrossTeamsService) {
        this.cycloCrossTeamsService = cycloCrossTeamsService;
    }

    @GetMapping("/teams/cyclocross/{year}") // Expected '2017-2018'-'2020-2021' years, otherwise return code 404.
    public ResponseEntity<ArrayList<CycloCrossTeam>> filteredTeams(@PathVariable String year,
                                                                   @RequestParam(value = "category", required = false) String teamCategory,
                                                                   @RequestParam(value = "country", required = false) String country,
                                                                   @RequestParam(value = "continent", required = false) String continent) {

        if (correctYears.contains(year)) {
            return new ResponseEntity<>(cycloCrossTeamsService.getFilteredTeams(year, teamCategory, country, continent), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}