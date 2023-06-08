package lesson2.demo4_enums_compisition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Skill> skills=new ArrayList<>();
        skills.add( new Skill("java",23));
        skills.add( new Skill("html",10));
        User user=new User(1,"wdad","dwada","dwadwad",20,Gender.MALE,skills,"dwad",2003,200);
        System.out.println(user);
    }
}
