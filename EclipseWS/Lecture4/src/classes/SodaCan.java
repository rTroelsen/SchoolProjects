package classes;

public class SodaCan {

    double height;
    double diameter;
    
    public SodaCan(double height, double diameter) {
        this.height = height;
        this.diameter = diameter;
    }
    
    public double getVolume() {
        return Math.pow((diameter / 2), 2) * Math.PI * height;
    }

    public double getSurfaceArea() {
        return ((Math.pow((diameter / 2), 2) * Math.PI) * 2)
            + (2 * Math.PI * (diameter / 2) * height);
    }

}
