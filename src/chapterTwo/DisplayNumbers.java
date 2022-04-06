package chapterTwo;

public class DisplayNumbers {
    public static void main(String[] args) {
        int number1 = 1,
                number2 = 2,
                number3 = 3,
                number4 = 4;

        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4);
        System.out.print(number1 + " " + number2 + " " + number3 + " " + number4 + "\n");
        System.out.printf("%d %d %d %d", number1, number2, number3, number4);
    }
}
