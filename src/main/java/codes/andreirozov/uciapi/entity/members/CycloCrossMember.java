package codes.andreirozov.uciapi.entity.members;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cyclocross_members")
public class CycloCrossMember {
    @Id
    @Column(name = "ID")
    @JsonProperty("id")
    private long id;

    @Column(name = "function")
    @JsonProperty("function")
    private String function;

    @Column(name = "last_name")
    @JsonProperty("last_name")
    private String lastName;

    @Column(name = "first_name")
    @JsonProperty("first_name")
    private String firstName;

    @Column(name = "birth_date")
    @JsonProperty("birth_date")
    private String birthDate;

    @Column(name = "gender")
    @JsonProperty("gender")
    private String gender;

    @Column(name = "team_category")
    @JsonProperty("team_category")
    private String teamCategory;

    @Column(name = "country")
    @JsonProperty("country")
    private String country;

    @Column(name = "continent")
    @JsonProperty("continent")
    private String continent;

    @Column(name = "team_code")
    @JsonProperty("team_code")
    private String teamCode;

    @Column(name = "team_name")
    @JsonProperty("team_name")
    private String teamName;

    @Column(name = "uci_id")
    @JsonProperty("uci_id")
    private String uciId;

    @Column(name = "year")
    @JsonProperty("year")
    private String year;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getUciId() {
        return uciId;
    }

    public void setUciId(String uciId) {
        this.uciId = uciId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
