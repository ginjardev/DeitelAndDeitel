package chapterFour;

public class Palindromes {
    public void checkPalindrome(int number){
        if(number / 10000 < 1){
            System.out.println(number + " is not a palindrome");
        } else if(number / 10000 > 9){
            System.out.println(number + " is not a palindrome");
        }
        int firstNumber = number / 10000;
        int secondNumber = (number % 10000)/1000;
        int thirdNumber = (number%1000)/100;
        int fourthNumber = (number%100)/10;
        int fifthNumber = number%10;

        if(firstNumber == fifthNumber){
            if(secondNumber == fourthNumber){
                System.out.println(number + " is a palindrome");
            }
        }
    }

    public static void main(String[] args) {
        Palindromes palindromes = new Palindromes();
        palindromes.checkPalindrome(11611);
    }
}
