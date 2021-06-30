package chapterFour;

public class MultiplesOfTwoInfiniteLoop {

    public void multiplesOfTwoInfinite(){
        int counter = 0;
        while(counter != 202){
            if(counter > 0){
                if(counter % 2 == 0){
                    System.out.print(counter + " ");
                }
            }
            counter++;
        }
    }

    public static void main(String[] args) {
        MultiplesOfTwoInfiniteLoop multiplesOfTwoInfiniteLoop = new MultiplesOfTwoInfiniteLoop();
        multiplesOfTwoInfiniteLoop.multiplesOfTwoInfinite();
    }
}
