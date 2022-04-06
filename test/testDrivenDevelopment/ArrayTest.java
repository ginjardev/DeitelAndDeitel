package testDrivenDevelopment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    int[] arrays;
    @BeforeEach
    void beforeEach(){
        arrays = new int[]{1, 2, 3, 4};
    }
    @Test
    void sumOfElementsInArray(){

       int sum = Array.getSumOfArrayElements(arrays);
       assertEquals(10, sum);
    }

    @Test
    void averageOfElementsInArray(){
        double average = Array.getAverageOfArrayElements(arrays);
        assertEquals(2.5, average);
    }

    @Test
    void maximumOfElementsInArray(){
        int maximumNumber = Array.getMaximumNumberInArray(arrays);
        assertEquals(4, maximumNumber);
    }

    @Test
    void minimumOfElementsInArray(){
        int minimumNumber = Array.getMinimumNumberInArray(arrays);
        assertEquals(1, minimumNumber);
    }

    @Test
    void maximumSumOfNumbersInArray(){
        int maximumSum = Array.getMaximumSumOfNumbersInArray(arrays);
        assertEquals(9, maximumSum);
    }

    @Test
    void minimumSumOfNumbersInArray(){
        int minimumSum = Array.getMinimumSumOfNumbersInArray(arrays);
        assertEquals(6, minimumSum);
    }



}