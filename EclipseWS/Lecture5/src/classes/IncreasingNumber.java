package classes;

import java.util.Scanner;

public class IncreasingNumber {
    private int a;
    private int b;
    private int c;
    Scanner scan = new Scanner(System.in);

    public IncreasingNumber(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void setNumbers() {
        this.a = scan.nextInt();
        this.b = scan.nextInt();
        this.c = scan.nextInt();
    }

    public void isIncreasing() {
        System.out.println("Numbers are increasing");
    }

    public void isDecreasing() {
        System.out.println("Numbers are decreasing");
    }

    public void isNeither() {
        System.out.println("Is neither increasing nor decreasing");
    }

}