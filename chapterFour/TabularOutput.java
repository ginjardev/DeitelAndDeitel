package chapterFour;

public class TabularOutput {
    int N = 1;

   public void printTabularOutput(){
       System.out.printf("%s%7s%7s%8s%n", "N", "10*N", "100*N", "1000*N");
       while(N <=5){
           System.out.printf("%d%6d%7d%8d%n", N, 10*N, 100*N, 1000*N);
           N++;
       }
   }

    public static void main(String[] args) {
        TabularOutput tabularOutput = new TabularOutput();
        tabularOutput.printTabularOutput();
    }
}
