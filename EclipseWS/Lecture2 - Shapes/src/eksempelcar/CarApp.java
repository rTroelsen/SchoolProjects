package eksempelcar;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("VW UP", "White");
        System.out.println(myCar.getBrand());
        myCar.setRegistrationNumber("AB 11 123");
        System.out.println(myCar.getRegistrationNumber());

        Car smyCar = new Car("Ford Escort", "Black");
        System.out.println(smyCar.getBrand());
        smyCar.setRegistrationNumber("AD 12 325");
        System.out.print(smyCar.getRegistrationNumber());
        smyCar.setKm(9001);
        System.out.println(" har kørt " + smyCar.getKm());

    }

}
