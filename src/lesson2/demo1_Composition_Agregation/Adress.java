package lesson2.demo1_Composition_Agregation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Adress {
    String street;
    String suite;
    String city;
    String zipcode;

    public Adress(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
