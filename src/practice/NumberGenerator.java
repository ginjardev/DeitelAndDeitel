package practice;

public class NumberGenerator {

    public static int numberGenerator(int numberOne, int numberTwo, int numberThree){
        int fourthNumber = 0;
        int difference = numberTwo - numberOne;

        if(numberTwo - numberOne == difference && numberThree - numberTwo == difference){
            fourthNumber = numberThree + difference;
        }else{
            System.out.println("unmatched series");
        }
        return fourthNumber;
    }

    public static void seriesGenerator(int numberOne, int numberTwo, int numberThree, int nthTerm){
        int nextNumber = 0;
        int difference = numberTwo - numberOne;
        int check = 0;
        if(numberTwo - numberOne == difference && numberThree - numberTwo == difference){
            nextNumber = numberThree + difference;
            System.out.println(nextNumber);
            //System.out.println(nextNumber);
            while(check < (nthTerm-1)){
                nextNumber += difference;
                System.out.println(nextNumber);
                check++;
            }
        }else{
            System.out.println("unmatched series");
        }

    }

    public static void main(String[] args) {
        //System.out.println(numberGenerator(1, 3, 5));
        seriesGenerator(2,4,6,4);
    }
}
