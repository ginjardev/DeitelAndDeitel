package chapterFive;

public class TrianglePrintingProgram {

    public void printTriangleA(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void printTriangleB(){
        for (int i = 10; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void printTriangleC(){
        int counter = 0;
        for (int i = 10; i >=1; i--) {
            for (int j = 0; j < counter; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            ++counter;
            System.out.println();
        }
        System.out.println();
    }

    public void printTriangleD(){
        int counter = 9;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            counter--;
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TrianglePrintingProgram trianglePrintingProgram = new TrianglePrintingProgram();
        trianglePrintingProgram.printTriangleA();
        trianglePrintingProgram.printTriangleB();
        trianglePrintingProgram.printTriangleC();
        trianglePrintingProgram.printTriangleD();

    }
}
