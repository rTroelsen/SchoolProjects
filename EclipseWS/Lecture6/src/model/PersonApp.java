package model;

public class PersonApp {
    
    public static void main(String[] args) {
        Person p = new Person("Rasmus", "Troelsen", 8, 3, 1983);
        p.printPerson();
        System.out.println("Initialer: " + p.getInit());
        System.out.println("Username: " + p.getUserName());
        
        System.out.println("Age: " + p.age(9, 19, 2016));
        // int year = 2014;
        // System.out.println("Er " + year + " skudår: " + p.leapYear(year));
        System.out.println(p.leapYear(2400));
        
    }
}
