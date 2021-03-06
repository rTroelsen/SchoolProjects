package classes;

public class Name {

    private String firstName;
    private String middleName;
    private String lastName;
    
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
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
    
    public String getInitials() {
        return this.firstName.substring(0, 1) + this.middleName.substring(0, 1)
            + this.lastName.substring(0, 1);
    }
    
    public String getUserName() {
        return this.firstName.substring(0, 2).toUpperCase() + this.middleName.length()
            + this.lastName.substring(this.lastName.length() - 2, this.lastName.length());
    }
}
