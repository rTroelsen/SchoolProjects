package classes;

import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Indtast A: ");
        double a = scan.nextDouble();
        System.out.print("Indtast B: ");
        double b = scan.nextDouble();
        System.out.print("Indtast C: ");
        double c = scan.nextDouble();

        if (a > b && b > c) {
            System.out.println("Number are decreasing!");
        }
        else if (a < b && b < c) {
            System.out.println("Number are increasing!");
        }
        else {
            System.out.println("Number are neither increasing nor decreasing!");
        }
    }
}
