package lesson4_part1.demo1_UserListSort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        users.add(new User("Vanya",24));
        users.add(new User("Sashaaa",22));
        users.add(new User("Kolyaa",23));
        users.add(new User("Petyaaaa",21));

        users.sort((o1, o2) ->o1.age-o2.age);
        for (User user : users) {
            System.out.println(user);
        }
        users.sort((o1, o2) ->o2.age-o1.age);

        for (User user : users) {
            System.out.println(user);
        }
        users.sort((o1, o2) -> o1.name.length()-o2.name.length());
        for (User user : users) {
            System.out.println(user);
        }
        users.sort((o1, o2) -> o2.name.length()-o1.name.length());
        for (User user : users) {
            System.out.println(user);
        }
    }
}
