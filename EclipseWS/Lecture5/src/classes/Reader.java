package classes;

import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (scan.hasNextDouble()) {
            double var = scan.nextDouble();
            if (var < 0) {
                System.out.println("Negative");
            }
            else if (var > 0) {
                System.out.println("Positive");
            }
            else {
                System.out.println("0");
            }
            scan.close();
        }
        else {
            System.out.println("That's not a number, fool");
            scan.close();
        }
    }
    
}
