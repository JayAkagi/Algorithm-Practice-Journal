import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class App {
    private static Random random = new Random();
    public static void main(String[] args) throws Exception {
        reverseArray(arrayBuilder());
        moveAllZerosToTheEnd(arrayBuilder());
        isArraySorted();

        int[] removeDuplicateArray = {1,2,2,4,4,5,5,6};
        int uniqueNum = removeDuplicate(removeDuplicateArray);
        System.out.println("Unique num count: " +uniqueNum);

        System.out.println("unique numbers: " + removeDuplicateExperimental(arrayBuilder()));
        
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
                int temp = a[write];
                a[write] = a[read];
                a[read] = temp;
                write++;
            }
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

        System.out.println("\n" + Arrays.toString(myArray));
        System.out.println("Is array sorted? : " +sorted);
    }

    public static int removeDuplicate(int[] a){
        if (a == null || a.length == 0) return 0;
        System.out.println("\nRemove Duplicate: " + Arrays.toString(a));
        int write = 0;
        int read = 1;
        int uniqueNum = 1;
        while(read < a.length){
            if (a[read] != a[write]){
                write++;
                a[write] = a[read];
                uniqueNum++;
            }

            read++;
        }

        System.out.println("Removed duplicates output (duplicates on right side dont matter): \n" + Arrays.toString(a));
        return uniqueNum;
    }

    public static int removeDuplicateExperimental(int[] a){
        Set<Integer> seen = new HashSet<>();
        int uniqueNum = 0;
        for(Integer n : a){
            if(!seen.contains(n)) uniqueNum ++;
            seen.add(n);            
        }

        Integer[] unique = seen.toArray(new Integer[seen.size()]);

        System.out.println("\n(Experimental: Remove Duplicates Using HashSet)");
        System.out.println("Remove Duplicates: " + Arrays.toString(a));
        System.out.println("unique num array:" + Arrays.toString(unique) + "");

        return uniqueNum;
    }
}
