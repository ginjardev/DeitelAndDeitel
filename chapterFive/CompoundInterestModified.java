package chapterFive;

public class CompoundInterestModified {

    double amount;
    double principal;
    double rate;
    int year;
    public double compoundInterest(double principal, double rate, int year){
        amount = principal * Math.pow(1.0 + rate, year);
        return amount;
    }

    public static void main(String[] args) {
        CompoundInterestModified calculateInterest = new CompoundInterestModified();
        double principal = 1000.0;
        double rate = 0.05;
        int year = 0;

        System.out.printf("%s%6s%12s%n", "Year", "Rate", "Amount");
        for (year = 1; year <= 6; year++, rate+=0.01) {
            System.out.printf("%d%9.2f%,12.2f%n", year, rate,
                    calculateInterest.compoundInterest(principal,rate, year));
        }
    }
}
