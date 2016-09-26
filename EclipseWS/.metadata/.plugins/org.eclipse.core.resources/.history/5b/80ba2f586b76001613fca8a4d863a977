package classes.employee;

/**
 * Klasse der beskriver en ansat.
 */
public class Employee {
    /**
     * Attributter der beskriver den ansattes tilstand
     */
    private String name;
    private boolean trainee;
    private int age;
    private String surname;
    
    /**
     * Constructor, når den ansatte oprettes, skal den have et navn. Ved
     * oprettelse er den ansatte en trainee
     */
    public Employee(String inputName, String inputSurname, int inputAge) {
        this.name = inputName;
        this.trainee = true;
        this.age = inputAge;
        this.surname = inputSurname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void increaseAgeByOne(int newAge) {
        this.age += 1;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int inputAge) {
        this.age = inputAge;
    }
    
    /**
     * Den ansattes navn kan ændres ved kald af setName metoden
     */
    public void setName(String inputName) {
        this.name = inputName;
    }
    
    /**
     * Man kan få oplyst den ansattes navn, ved at kalde metoden getName
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Den ansatte kan få ændret trainee status ved at kalde metoden setTrainess
     */
    public void setTrainee(boolean trainee) {
        this.trainee = trainee;
    }
    
    /**
     * Man kan få oplyst den ansatte er trainess aktivitet, ved at kalde metoden
     * isTrainee
     */
    public boolean isTrainee() {
        return this.trainee;
    }
    
    @Override
    public String toString() {
        return this.name + " is trainee: " + this.trainee;
    }
    
    public void printEmployee() {
        System.out.println("*******************");
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Age: " + this.age);
        System.out.println("Trainee: " + this.trainee);
        System.out.println("*******************");
    }
}
