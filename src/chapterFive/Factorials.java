package chapterFive;

public class Factorials {

    public long factorialOfNumber(long number){
        long factorial = 1;
        if(number == 0){
            return 1;
        }else if(number == 1){
            return 1;
        }else{
            while(number >= 2){

                factorial *= number;
                number--;
            }
        }

        return factorial;
    }

    public void factorialToTwenty(long number){
        int counter = 1;
        System.out.printf("%s%30s%n", "Number", "Factorial");
        while(counter <= number){
            System.out.printf("%d%33d%n", counter, factorialOfNumber(counter));
            counter++;
        }
    }


    public static void main(String[] args) {
        Factorials factorials = new Factorials();
        System.out.println(factorials.factorialOfNumber(5));
        factorials.factorialToTwenty(20);
    }
}
