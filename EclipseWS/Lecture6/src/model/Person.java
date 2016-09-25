package model;

/**
 * A person with three names and date of birth
 */
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int dayOfBirth; // 1..31
    private int monthOfBirth; // 1..12
    private int yearOfBirth; // 1900..2010
    
    /**
     * Constructor for objects of class Person
     */
    public Person(String firstName, String middleName, String lastName,
        int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public Person(String firstName, String lastName, int dayOfBirth, int monthOfBirth,
        int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void printPerson() {
        System.out.println(firstName + " " + middleName + " " + lastName + " "
            + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth);
        
    }
    
    public String getInit() {
        if (middleName == null) {
            return "" + firstName.substring(0, 2) + lastName.charAt(0);
        }
        
        return "" + firstName.charAt(0) + middleName.charAt(0)
            + lastName.charAt(0);
    }
    
    public String getUserName() {
        if (middleName == null) {
            return (firstName.substring(0, 2).toUpperCase()
                + Math.abs((firstName.length() - lastName.length()))
                + lastName.substring(lastName.length() - 2).toLowerCase());
        }
        String tekst1 = firstName.substring(0, 2).toUpperCase();
        String tekst2 = middleName.length() + "";
        String tekst3 = lastName.substring(lastName.length() - 2);
        return tekst1 + tekst2 + tekst3;
        
    }
    
    public int age(int dayToDay, int monthToDay, int yearToDay) {
        yearToDay = yearToDay - this.yearOfBirth;
        monthToDay = monthToDay - this.monthOfBirth;
        dayToDay = dayToDay - this.dayOfBirth;
        if (dayToDay < 0) {
            monthToDay--;
            dayToDay = 30 + dayToDay;
        }
        if (monthToDay < 0) {
            yearToDay--;
            monthToDay = 12 + monthToDay;
        }
        return yearToDay;
        
    }
    
    /**
     * Returns whether the year is a leap year
     */
    public boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        else if (year % 400 == 0) {
            return true;
        }
        return false;
    }

}