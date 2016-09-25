package classes;

public class Program {

    public static void main(String[] args) {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";
        String ord3 = ord1 + ord2.toLowerCase();
        
        System.out.println(ord1.toUpperCase()); // Alt til uppercase bogstaver
        System.out.println(ord2.toLowerCase()); // Alt til lowercase bogstaver
        System.out.println(ord1 + " " + ord2); // sammensætter ord1 og ord2 med en spacestring i mellem
        System.out.println(ord3); // printer ord3
        System.out.println(ord3.length()); // Printer længden på ord3
        System.out.println(ord3.substring(0, 7)); // Printer de første 7 bogstaver af ord3
        System.out.println(ord2.substring(3, 7)); // printer fra bogstav 3 til og uden 7 - 4
        System.out.println(ord3.substring(ord3.length() / 2, ord3.length())); // printer sidste halvdel af ord3
    }

}
