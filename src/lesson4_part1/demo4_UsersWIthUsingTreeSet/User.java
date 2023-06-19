package lesson4_part1.demo4_UsersWIthUsingTreeSet;

import lesson2.demo4_enums_compisition.Car;
import lesson2.demo4_enums_compisition.Gender;
import lesson2.demo4_enums_compisition.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User>{
    int id;
String name;
String surname;
String email;
int age;
Gender gender;
ArrayList<Skill> skills;
Car car;
    public User(int id, String name, String surname, String email, int age, Gender gender, ArrayList<Skill> skills, String model, int year, int power) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(model,year,power);
    }

    @Override
    public int compareTo(User o) {
        return this.skills.size()-o.skills.size();
    }
}
