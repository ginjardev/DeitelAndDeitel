package chapterFour;

public class LargestNumber {

    private int counter;
    private int largestNumber;
    private int number;

    public int getCounterValue() {
        return counter;
    }

    public int getLargestNumber() {
        return largestNumber;
    }

    public int getNumber() {
        return number;
    }
    public void collectUserInput(int number){
        this.number = number;
    }

    public void largestNumberChecker(int number) {
        for(counter = 0; counter < 10; counter++){
            collectUserInput(number);
            if(number > largestNumber)
                largestNumber = number;
        }
    }
}
