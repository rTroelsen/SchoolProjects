
public class Copier {
    private int paper;
    private boolean paperStuck = false;

    public Copier(int paper) {
        this.paper = paper;
    }

    public void insertPaper(int paper) {
        if (this.paper + paper <= 500) {
            this.paper += paper;
        }
        else {
            System.out.println("Paper overflow!");
        }
    }

    public int getPaper() {
        return paper;
    }

    public void makeCopy() {
        if (!this.paperStuck) {
            if (this.paper <= 0) {
                
                System.out.println("Papertray empty");
            }
            else {
                this.paper--;
                
            }
        }
        else {
            System.out.println("Paper is stuck, fix the jam!");
        }
    }
    
    public void makeCopy(int paper) {
        if (!this.paperStuck) {
            if (this.paper <= 0) {
                
                System.out.println("Papertray empty!");
            }
            else {
                this.paper -= paper;
            }
        }
        else {
            System.out.println("Paper is stuck, fix the jam!");
        }
    }
    
    public void makePaperJam() {
        this.paperStuck = true;
    }
    
    public void fixJam() {
        this.paperStuck = false;
        System.out.println("The jam was fixed!");
    }

}
