package lesson3.demo1_Printable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable{
    String name;
    boolean bleached;
    @Override
    public void print() {
        System.out.println(this.name + "  -  " + this.bleached);

    }
}
