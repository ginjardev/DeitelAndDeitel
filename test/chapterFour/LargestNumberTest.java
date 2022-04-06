package chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LargestNumberTest {
    LargestNumber largestNumber;
    @BeforeEach
    void startWithThis(){
        largestNumber = new LargestNumber();
    }

    @Test
    void createLargestNumberObjectTest(){
        assertNotNull(largestNumber);
    }

    @Test
    void createCounterVariableTest(){
       assertEquals(0, largestNumber.getCounterValue());
    }

    @Test
    void createLargestNumberVariableTest(){
        assertEquals(0, largestNumber.getLargestNumber());
    }

    @Test
    void createNumberVariableTest(){
        assertEquals(0, largestNumber.getNumber());
    }

    @Test
    void receiveUserInputTest(){
        largestNumber.collectUserInput(34);
        assertEquals(34,largestNumber.getNumber());
    }

    @Test
    void checkForLargestNumberTest(){
        largestNumber.largestNumberChecker(50);
        largestNumber.largestNumberChecker(70);
        largestNumber.largestNumberChecker(100);
        largestNumber.largestNumberChecker(10);
        largestNumber.largestNumberChecker(30);
        largestNumber.largestNumberChecker(12);
        largestNumber.largestNumberChecker(170);
        largestNumber.largestNumberChecker(65);
        largestNumber.largestNumberChecker(34);
        largestNumber.largestNumberChecker(89);
        assertEquals(170, largestNumber.getLargestNumber());
    }

    @Test
    void checkTenInputsWereCollectedTest(){
        largestNumber.largestNumberChecker(30);
        largestNumber.largestNumberChecker(70);
        largestNumber.largestNumberChecker(100);
        largestNumber.largestNumberChecker(10);
        largestNumber.largestNumberChecker(30);
        largestNumber.largestNumberChecker(12);
        largestNumber.largestNumberChecker(170);
        largestNumber.largestNumberChecker(65);
        largestNumber.largestNumberChecker(34);
        largestNumber.largestNumberChecker(89);
        assertEquals(10,largestNumber.getCounterValue());
    }

}
