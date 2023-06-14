package lesson3.demo1_Printable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Printable {
    int pagesCount;
    String title;

    @Override
    public void print() {
        System.out.println(this.title + "  -  " + this.pagesCount);
    }
}
