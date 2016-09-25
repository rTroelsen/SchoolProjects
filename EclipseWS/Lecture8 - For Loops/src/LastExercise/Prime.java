package LastExercise;

class Prime {
    public static void main(String[] args) {
        int input = 50;
        int i = 0;
        int num = 0;
        //Empty String
        String primeNumbers = "";

        for (i = 1; i <= input; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + "\n";
            }
        }
        System.out.println(primeNumbers);
    }
}