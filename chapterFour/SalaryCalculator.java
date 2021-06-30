package chapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    private int grossPay;

    public void workerGrossPay(int hoursWorked, int hourlyPay){
        if(hoursWorked <= 40){
            grossPay = hoursWorked * hourlyPay;
        }else {
            int excessHours = hoursWorked - 40;
            int newGross = (hourlyPay/2) * excessHours;
            grossPay = (40 * hourlyPay) + newGross;
        }
        System.out.println("Your gross pay is " + grossPay);
    }

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(counter < 3){
            System.out.println("Enter the number of hours worked: ");
            int hoursWorked = scanner.nextInt();
            System.out.println("Enter your hourly pay: ");
            int hourlyPay = scanner.nextInt();
            salaryCalculator.workerGrossPay(hoursWorked, hourlyPay);
            counter++;
        }
    }
}
