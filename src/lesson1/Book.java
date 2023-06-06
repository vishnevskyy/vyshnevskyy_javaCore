package lesson1;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Book {
    String title;
    int pages;
    ArrayList<String> authors =new ArrayList<>();

    String genre;

}
