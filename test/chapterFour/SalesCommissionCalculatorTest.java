package chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest {
    SalesCommissionCalculator salesCommissionCalculator;
    @BeforeEach
    void startWith() {
        salesCommissionCalculator = new SalesCommissionCalculator();
    }

    @Test
    void createSalesCommissionCalculatorObjectTest(){
        assertNotNull(salesCommissionCalculator);
    }

    @Test
    void calculateSalesCommissionPerItemSoldTest(){
        double res = Math.ceil(234.896345689 * 100) / 100;
        System.out.println(res);
        salesCommissionCalculator.calculateSalesCommission(345.00);
        assertEquals("31.05", salesCommissionCalculator.getSalesCommission());
    }

    @Test
    void calculateSalesEarningsTest(){
        salesCommissionCalculator.calculateSalesEarnings(345.00);
        assertEquals("231.05", salesCommissionCalculator.getSalesEarnings());
    }


}