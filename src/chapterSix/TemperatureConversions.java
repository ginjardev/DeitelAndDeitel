package chapterSix;

import java.util.Scanner;

public class TemperatureConversions {
    //method (a)
    public static String celsius(double fahrenheit){
        if(fahrenheit >= 0){
            return  String.format("%.2f fahrenheit = %.2f celsius",fahrenheit,(5.0 / 9.0) * (fahrenheit - 32));
        }else{
            return "Enter a positive number \n";
        }
    }
    //method (b)
    public static String fahrenheit(double celsius){
        if(celsius >= 0){
            return String.format("%.2f celsius = %.2f fahrenheit",celsius,(9.0 / 5.0) * celsius + 32);
        }else{
            return "Enter a positive number \n";
        }
    }
    //method (c)
    public static void main(String ...args){
        Scanner scanner = new Scanner(System.in);
        String prompt = """
                Press 1 for Fahrenheit to Celsius conversion,
                Press 2 for Celsius to Fahrenheit conversion.
                """;
        String check = "yes";
        while(check.equals("yes")){
            System.out.println(prompt);
            int conversionType = scanner.nextInt();
            if(conversionType == 1){
                System.out.println("Enter a temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                System.out.println(celsius(fahrenheit));
            }else if(conversionType == 2){
                System.out.println("Enter a temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                System.out.println(fahrenheit(celsius));
            }
            System.out.println("Do you want to perform another temperature conversion? 'yes' or 'no'");
            check = scanner.next().toLowerCase();
        }
    }
}
