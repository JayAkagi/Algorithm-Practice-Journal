import java.util.Arrays;
import java.util.Random;

public class App {
    private static Random random = new Random();
    public static void main(String[] args) throws Exception {
        reverseArray(arrayBuilder());
        moveAllZerosToTheEnd(arrayBuilder());
        isArraySorted();
    }

    public static int[] arrayBuilder(){
        int[] myArray = new int[5];
        for(int i = 0; i < myArray.length; i++){
            int num = random.nextInt(0,6);
            myArray[i] = num;
        }

        return myArray;
    }

    public static void reverseArray(int[] a){
        System.out.println("before reverse: " + Arrays.toString(a));
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

        System.out.println("reversed: " + Arrays.toString(a));
        return;
    }

    // logically correct but flawed/overcomplicated. (Will improve later 🎯)
    public static void moveAllZerosToTheEnd(int[] a){
        System.out.println("\nbefore moving zeros: " + Arrays.toString(a));

        int write = 0;
        for (int read = 0; read < a.length; read++) {
            if(a[read] != 0){
                a[write] = a[read];
                write++;
            }
        }

        int replace = a.length - 1;
        for (int i = 0; i < (a.length - write); i++) {
            a[replace] = 0;
            replace--;
        }


        System.out.println("after moving zeros: " +Arrays.toString(a));
        return;
    }

    public static void isArraySorted(){
        int[] myArray = {1,2,3,4,5};
        boolean sorted = true;

        for (int i = 0; i < myArray.length - 1; i++) {
            if(myArray[i] > myArray[i+1]){
                sorted = false;
                break;
            } 
        }
        System.out.println(sorted);
    }
}
