package chapterFive;

import java.util.Scanner;

public class CalculatingSales {

    public static void main(String[] args) {
        int price;
        int product;
        int totalPrice;

        Scanner scanner = new Scanner(System.in);
        int productNumber = 1;
        while(productNumber != 0 && productNumber <= 5){
            System.out.println("Enter product number: ");
            productNumber = scanner.nextInt();
            System.out.println("Enter number of products sold: ");
            int quantitySold = scanner.nextInt();

            switch (productNumber){
                case 1:
                    price = 100;
                    totalPrice = quantitySold * price;
                    System.out.println(totalPrice);
                    break;
                case 2:
                    price = 200;
                    totalPrice = quantitySold * price;
                    System.out.println(totalPrice);
                    break;
                case 3:
                    price = 250;
                    totalPrice = quantitySold * price;
                    System.out.println(totalPrice);
                    break;
                case 4:
                    price = 120;
                    totalPrice = quantitySold * price;
                    System.out.println(totalPrice);
                    break;
                case 5:
                    price = 320;
                    totalPrice = quantitySold * price;
                    System.out.println(totalPrice);
                    break;
            }
        }


    }
}
