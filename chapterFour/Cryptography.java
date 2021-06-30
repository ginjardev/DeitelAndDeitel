package chapterFour;

public class Cryptography {
    public String encryptNumber(int number){
        //separate digits
        int firstNumber = number/1000;
        int secondNumber = (number%1000)/100;
        int thirdNumber = (number%100)/10;
        int fourthNumber = number%10;

        //encrypt digits
        firstNumber = (firstNumber + 7)%10;
        secondNumber = (secondNumber + 7)%10;
        thirdNumber = (thirdNumber + 7)%10;
        fourthNumber = (fourthNumber + 7)%10;

        //swap digits
        return swapNumbers(firstNumber, secondNumber, thirdNumber, fourthNumber);
    }

    private String swapNumbers(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int swapOne = firstNumber;
        int swapTwo = secondNumber;
        int swapThree = thirdNumber;
        int swapFour = fourthNumber;

        thirdNumber = swapOne;
        firstNumber = swapThree;
        fourthNumber = swapTwo;
        secondNumber = swapFour;

        return firstNumber +""+secondNumber+""+thirdNumber+""+fourthNumber;
    }

    public String decryptNumber(int number){
        int firstNumber = number/1000;
        int secondNumber = (number%1000)/100;
        int thirdNumber = (number%100)/10;
        int fourthNumber = number%10;

        firstNumber = ((firstNumber - 7)+10)%10;
        secondNumber = ((secondNumber - 7)+10)%10;
        thirdNumber = ((thirdNumber - 7)+10)%10;
        fourthNumber = ((fourthNumber - 7)+10)%10;

        return swapNumbers(firstNumber, secondNumber, thirdNumber, fourthNumber);

    }

    public static void main(String[] args) {
        Cryptography cryptography = new Cryptography();
        System.out.println(cryptography.encryptNumber(5678));
        System.out.println(cryptography.decryptNumber(4523));
    }
}
