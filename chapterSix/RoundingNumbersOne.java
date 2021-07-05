package chapterSix;

public class RoundingNumbersOne {

    public static void mathFloorRound(double number){
        double y = 0;
        y = Math.floor(number + 0.5);
        System.out.printf("Original number is %.2f and rounded Number is %.2f\n",number, y );
    }
    public static void main(String[] args) {

        mathFloorRound(12.60);
        mathFloorRound(11.3);
        mathFloorRound(84.6);
        mathFloorRound(0.45);
        mathFloorRound(124.45);
    }
}
