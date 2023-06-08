package lesson2.demo4_enums_compisition;

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
