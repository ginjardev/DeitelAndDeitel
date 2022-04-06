package testDrivenDevelopment;
public class Account {
    public double balance = 2000;
    public int pin = 1229;


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0.00) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount,int userPin) {
        if (pin == userPin) {
            if (balance > amount){
                balance = balance - amount;
            }
        } else {
            System.out.println("Wrong pin! You can't withdraw try again.");
        }
    }
}
