package lesson2.demo1_Composition_Agregation;

public class Main {
    public static void main(String[] args) {
        // Composition works wen u create secondary class outdoors your main creation class
        Adress adress = new Adress("wdwadaw", "dwadawd", "dwadwadaw", "dawdawd");

        Company company = new Company("dawda", "wdad", "dwad");

        Worker worker = new Worker(1, "dwadawda", "dwadawdwa", "dwadwadad", "dwadwadawd", "dwadawdad", adress, company);
        System.out.println(worker);
        // Composition
        // Agregation when u release your secondary class inside class creation
        Worker worker1 = new Worker(1, "dwadawda", "dwadawdwa", "dwadwadad", "dwadwadawd", "dwadawdad", "dwadad", "dwadawdw", "dawdaw");
        System.out.println(worker1);
    }
}

