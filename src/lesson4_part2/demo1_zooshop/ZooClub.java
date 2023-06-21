package lesson4_part2.demo1_zooshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    public void addPersonToCLub(Person person, List<Pet> pets) {
        if (this.club.containsKey(person)) {
            System.out.println("This person is already added");
        } else {
            club.put(person, pets);
        }
    }

    public void addPetToPerson(Pet pet,Person person) {
        if (this.club.containsKey(person)){
            List<Pet> pets=this.club.get(person);
            pets.add(pet);
        }else {
            List<Pet> pets=new ArrayList<>();
            pets.add(pet);
            this.club.put(person,pets);
        }
    }
    public void removePetFromPerson(Pet pet,Person person){
        if (this.club.containsKey(person)){
            List<Pet> pets=this.club.get(person);
            pets.removeIf(pet1 -> pet1.equals(pet));
        }
    }
public void deletePerson(Person person){
        if (this.club.containsKey(person)){
            this.club.remove(person);
    }
}
public void  deletePetFromAll(Pet pet){
    for (Person person : club.keySet()) {
        List<Pet> pets=this.club.get(person);
        if (pets.contains(pet)){
            pets.remove(pet);
        }
    }
}
public void showAll(){
    for (Map.Entry<Person, List<Pet>> personListEntry : club.entrySet()) {
        System.out.println(personListEntry);
    }
}
}
