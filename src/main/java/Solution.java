import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

class Solution {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate before = LocalDate.parse("1995-10-13", formatter);

    public String solution(String S) {
        return String.valueOf(
                Arrays.stream(S.split("\n")).filter(sub -> {
                            LocalDate date = LocalDate.parse(sub.substring(0, 10));
                            String owner = sub.substring(11, 17).trim();
                            return (date.isBefore(before) && owner.equals("root"));
                        }
                ).count()
        );
    }
}
