package chapterFive;

public class CalculatingValueOfPI {

    public static void main(String[] args) {
        int counter = 1;
        int number = 200000;
        double odd = 1;
        double third = 0;
        double fourth = 0;
        double PI = 0.0;
        System.out.printf("%s%10s%n", "Number", "PI");
        while(counter <= number){
            odd+= 2;
            if(counter % 2 == 1){
                third = -4.0 /odd;
            }else{
                third = 4.0/odd;
            }
            fourth -= third;
            PI = 4.0 - fourth;
            System.out.printf("%d%20.7f%n", counter, PI);
            counter++;
        }
    }
}
