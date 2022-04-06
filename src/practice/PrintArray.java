package practice;

public class PrintArray {
    char[][] bestie = new char[3][3];
    //int counter = 0;

    public void displayArray(){
        //counter = 0;

        for (int row = 0; row < bestie.length; row++) {
            System.out.print("| ");
            for (int column = 0; column < bestie[row].length; column++) {
                bestie[0][0] = 'x';
                bestie[0][2] = 'x';
                bestie[1][2] = 'x';
                bestie[2][1] = 'x';
                if(bestie[row][column] != 'x'){
                    bestie[row][column] = 'o';
                }
                System.out.print(bestie[row][column] + " | ");
            }
            System.out.println();
        }
    }

    int[][] numbers = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0},{0,0,0,0}};

    public void printMyArray(){
        for (int row = 0; row < numbers.length; row++) {
           //System.out.println();
            for (int column = 0; column < numbers[row].length; column++) {
                if(numbers[row][column] == 1){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void writeOnA(){
        for(int row = 0; row < numbers[0].length; row++){
            numbers[0][row] = 1;
        }
    }
    public void writeOnB(){
        int counter = 0;
        while(counter <=2 ){
            for(int row = 0; row < numbers[counter].length - 1; row++ ){
//                if(row == 3){
//                    break;
//                }else{
//                    numbers[row][3] = 1;
//                }
                numbers[row][3] = 1;
            }
            counter++;
        }
    }
    public void writeOnC(){
        int counter = 2;
        while(counter <= 4){
            for(int row = 2; row < numbers[counter].length + 1; row++ ){
//                if(row == 3){
//                    break;
//                }else{
//                    numbers[row][3] = 1;
//                }
                numbers[row][3] = 1;
            }
            counter++;
        }
    }
    public void writeOnD(){
        for(int row = 0; row < numbers[4].length; row++){
            numbers[4][row] = 1;
        }
    }
    public void writeOnE(){
        int counter = 2;
        while(counter <= 4){
            for(int row = 2; row < numbers[counter].length + 1; row++ ){
//                if(row == 3){
//                    break;
//                }else{
//                    numbers[row][3] = 1;
//                }
                numbers[row][0] = 1;
            }
            counter++;
        }
    }
    public void writeOnF(){
        int counter = 0;
        while(counter <=2 ){
            for(int row = 0; row < numbers[counter].length - 1; row++ ){
//                if(row == 3){
//                    break;
//                }else{
//                    numbers[row][3] = 1;
//                }
                numbers[row][0] = 1;
            }
            counter++;
        }
    }
    public  void writeOnG(){
        for(int row = 0; row < numbers[2].length; row++){
            numbers[2][row] = 1;
        }
    }

    public void printSegmentDisplay(String string){

        for(int counter = 0; counter < string.length(); counter++){
            if(string.length() > 8){
                System.out.println("length of string too long");
                break;
            }if(string.length() < 8){
                String word = "00000000";
                String word2 = word.substring(0,8 - string.length());
                System.out.println(word2);
                break;
                //string = word2 + string;
            }if(string.charAt(counter) != '1' && string.charAt(counter) != '0'){
               System.out.println("inputted wrong values");
               break;
            }
            boolean value = string.charAt(counter)== '1';
            if(value){
                switch (counter){
                    case 0:
                        writeOnA();
                        break;
                    case 1:
                        writeOnB();
                        break;
                    case 2:
                        writeOnC();
                        break;
                    case 3:
                        writeOnD();
                        break;
                    case 4:
                        writeOnE();
                        break;
                    case 5:
                        writeOnF();
                        break;
                    case 6:
                        writeOnG();
                        break;
                }
            }

        }
    }

    public void validateSegmentDisplay(String string){
    }

    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();
        printArray.printSegmentDisplay("1");
//        printArray.writeOnA();
//        printArray.writeOnB();
//        printArray.writeOnC();
//        printArray.writeOnD();
//        printArray.writeOnE();
//        printArray.writeOnF();
//        printArray.writeOnG();
        printArray.printMyArray();

    }
}
