package chapterFive;

public class ProductOfOddNumbers {

    int product = 1;
    public int productOfOddNumbers(){
        for (int i = 1; i <=15; i++) {
            if(i % 2 == 1){
                product *= i;
            }
        }
        return product;
    }

    public static void main(String[] args) {
        ProductOfOddNumbers productOfOddNumbers = new ProductOfOddNumbers();

        System.out.println(productOfOddNumbers.productOfOddNumbers());
    }
}
