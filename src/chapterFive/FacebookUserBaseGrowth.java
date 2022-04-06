package chapterFive;

public class FacebookUserBaseGrowth {
    public static void main(String[] args) {
        double facebookUserBase = 1_000_000_000;
        double newFacebookUserBase = 1_000_000_000;
        double rate = 0.04;
        int month = 0;

        System.out.printf("%s%20s%n", "Month", "Facebook UserBase");
        for ( month = 0; newFacebookUserBase <= 2_000_000_000; month++){
        //while(newFacebookUserBase <= 2_000_000_000){
            // calculate new user base for specified month
            newFacebookUserBase = facebookUserBase * Math.pow(1.0 + rate, month);
            ++month;
            // display the month and the new user base
            System.out.printf("%4d%,20.2f%n", month, newFacebookUserBase);
//            if(newFacebookUserBase <= 1_500_000_00){
//                break;
//            }
        }
    }
}
