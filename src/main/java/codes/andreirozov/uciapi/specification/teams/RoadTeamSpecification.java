package codes.andreirozov.uciapi.specification.teams;

import codes.andreirozov.uciapi.entity.teams.RoadTeam;
import org.springframework.data.jpa.domain.Specification;

public class RoadTeamSpecification {

    public static Specification<RoadTeam> withCategory(String category) {
        return (root, query, cb) -> (category == null || category.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("teamCategory"), category);
    }

    public static Specification<RoadTeam> withCountry(String country) {
        return (root, query, cb) -> (country == null || country.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("country"), country);
    }

    public static Specification<RoadTeam> withContinent(String continent) {
        return (root, query, cb) -> (continent == null || continent.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("continent"), continent);
    }

    public static Specification<RoadTeam> withYear(String year) {
        return (root, query, cb) -> (year == null || year.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("year"), year);
    }
}


