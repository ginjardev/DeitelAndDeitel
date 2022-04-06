package testDrivenDevelopment;

import practice.Kata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    Kata testDriller;
    @BeforeEach
    void comesBefore(){

        testDriller = new Kata();
    }
    @Test
    void purchaseOneUnitOfTestDrillerTest() {

        assertEquals(1500, testDriller.calculatePriceFor(1));
    }

    @Test
    void purchaseFourUnitsOfTestDrillerTest(){

        assertEquals(4500, testDriller.calculatePriceFor(3));
    }

}
