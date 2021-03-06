package PersonExample;

public class Person {

    private String name;
    private String adress;
    private int monthlySalary;
    private int jobsWorked;
    
    public Person(String name, String adress, int monthlySalary) {
        this.name = name;
        this.adress = adress;
        this.monthlySalary = monthlySalary;

    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
    public int getMonthlySalary() {
        return this.monthlySalary;
    }

    public double getYearlySalary() {
        return this.monthlySalary * 12 * .5;
    }

    public void printPerson() {
        System.out.println(this.name);
        System.out.println(this.adress);
        System.out.println(this.monthlySalary);
    }
    
    public int getJobsWorked() {
        return this.jobsWorked;
        
    }
    
    public void setJobsWorked(int jobsWorked) {
        this.jobsWorked = jobsWorked;
    }
    
}
