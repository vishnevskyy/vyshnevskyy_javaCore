package lesson4_part2.demo1_zooshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    public String name;
    public List<Pet> pets;
}
