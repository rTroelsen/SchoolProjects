package Exercises;

import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What did the dinner cost?");
        double initialPay = scan.nextDouble();
        System.out.println("Tell us how satisfied you where with your dinner! \n"
            + "1. Much satisfied! \n"
            + "2. It vas einer OK! \n"
            + "3. So bad, 9x perma");
        int satisfaction = scan.nextInt();
        
        if (satisfaction == 1) {
            initialPay *= 1.20;
        }
        else if (satisfaction == 2) {
            initialPay *= 1.15;
        }
        else if (satisfaction == 3) {
            initialPay *= 1.10;
        }
        else {
            System.out.println("Hvad snakker du om mongolunge?");
        }
        System.out.println(initialPay);
    }

}
