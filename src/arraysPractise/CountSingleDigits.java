package arraysPractise;

public class CountSingleDigits {
    static final int SIZE = 100;
    static final int RANGE = 10;
    public static void main(String[] args) {

        int[] randomNumbers = new int[SIZE];
        int[] occurrence = new int[RANGE];
        // generate random numbers 0-9
        for (int i = 0; i < randomNumbers.length; i++) {
            int num = (int)(Math.random() * RANGE);
            randomNumbers[i] = num;
            occurrence[num]++;
        }

        for (int i = 0; i < randomNumbers.length; i++) {

            System.out.print(randomNumbers[i] + " ");
            if ((i + 1) % 10 == 0) System.out.println("");
        }

        System.out.println("---------------------------");
        for (int i = 0; i < occurrence.length; i++) {
            System.out.println("Occurrences for "+ i + " = " + occurrence[i]);
        }

    }
}
