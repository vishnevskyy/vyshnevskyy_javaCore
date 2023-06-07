package lesson2.demo1_Composition_Agregation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.event.WindowStateListener;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Company {
    String name;
    String catchPhrase;
    String bs;

    public Company(String name, String catchPhrase) {
        this.name = name;
        this.catchPhrase = catchPhrase;
    }
}
