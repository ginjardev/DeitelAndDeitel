package arraysPractise;

public class ComputingGCD {

    public static int gcdOfArrayNumbers(int...numbers){
        int gcd = 0;
        int counter = 0;
        for (int i = 2; i < numbers.length; i++) { // pick each number in array
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j] % i == 0){
                    counter++;
                    if(counter == numbers.length){
                        gcd = i;
                    }
                }else counter = 0;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcdOfArrayNumbers(45, 75));
    }
}
