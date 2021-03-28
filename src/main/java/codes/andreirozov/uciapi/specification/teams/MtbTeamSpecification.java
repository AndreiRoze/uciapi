package codes.andreirozov.uciapi.specification.teams;

import codes.andreirozov.uciapi.entity.teams.MtbTeam;
import org.springframework.data.jpa.domain.Specification;

public class MtbTeamSpecification {
    public static Specification<MtbTeam> withCategory(String category) {
        return (root, query, cb) -> (category == null || category.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("teamCategory"), category);
    }

    public static Specification<MtbTeam> withCountry(String country) {
        return (root, query, cb) -> (country == null || country.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("country"), country);
    }

    public static Specification<MtbTeam> withContinent(String continent) {
        return (root, query, cb) -> (continent == null || continent.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("continent"), continent);
    }

    public static Specification<MtbTeam> withYear(String year) {
        return (root, query, cb) -> (year == null || year.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("year"), year);
    }
}
