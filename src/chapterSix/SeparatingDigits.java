package chapterSix;

public class SeparatingDigits {
    //method a
    public static int integerDivision(int numberOne, int numberTwo){
        return numberOne/numberTwo;
    }
    //method b
    public static int remainderDivision(int numberOne, int numberTwo){
        return numberOne%numberTwo;
    }
    //method c
    public static void displayDigits(int number){
        if(number > 0 && number < 100000){
            int remainder = 0;
            String display = "";
            while(number >=1){
                remainder = remainderDivision(number,10);
                number = integerDivision(number, 10);
                display += remainder;
            }
            for (int i = display.length()-1; i >= 0; i--) {
               System.out.print(display.charAt(i) + " ");
            }
        }else{
            System.out.println("Enter a number less than 100,000");
        }
    }

    public static void main(String[] args) {
        displayDigits(2500);
    }
}
