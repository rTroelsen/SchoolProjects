
public class Date {
    private int date;
    private int month;
    
    public String getSeason(int day, int month) {
        if ((month <= 0 || day <= 0) || (month > 12 || day > 31)) {
            return ("wut u talkin bout willis");
        }
        else if ((month > 0 && month <= 3) && day < 21) {
            return ("dis be winter mon'");
        }
        else if ((month > 0 && month <= 3) && day >= 21) {
            return ("it be spring mon'");
        }
        else if ((month > 3 && month <= 6) && day <= 21) {
            return ("dis be spring mon'");
        }
        else if ((month > 3 && month <= 6) && day >= 21) {
            return ("it be summer mon'");
        }
        else if ((month > 6 && month <= 9) && day <= 21) {
            return ("dis be summer mon'");
        }
        else if ((month > 6 && month <= 9) && day >= 21) {
            return ("it be fall mon'");
        }
        else if ((month > 9 && month <= 12) && day < 21) {
            return ("dis be fall mon'");
        }
        else {
            return ("it be winter mon'");
        }
    }
}
