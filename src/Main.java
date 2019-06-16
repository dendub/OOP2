import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //SCANNER
        Scanner in = new Scanner(System.in);
        System.out.println("Enter country of gymNetwork:" );
        String country=in.nextLine();
        System.out.println("Number of gyms: " );
        int numberOfGyms=Integer.parseInt(in.nextLine());
        System.out.println("Name of gym1: " );
        String gymName1=in.nextLine();
        System.out.println("Name of gym2: " );
        String gymName2=in.nextLine();
        System.out.println("Month income: " );
        int monthIncome=Integer.parseInt(in.nextLine());
        //        System.out.println("Name of the gym");
//        String name = in.nextLine();

        System.out.println("City: ");
        String cityAdress = in.nextLine();
        System.out.println("Name of the section1: ");
        String sectionName1 = in.nextLine();
        System.out.println("Name of the section2: ");
        String sectionName2 = in.nextLine();
        System.out.println("Number of inventory: ");
        int numberOfInventory = Integer.parseInt(in.nextLine());


        System.out.println("City gym1: ");
        String cityAdress1 = in.nextLine();
        System.out.println("Name of the section1 gym1: ");
        String sectionName11 = in.nextLine();
        System.out.println("Name of the section2 gym1: ");
        String sectionName12 = in.nextLine();
        System.out.println("Number of inventory gym1: ");
        int numberOfInventory1 = Integer.parseInt(in.nextLine());
        //GYM NETWORK DECLARATION
        GymNetwork net = new GymNetwork(country,numberOfGyms,gymName1,gymName2,monthIncome);


        //FIRST GYM
        Gym1 first = new Gym1(gymName1,gymName2,country, cityAdress,  sectionName1, sectionName2, numberOfInventory);
        System.out.println("Name of the gym: ");
        System.out.println(first.getGymName1());
        System.out.println("Country of the gym: ");
        System.out.println(first.getCountry());
        System.out.println("City where gym is placed: ");
        System.out.println(first.getCityAdress());
        System.out.println("Name of the section1: ");
        System.out.println(first.getSectionName1());
        System.out.println("Name of the section2: ");
        System.out.println(first.getSectionName2());
        System.out.println("Number of inventory: ");
        System.out.println(first.getNumberOfInventory());
        System.out.println("Number of gyms: ");
        System.out.println(first.getNumberOfGyms());

        //SECOND GYM
        Gym2 second = new Gym2(gymName1,gymName2,country, cityAdress1,sectionName11,sectionName12,numberOfInventory1);
        System.out.println("Name of the gym: ");
        System.out.println(second.getGymName2());
        System.out.println("Country of the gym: ");
        System.out.println(second.getCountry());
        System.out.println("City where gym is placed: ");
        System.out.println(second.getCityAdress1());
        System.out.println("Name of the section1: ");
        System.out.println(second.getSectionName11());
        System.out.println("Name of the section2: ");
        System.out.println(second.getSectionName12());
        System.out.println("Number of inventory: ");
        System.out.println(second.getNumberOfInventory1());
        System.out.println("Number of gyms: ");
        System.out.println(second.getNumberOfGyms());



    }
}




//    Gym first = new Gym("CityFit", "Poznan",2, "Cardio", "Strength", 1232);
//        System.out.println(first.getNumberOfInventory());
//                first.addInventory(2);
//                System.out.println(first.getNumberOfInventory());
//                first.addInventory(1);
//                System.out.println(first.getNumberOfInventory());
//                System.out.println(first.getNumberOfSections());
//                System.out.println(first.getNumberOfGyms());







//HUMAN

//        Human first = new Human("Denys", "Dubovskyy", 19);
//        System.out.println("Hello World!");
//        System.out.println(first.getAge());
//        first.MakeMeOlder(); // CALLING A METHOD FROM CLASS "HUMAN"
//        System.out.println(first.getAge());
//        first.MakeMeOlder();
//        System.out.println(first.getAge());




//STACK AND QUEUE

//        Stack test = new Stack();
//        test.pop();
//        test.push(12);
//        test.push(23);
//        test.push(123);
//        test.push(2);
//        test.push(124312);
//        test.pop();
//        System.out.println(test.pop());

//        Queue test = new Queue();
//        test.enqueu(0);
//        test.enqueu(4);
//        test.enqueu(21);
//
//        test.dequeue();
