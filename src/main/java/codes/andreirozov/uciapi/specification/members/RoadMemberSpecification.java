package codes.andreirozov.uciapi.specification.members;

import codes.andreirozov.uciapi.entity.members.RoadMember;
import org.springframework.data.jpa.domain.Specification;

public class RoadMemberSpecification {

    public static Specification<RoadMember> withFunction(String function) {
        return (root, query, cb) -> (function == null || function.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("function"), function);
    }

    public static Specification<RoadMember> withGender(String gender) {
        return (root, query, cb) -> (gender == null || gender.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("gender"), gender);
    }

    public static Specification<RoadMember> withCategory(String category) {
        return (root, query, cb) -> (category == null || category.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("teamCategory"), category);
    }

    public static Specification<RoadMember> withCountry(String country) {
        return (root, query, cb) -> (country == null || country.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("country"), country);
    }

    public static Specification<RoadMember> withContinent(String continent) {
        return (root, query, cb) -> (continent == null || continent.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("continent"), continent);
    }

    public static Specification<RoadMember> withTeamCode(String teamCode) {
        return (root, query, cb) -> (teamCode == null || teamCode.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("teamCode"), teamCode);
    }

    public static Specification<RoadMember> withTeamName(String teamName) {
        return (root, query, cb) -> (teamName == null || teamName.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("teamName"), teamName);
    }

    public static Specification<RoadMember> withYear(String year) {
        return (root, query, cb) -> (year == null || year.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("year"), year);
    }

}
