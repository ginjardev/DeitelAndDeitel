package arraysPractise;

public class SearchInsert {

    public static int searchAndInsertArray(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= target){
                return i;
            }
        }
        return array.length;
    }

    public static void main(String[] args) {
        int[] scores = {2,3,7, 9, 11};
        System.out.println(searchAndInsertArray(scores, 0));
    }
}
