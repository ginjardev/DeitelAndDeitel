package chapterFive;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        int space1 = 4, space2 = 4, star = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < space1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print(" * ");
            }
            for (int j = 0; j < space2; j++) {
                System.out.print("   ");
            }
            if(i > 4 ){
                star-=2; space1++; space2++;
            }else {
                star+=2; space1--; space2--;
            }
            System.out.println();
        }
    }
}
