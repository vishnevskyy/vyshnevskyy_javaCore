package lesson4_part1.demo3_UsersWithUsingHashSet;

import lesson2.demo4_enums_compisition.Gender;
import lesson2.demo4_enums_compisition.Skill;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Skill> skills=new ArrayList<>();
        skills.add( new Skill("java",23));
        skills.add( new Skill("html",10));

        HashSet<User> users=new HashSet<>();
        users.add( new User(0,"wdad","dwada","dwadwad",20, Gender.MALE,skills,"dwad",2003,200));
        users.add( new User(1,"wdad","dwada","dwadwad",20, Gender.FEMALE,skills,"dwad",2003,200));
        users.add( new User(2,"wdad","dwada","dwadwad",20, Gender.MALE,skills,"dwad",2003,200));
        users.add( new User(3,"wdad","dwada","dwadwad",20, Gender.FEMALE,skills,"dwad",2003,200));
        users.add( new User(4,"wdad","dwada","dwadwad",20, Gender.MALE,skills,"dwad",2003,200));
        users.add( new User(5,"wdad","dwada","dwadwad",20, Gender.MALE,skills,"dwad",2003,200));
        users.add( new User(6,"wdad","dwada","dwadwad",20, Gender.MALE,skills,"dwad",2003,200));
        users.add( new User(7,"wdad","dwada","dwadwad",20, Gender.MALE,skills,"dwad",2003,200));
        users.add( new User(8,"wdad","dwada","dwadwad",20, Gender.MALE,skills,"dwad",2003,200));
        users.add( new User(9,"wdad","dwada","dwadwad",20, Gender.FEMALE,skills,"dwad",2003,200));
//        System.out.println(users);
//        users.removeIf(user -> user.gender==Gender.MALE);
//        System.out.println(users);

    }
}
