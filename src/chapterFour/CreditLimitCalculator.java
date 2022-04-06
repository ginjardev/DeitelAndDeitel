package chapterFour;

public class CreditLimitCalculator {

    private int startBalance;
    private int totalItemsCharged;
    private int totalCredit;
    private int accountNumber;
    private int creditLimit;


    public int getAccountNumber() {
        return  accountNumber;
    }

    public int getStartAccountBalance() {
        return startBalance;
    }

    public int getTotalItemsCharged() {
        return totalItemsCharged;
    }

    public int getCustomerCredit() {
        return totalCredit;
    }

    public int getCustomerCreditLimit() {
        return creditLimit;
    }

    public int getNewBalance() {
        return startBalance + totalItemsCharged - totalCredit;
    }

    public void totalItemsCharges(int totalCharge) {
        totalItemsCharged = totalCharge;
    }

    public void customerCredit(int customerCredit) {
        totalCredit = customerCredit;
    }

    public void customerStartBalance(int startBalance) {
        this.startBalance = startBalance;
    }

    public void setCustomerCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String creditLimitExceeded() {
        if(getNewBalance() < creditLimit)
            return "customer is within credit limit";
        else
            return "credit limit exceeded";
    }
}
