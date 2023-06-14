package lesson3.demo2_Instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trumpet implements Instrument {
    private int di;
    @Override
    public void play() {
        System.out.println("Trumpet plays with" + this.toString());
    }
}
