package Exercises;

import java.util.Scanner;

public class test {
    public double getPrice() {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Hva koster det?");
        double pris = scan.nextDouble();
        System.out.println("Hvor go var det?");
        int satis = scan.nextInt();
        
        if (satis == 1) {
            pris *= 1.2;
            System.out.println(pris);
            return pris;
        }
        else if (satis == 2) {
            pris *= 1.15;
            System.out.println(pris);
            return pris;
        }
        else if (satis == 3) {
            pris *= 1.10;
            System.out.println(pris);
            return pris;
        }
        else {
            return 0;
        }
    }
}