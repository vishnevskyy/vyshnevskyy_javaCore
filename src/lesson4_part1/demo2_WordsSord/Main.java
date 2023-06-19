package lesson4_part1.demo2_WordsSord;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Word> words=new ArrayList<>();
        words.add(new Word("ddadawdawda"));
        words.add(new Word("cdadawdawda"));
        words.add(new Word("aadawdawda"));
        words.add(new Word("edadawdawda"));
        words.add(new Word("bdadawdawda"));
        words.add(new Word("idadawdawda"));
        words.add(new Word("hdadawdawda"));
        words.add(new Word("gdadawdawda"));
        words.add(new Word("fdadawdawda"));
        words.sort(Comparator.comparing(Word::getName));
        System.out.println(words);
    }
}
