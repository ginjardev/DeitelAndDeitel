package chapterFour;

import java.text.DecimalFormat;

public class SalesCommissionCalculator {
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    private double commission;
    private double salesEarnings;

    public void calculateSalesCommission(double itemPrice) {
        this.commission =  0.09 * itemPrice;
    }

    public String getSalesCommission() {
        return decimalFormat.format(commission);
    }

    public void calculateSalesEarnings(double itemPrice) {
        calculateSalesCommission(itemPrice);
        this.salesEarnings = commission + 200;
    }

    public String getSalesEarnings() {
        return decimalFormat.format(salesEarnings);
    }
}
