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

    public Worker(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Worker(int id,
                  String name,
                  String street,
                  String suite,
                  String city,
                  String zipcode,
                  String companyName,
                  String catchPhrase,
                  String bs
    ) {
        this.id = id;
        this.name = name;
        this.adress = new Adress(street,suite,city,zipcode);
        this.company = new Company(companyName,catchPhrase,bs);
    }
}
