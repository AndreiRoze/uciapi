package codes.andreirozov.uciapi.specification.members;

import codes.andreirozov.uciapi.entity.members.MtbMember;
import org.springframework.data.jpa.domain.Specification;

public class MtbMemberSpecification {

    public static Specification<MtbMember> withFunction(String function) {
        return (root, query, cb) -> (function == null || function.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("function"), function);
    }

    public static Specification<MtbMember> withGender(String gender) {
        return (root, query, cb) -> (gender == null || gender.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("gender"), gender);
    }

    public static Specification<MtbMember> withCategory(String category) {
        return (root, query, cb) -> (category == null || category.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("teamCategory"), category);
    }

    public static Specification<MtbMember> withCountry(String country) {
        return (root, query, cb) -> (country == null || country.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("country"), country);
    }

    public static Specification<MtbMember> withContinent(String continent) {
        return (root, query, cb) -> (continent == null || continent.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("continent"), continent);
    }

    public static Specification<MtbMember> withTeamCode(String teamCode) {
        return (root, query, cb) -> (teamCode == null || teamCode.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("teamCode"), teamCode);
    }

    public static Specification<MtbMember> withTeamName(String teamName) {
        return (root, query, cb) -> (teamName == null || teamName.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("teamName"), teamName);
    }

    public static Specification<MtbMember> withYear(String year) {
        return (root, query, cb) -> (year == null || year.isEmpty()) ? cb.isTrue(cb.literal(true)) : cb.equal(root.get("year"), year);
    }
}
