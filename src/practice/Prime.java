package practice;

public class Prime{
    public boolean isPrime(int number) {
        int count = 2;
        if(number > 1){
            while(count < number){
                if(number % count == 0){
                    return false;
                }
                count++;
            }
        }
        return true;
    }
}