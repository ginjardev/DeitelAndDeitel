package chapterFive;

public class One {

    int sum = 0;
    int count;
    //(a)
    public int sumOfOddNumbers(){
        for( count = 1; count < 100; count++){
            if(count % 2 == 1){
                //System.out.print(count + " ");
                sum += count;
            }
        }
        return sum;
    }

    //(b)
    public double powerOfTwoPointFive(){
        return Math.pow(2.5,3);
    }

    //(c)
    public void printOneToTwenty(){
        int i = 1;
        while(i <= 20){
            if(i % 5 == 0){
                System.out.print(i);
                System.out.println();
            }else{
                System.out.print(i + "\t");
            }
            i++;
        }
        System.out.println();
    }

    //(d)
    public void printOneToTwentyForLoop(){
        for (int i = 1; i < 21; i++) {
            if(i % 5 == 0){
                System.out.print(i);
                System.out.println();
            }else{
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        One one = new One();
        System.out.println(one.sumOfOddNumbers());
        System.out.println(one.powerOfTwoPointFive());
        one.printOneToTwenty();
        one.printOneToTwentyForLoop();

        for (int i = 1; i <= 10; i++)
            {
            for (int j = 1; j <= 5; j++)
                System.out.print('@');
            System.out.println();
            }
    }
}
