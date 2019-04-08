public class Main {

    public static void main(String[] args) {
//        Human first = new Human("Denys", "Dubovskyy", 19);
//        System.out.println("Hello World!");
//        System.out.println(first.getAge());
//        first.MakeMeOlder(); // CALLING A METHOD FROM CLASS "HUMAN"
//        System.out.println(first.getAge());
//        first.MakeMeOlder();
//        System.out.println(first.getAge());



        Gym first = new Gym("CityFit", "Poznan", 2, "Cardio", "Strength", 1232);
        System.out.println(first.getNumberOfInventory());
        first.addInventory(2);
        System.out.println(first.getNumberOfInventory());



    }
}
