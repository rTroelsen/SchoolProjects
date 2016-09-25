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
            for (int stars = 10; stars > row; stars--) {
                System.out.print(" ");
            }
            for (int spaces = 1; spaces <= row; spaces++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void starPictureC() {
        for (int row = MAX_ROWS; row >= 1; row--) {
            for (int stars = 10; stars > row; stars--) {
                System.out.print(" ");
            }
            for (int spaces = 1; spaces <= row; spaces++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void starPictureD() {
        {
            
            for (int row = 1; row <= MAX_ROWS / 2; row++) {
                for (int space = row; space < MAX_ROWS / 2; space++) {
                    System.out.print(" ");
                }
                for (int star = 1; star < (row * 2); star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            for (int row = 5; row >= 1; row--) {
                for (int space = 5; space > row; space--) {
                    System.out.print(" ");
                }
                for (int star = 1; star < (row * 2); star++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
