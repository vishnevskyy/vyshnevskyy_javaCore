package lesson4_part1.demo4_UsersWIthUsingTreeSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    @NonNull
    String title;
    @NonNull
    int exp;
}
