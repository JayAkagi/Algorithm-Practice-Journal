import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
    private static Random random = new Random();
    public static void main(String[] args) throws Exception {
        List<Integer> myArrayListOne = arrayBuilder();
        int[] myArray = {0,1,0,3,12};
        // int[] zerosToTheEnd = moveAllZerosToTheEnd(myArray) ;

        System.out.println(myArrayListOne);
        System.out.println(reverseArray(myArrayListOne));

        System.out.println(Arrays.toString(myArray));
        // System.out.println(Arrays.toString(zerosToTheEnd));
    }

    public static List<Integer> arrayBuilder(){
        
        List<Integer> myArrayList = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            int num = random.nextInt(1,100);
            myArrayList.add(num);
        }

        return myArrayList;
    }

    public static List<Integer> reverseArray(List<Integer> myArrayList){
        for (int i = 0; i < myArrayList.size() / 2; i++) {
            int temp = myArrayList.get(i);
            myArrayList.set(i, myArrayList.get(myArrayList.size() - i - 1));
            myArrayList.set(myArrayList.size() - i - 1, temp);
        }

        return myArrayList;
    }

    // public static int[] moveAllZerosToTheEnd(int[] myArray){
    //     for (int i = 0; i < myArray.length; i++) {
    //         if(myArray[i] == 0){
    //             for (int j = 0; j < myArray.length - i - 1; j++) {
    //                 int zeroHolder = myArray[i];
    //                 myArray[i] = myArray[i + 1];
    //                 myArray[i + 1] = zeroHolder;
    //             }                
    //         }
    //     }

    //     return myArray;
    // }
}
