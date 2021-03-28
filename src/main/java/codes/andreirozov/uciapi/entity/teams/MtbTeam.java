package codes.andreirozov.uciapi.entity.teams;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mtb_teams")
public class MtbTeam {
    @Id
    @Column(name = "ID")
    @JsonProperty("id")
    private long id;

    @Column(name = "team_code")
    @JsonProperty("team_code")
    private String teamCode;

    @Column(name = "team_name")
    @JsonProperty("team_name")
    private String teamName;

    @Column(name = "team_category")
    @JsonProperty("team_category")
    private String teamCategory;

    @Column(name = "country")
    @JsonProperty("country")
    private String country;

    @Column(name = "continent")
    @JsonProperty("continent")
    private String continent;

    @Column(name = "year")
    @JsonProperty("year")
    private String year;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCategory() {
        return teamCategory;
    }

    public void setTeamCategory(String teamCategory) {
        this.teamCategory = teamCategory;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
