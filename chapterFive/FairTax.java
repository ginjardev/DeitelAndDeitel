package chapterFive;

import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {
        double fairTax;
        double expenses;
        String prompt = """
                Hello enter,
                1 for Housing
                2 for Food
                3 for Clothing
                4 for Transportation
                5 for Education
                6 for Health Care
                7 for Vacations
                0 to Exit.
                
                """;
        String secondPrompt = """
                
                1 for Housing | 2 for Food | 3 for Clothing | 4 for Transportation
                5 for Education | 6 for Health Care | 7 for Vacations | 0 to Exit.
                """;

        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        while(userInput != 0){
            switch (userInput){
                case 1:
                    System.out.println("Enter your expenses: ");
                    expenses = scanner.nextDouble();
                    fairTax = expenses * 0.23;
                    System.out.printf("%s%.2f","Your Housing fair tax is ", fairTax);
                    System.out.println(secondPrompt);
                    userInput = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Enter your expenses: ");
                    expenses = scanner.nextDouble();
                    fairTax = expenses * 0.23;
                    System.out.printf("%s%.2f","Your Food fair tax is ", fairTax);
                    System.out.println(secondPrompt);
                    userInput = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Enter your expenses: ");
                    expenses = scanner.nextDouble();
                    fairTax = expenses * 0.23;
                    System.out.printf("%s%.2f","Your Clothing fair tax is ", fairTax);
                    System.out.println(secondPrompt);
                    userInput = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Enter your expenses: ");
                    expenses = scanner.nextDouble();
                    fairTax = expenses * 0.23;
                    System.out.printf("%s%.2f","Your Transportation fair tax is ", fairTax);
                    System.out.println(secondPrompt);
                    userInput = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Enter your expenses: ");
                    expenses = scanner.nextDouble();
                    fairTax = expenses * 0.23;
                    System.out.printf("%s%.2f","Your Education fair tax is ", fairTax);
                    System.out.println(secondPrompt);
                    userInput = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Enter your expenses: ");
                    expenses = scanner.nextDouble();
                    fairTax = expenses * 0.23;
                    System.out.printf("%s%.2f","Your Health Care fair tax is ", fairTax);
                    System.out.println(secondPrompt);
                    userInput = scanner.nextInt();
                    break;
                case 7:
                    System.out.println("Enter your expenses: ");
                    expenses = scanner.nextDouble();
                    fairTax = expenses * 0.23;
                    System.out.printf("%s%.2f","Your Vacation fair tax is ", fairTax);
                    System.out.println(secondPrompt);
                    userInput = scanner.nextInt();
                    break;
                default:
                    System.out.println("You enter the wrong input");
                    break;
            }
        }
    }
}
