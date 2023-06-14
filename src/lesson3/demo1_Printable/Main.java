package lesson3.demo1_Printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Printable magazine=new Magazine();
        Printable book=new Book();
        ArrayList<Printable> list= new ArrayList<>();
        list.add(new Book(232,"dwaad"));
        list.add(new Magazine("eawd",true));
        for (Printable printable : list) {
            printable.print();
        }
    }
}
