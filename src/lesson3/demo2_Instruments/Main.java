package lesson3.demo2_Instruments;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument>instruments=new ArrayList<>();
        instruments.add(new Guitar(6));
        instruments.add(new Drums(2));
        instruments.add(new Trumpet(33));
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
