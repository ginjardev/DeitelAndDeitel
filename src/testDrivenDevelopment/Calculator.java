package testDrivenDevelopment;

public class Calculator {


    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double numerator, double denominator) {
        if(denominator == 0){
            return 0;
        }
        return numerator/denominator;
    }

    public int subtract(int firstNumber, int secondNumber) {
        if(firstNumber < secondNumber){
            return secondNumber - firstNumber;
        }
        return firstNumber - secondNumber;
    }
}
