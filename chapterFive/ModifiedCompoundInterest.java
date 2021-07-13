package chapterFive;

public class ModifiedCompoundInterest {

    int amount;
    public int compoundInterest(int principal, double rate, int year){
        amount = principal * (int)Math.pow(1.0 + rate, year);
        return amount;
    }

    public static void main(String[] args) {
        ModifiedCompoundInterest modifiedCompoundInterest = new ModifiedCompoundInterest();
        int principal = 1000;
        double rate = 0.05;
        int year = 0;

        System.out.printf("%s%6s%12s%n", "Year", "Rate", "Amount");
        for (year = 1; year <= 6; year++, rate+=0.01) {
            System.out.printf("%d%9d%,12d%n", year, rate,
                    (modifiedCompoundInterest.compoundInterest(principal,rate, year)));
        }
    }
}
