package chapterFive;

public class TwelveDaysOfChristmas {

    public static void main(String[] args) {
        String numberOfDay = "";

        for (int i = 1; i <= 12; i++) {
            switch (i){
                case 1:
                    numberOfDay = "st";
                    break;
                case 2:
                    numberOfDay = "nd";
                    break;
                default:
                    numberOfDay = "th";
                    break;
            }

            System.out.println("On the " + i + numberOfDay + " day of Christmas \nMy true love gave to me");
            for (int j = i; j >= 1; j--) {
                switch (j){
                    case 1:
                        System.out.println("A partridge in a pear tree");
                        break;
                    case 2:
                        System.out.println("Two turtle doves and");
                        break;
                    case 3:
                        System.out.println("Three french hens");
                        break;
                    case 4:
                        System.out.println("Four calling birds");
                        break;
                    case 5:
                        System.out.println("Five golden rings");
                        break;
                    case 6:
                        System.out.println("Six geese a-laying");
                        break;
                    case 7:
                        System.out.println("Seven swans a-swimming");
                        break;
                    case 8:
                        System.out.println("Eight maids a-milking");
                        break;
                    case 9:
                        System.out.println("Nine ladies dancing");
                        break;
                    case 10:
                        System.out.println("Ten lords a-leaping");
                        break;
                    case 11:
                        System.out.println("Eleven pipers piping");
                        break;
                    case 12:
                        System.out.println("Twelve drummers drumming");
                        break;
                }

            }
            System.out.println();
        }
    }

}
