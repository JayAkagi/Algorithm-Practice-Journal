import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
    private static Random random = new Random();
    public static void main(String[] args) throws Exception {
        reverseArray();
        moveAllZerosToTheEnd();
    }

    public static List<Integer> arrayBuilder(){
        
        List<Integer> myArrayList = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            int num = random.nextInt(1,100);
            myArrayList.add(num);
        }

        return myArrayList;
    }

    public static void reverseArray(){
        List<Integer> myArrayList = arrayBuilder();
        System.out.println("unsorted: " + myArrayList);
        for (int i = 0; i < myArrayList.size() / 2; i++) {
            int temp = myArrayList.get(i);
            myArrayList.set(i, myArrayList.get(myArrayList.size() - i - 1));
            myArrayList.set(myArrayList.size() - i - 1, temp);
        }

        System.out.println("reversed: " + myArrayList);
        return;
    }

    // logically correct but flawed. (Will improve later 🎯)
    public static void moveAllZerosToTheEnd(){
        int[] myArray = {0,1,0,3,12,7,8,0,2,0};
        System.out.println("unsorted: " + Arrays.toString(myArray));

        int write = 0;
        for (int read = 0; read < myArray.length; read++) {
            if(myArray[read] != 0){
                myArray[write] = myArray[read];
                write++;
            }
        }

        System.out.println(write);

        int replace = myArray.length - 1;
        for (int i = 0; i < (myArray.length - write); i++) {
            myArray[replace] = 0;
            replace--;
        }


        System.out.println(Arrays.toString(myArray));
        return;
    }
}
