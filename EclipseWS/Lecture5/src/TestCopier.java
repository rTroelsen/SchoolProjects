
public class TestCopier {

    public static void main(String[] args) {
        Copier copy = new Copier(10);
        copy.makePaperJam();
        copy.makeCopy();
        copy.fixJam();
        copy.makeCopy(2);
        copy.insertPaper(500);
        System.out.println(copy.getPaper());
        
    }

}
