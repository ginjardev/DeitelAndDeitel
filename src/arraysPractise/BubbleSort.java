package arraysPractise;

public class BubbleSort {
    public static void bubbleSort(double[] numbers) {

        boolean change;
        do {
            change = false;
            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    change = true;
                }
            }

        } while (change);

    }

    public static void main(String[] args) {
        double[] randomNumbers = {4, 7,9, 19, 2, 5, 1, 45};

        bubbleSort(randomNumbers);

        for (double elem: randomNumbers) {
            System.out.print(elem + " ");
        }
    }

}
