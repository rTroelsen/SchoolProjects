package Lecture1;

public class P28 {
    
    public static void main(String[] args) {
        int distance = 15;
        int eficiency = 16;
        int gas = 4;
        double mile = 1.05;
        
        int resultb = 20;
        double result = ((distance / eficiency) * gas) + (mile * distance);

        if (resultb < result) {
            System.out.println("Car");
        }

        if (resultb > result) {
            System.out.println("Train");
        }
        if (result == resultb) {
            System.out.println("Either");
        }
    }
}
