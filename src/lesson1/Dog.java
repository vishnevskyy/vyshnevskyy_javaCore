package lesson1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Dog {
    String name;
    int age;
    String poroda;
}
