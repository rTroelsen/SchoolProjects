package stars;

public class Stars {
    final int MAX_ROWS = 10;
    
    public void starPicture() {
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void starPictureA() {
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 10; star >= row; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void starPictureB() {
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 10; star >= row; star++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    
    public void starPictureC() {
        // TODO
    }
    
    public void starPictureD() {
        // TODO
    }
}
