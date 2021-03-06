package classes.employee;

public class TestApp {
    
    public static void main(String[] args) {
        Employee emp = new Employee("Kristian", "Dorland", 32);
        Employee mig = new Employee("Rasmus", "Troelsen", 23);
        System.out.println(emp.getName());

        emp.setName("Christian");
        System.out.print(emp.getName());
        System.out.println(emp.getSurname());

        emp.setAge(32);
        System.out.println(emp.getAge());

        System.out.println(mig.getName() + mig.getAge());
        emp.increaseAgeByOne(23);
        System.out.println(emp.getAge());
        
        emp.printEmployee();
        
    }
    
}
