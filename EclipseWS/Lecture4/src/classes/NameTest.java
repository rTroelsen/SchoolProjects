package classes;

public class NameTest {
    
    public static void main(String[] args) {
        Name name = new Name("Magrethe", "Henning", "Jørgensen");
        
        String first = name.getUserName();
        System.out.println(first);
        
        String second = name.getInitials();
        System.out.println(second);
    }
    
}
