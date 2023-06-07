package lesson2.demo1_Composition_Agregation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Worker {
    public int id;
    public String name;
    public String username;
    public String email;
    public String phone;
    public String website;
    public Adress adress;
    public Company company;

    public Worker(String name, String phone,Adress adress,Company company) {
        this.name = name;
        this.phone = phone;
        this.adress=adress;
        this.company=company;
    }
}
