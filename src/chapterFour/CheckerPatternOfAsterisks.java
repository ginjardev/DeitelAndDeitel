package chapterFour;

public class CheckerPatternOfAsterisks {
    int count = 0;

    public void printCheckerPatternOfAsterisk(){

        while(count < 8){
            int counter = 0;
            if(count % 2 == 0){
                while(counter < 8){
                    System.out.print("* ");
                    System.out.print(" ");
                    counter++;
                }
            }else {
                while(counter < 8){
                    System.out.print(" ");
                    System.out.print("* ");
                    counter++;
                }
            }
            System.out.println();
            count++;
        }

    }

    public static void main(String[] args) {
        CheckerPatternOfAsterisks checkerPatternOfAsterisks = new CheckerPatternOfAsterisks();
        checkerPatternOfAsterisks.printCheckerPatternOfAsterisk();
    }
}
