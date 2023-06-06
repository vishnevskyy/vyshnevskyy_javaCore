package lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("tesla", 111, 2, true);
        System.out.println(car1);

        ArrayList<String> authors = new ArrayList<>();
        authors.add("John Doe");
        authors.add("Steven King");
        Book book1 = new Book("dwada", 231, authors, "dawd");
        System.out.println(book1);

        Dog dog1 = new Dog("kokos", 2, "developer");
        System.out.println(dog1);

        Post post1 = new Post(1, 1, "dwadawdawdawd", "dwadawdada");
        System.out.println(post1);

        Comment comment1 = new Comment(1, 1, "dawda", "dwadawd", "dawa");
        System.out.println(comment1);
    }
}
