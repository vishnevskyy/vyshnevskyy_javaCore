package lesson3.demo2_Instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guitar implements Instrument{
    private int strings;
    @Override
    public void play() {
        System.out.println("Guitar plays with" +this.toString());
    }
}
