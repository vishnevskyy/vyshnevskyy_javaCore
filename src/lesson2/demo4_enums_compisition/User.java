package lesson2.demo4_enums_compisition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    ArrayList<Skill> skills;
    Car car;

    public User(int id, String name, String surname, String email, int age, Gender gender, ArrayList<Skill> skills,String model, int year, int power) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(model,year,power);
    }
}
