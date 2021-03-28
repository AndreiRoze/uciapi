package codes.andreirozov.uciapi.controller.members;

import codes.andreirozov.uciapi.entity.members.CycloCrossMember;
import codes.andreirozov.uciapi.service.members.CycloCrossMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class CycloCrossMembersController {

    private final CycloCrossMembersService cycloCrossMembersService;
    private final List<String> correctYears = Arrays.asList("2017-2018", "2018-2019", "2019-2020", "2020-2021"); // List of expected years.

    @Autowired
    public CycloCrossMembersController(CycloCrossMembersService cycloCrossMembersService) {
        this.cycloCrossMembersService = cycloCrossMembersService;
    }

    @GetMapping("members/cyclocross/{year}")//  Expected '2017-2018'-'2020-2021' years, otherwise return code 404.
    public ResponseEntity<ArrayList<CycloCrossMember>> filteredMembers(@PathVariable String year,
                                                                       @RequestParam(value = "function", required = false) String function,
                                                                       @RequestParam(value = "gender", required = false) String gender,
                                                                       @RequestParam(value = "team-category", required = false) String teamCategory,
                                                                       @RequestParam(value = "country", required = false) String country,
                                                                       @RequestParam(value = "continent", required = false) String continent,
                                                                       @RequestParam(value = "team-code", required = false) String teamCode,
                                                                       @RequestParam(value = "team-name", required = false) String teamName) {

        if (correctYears.contains(year)) {
            return new ResponseEntity<>(cycloCrossMembersService.getFilteredMembers(year, function, gender, teamCategory, country, continent, teamCode, teamName), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
