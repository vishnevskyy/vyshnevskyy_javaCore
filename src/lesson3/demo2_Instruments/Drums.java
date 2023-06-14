package lesson3.demo2_Instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drums implements Instrument {
     private int size;
    @Override
    public void play() {
        System.out.println("Drums plays with" +this.toString());
    }
}
