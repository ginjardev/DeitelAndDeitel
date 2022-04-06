package testDrivenDevelopment;
import java.util.Scanner;
public class AccountMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Account userAccount = new Account();
        int pin = userAccount.pin;

        String userPrompt = """
                Hello Customer, 
                Welcome to Mavens MicroFinance bank. 
                -> Enter 1 to check account balance.
                -> Enter 2 to make deposit. 
                -> Enter 3 to withdraw.
                -> Enter 4 to exit ATM.
                """;
        String continuePrompt = """
                Do you wish to perform another transaction?
                1. check balance 2. deposit 3. withdraw 4. exit
                """;

        for(int counter = 2; counter >= 0; counter--){
            System.out.println("Welcome dear customer, please enter your pin");
            int userPin = userInput.nextInt();
            if(userPin == pin){
                System.out.println(userPrompt);
                int userOption = 0;
                for(counter = 1; userOption != 4; counter--) {

                    System.out.println("Enter a number");
                    userOption = userInput.nextInt();

                    switch (userOption) {
                        case 1:
                            System.out.println("Your balance is " + userAccount.getBalance());
                            System.out.println(continuePrompt);
                            break;
                        case 2:
                            System.out.println("Enter amount to deposit");
                            double amount = userInput.nextDouble();
                            userAccount.deposit(amount);
                            System.out.println("Your available balance after deposit is " + userAccount.getBalance());
                            System.out.println(continuePrompt);
                            break;
                        case 3:
                            System.out.println("Enter pin to continue withdrawal");
                            userPin = userInput.nextInt();
                            System.out.println("Enter amount to withdraw");
                            amount = userInput.nextDouble();
                            userAccount.withdraw(amount,userPin);
                            if(pin == userPin){
                                System.out.println("Withdrawal successful");
                                System.out.println("Your new balance is " + userAccount.getBalance());
                            }
                            System.out.println(continuePrompt);
                            break;
                        case 4:
                            System.out.println("Thank you for banking with us, bye!");
                        default:
                            if(userOption == 4){
                            } else{
                                System.out.println("Enter 1, 2, 3 or 4 to exit!!!");
                            }

                    }
                }
            } else{
                System.out.println("Try again. you have " + counter + " chances left");
            }
        }

    }
}
