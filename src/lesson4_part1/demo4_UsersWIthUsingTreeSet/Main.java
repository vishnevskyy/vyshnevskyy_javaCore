package lesson4_part1.demo4_UsersWIthUsingTreeSet;

import lesson2.demo4_enums_compisition.Gender;
import lesson2.demo4_enums_compisition.Skill;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<Skill> skills=new ArrayList<>();
        skills.add( new Skill("java",23));
        skills.add( new Skill("html",10));

        ArrayList<Skill> skills2=new ArrayList<>();
        skills2.add( new Skill("java",23));
        skills2.add( new Skill("html",10));
        skills2.add( new Skill("js",10));

        ArrayList<Skill> skills3=new ArrayList<>();
        skills3.add( new Skill("java",23));
        skills3.add( new Skill("html",10));
        skills3.add( new Skill("js",10));
        skills3.add( new Skill("Python",10));

        Set<User> users=new TreeSet<>();
        users.add( new User(0,"wdad","dwada","dwadwad",20, Gender.MALE,skills,"dwad",2003,200));
        users.add( new User(1,"wdad","dwada","dwadwad",20, Gender.FEMALE,skills,"dwad",2003,200));
        users.add( new User(2,"wdad","dwada","dwadwad",20, Gender.MALE,skills3,"dwad",2003,200));
        users.add( new User(3,"wdad","dwada","dwadwad",20, Gender.FEMALE,skills2,"dwad",2003,200));
        users.add( new User(4,"wdad","dwada","dwadwad",20, Gender.MALE,skills,"dwad",2003,200));
        users.add( new User(5,"wdad","dwada","dwadwad",20, Gender.MALE,skills3,"dwad",2003,200));
        users.add( new User(6,"wdad","dwada","dwadwad",20, Gender.MALE,skills3,"dwad",2003,200));
        users.add( new User(7,"wdad","dwada","dwadwad",20, Gender.MALE,skills2,"dwad",2003,200));
        users.add( new User(8,"wdad","dwada","dwadwad",20, Gender.MALE,skills3,"dwad",2003,200));
        users.add( new User(9,"wdad","dwada","dwadwad",20, Gender.FEMALE,skills,"dwad",2003,200));
        System.out.println(users);
    }
}
