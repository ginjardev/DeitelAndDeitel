package chapterSix;

public class RoundingNumbersTwo {
    public static void roundToInteger(double number){
        double y = 0;
        y = Math.floor(number + 0.5);
        System.out.printf("Original number is %.2f and rounded integer Number is %.2f\n",number, y );
    }
    public static void roundToTenths(double number){
        double y = 0;
        y = Math.floor(number * 10 + 0.5)/10;
        System.out.printf("Original number is %.2f and rounded tenths Number is %.2f\n",number, y );
    }
    public static void roundToHundredths(double number){
        double y = 0;
        y = Math.floor(number * 100 + 0.5)/100;
        System.out.printf("Original number is %.2f and rounded hundredths Number is %.2f\n",number, y );
    }
    public static void roundToThousandths(double number){
        double y = 0;
        y = Math.floor(number * 1000 + 0.5)/1000;
        System.out.printf("Original number is %.2f and rounded thousandths Number is %.2f\n",number, y );
    }

    public static void main(String[] args) {
        roundToInteger(123.45);
        roundToTenths(123.45);
        roundToHundredths(123.45);
        roundToThousandths(123.45);
    }
}
