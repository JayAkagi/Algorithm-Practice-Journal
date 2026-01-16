import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = arrayBuilder();
        int[] b = {5,5,5,12,12,23,41,88};
        int[] c = {7,7,7};
        System.out.println(Arrays.toString(a) + "\n");

        Integer maxNum = maxNum(a);
        boolean sortedA = sortChecker(a);
        boolean sortedB = sortChecker(b);
        int[] reversed = reverseArray(a);
        String counta = numCount(a);
        String countb = numCount(b);
        Integer secondMax = secondLargerst(a);
        Integer secondMaxC = secondLargerst(c);
        int[] sortedArray = sortArray(a);
        

        System.out.printf("max num : %d\n", maxNum);
        System.out.printf("second max num: %d\n", secondMax);
        System.out.printf("second max num in C: %d\n", secondMaxC);
        System.out.printf("\nArray A is Sorted: %b", sortedA);
        System.out.printf("\nArray B is Sorted: %b", sortedB);
        System.out.printf("\nReversed: " + Arrays.toString(reversed));
        System.out.println("\n" + counta);
        System.out.println("\n" + countb);
        System.out.println("\nSorted Array: " + Arrays.toString(sortedArray));

    }

    public static int[] arrayBuilder(){
        Random r = new Random();        
        int[] a = new int[r.nextInt(5,11)];
        for (int i = 0; i < a.length; i++) {
            int n = r.nextInt(1,1001);
            a[i] = n;
        }

        return a;
    }

    public static Integer maxNum(int[] a){

        int maxNum = Integer.MIN_VALUE;
        
        for(int n : a){
            if(n >  maxNum) maxNum = n;
        }

        return maxNum;
    }

    public static boolean sortChecker(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i + 1]) return false;
        }
        return true;
    }

    public static int[] sortArray(int[] a){
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        return a;
    }

    public static int[] reverseArray(int[] a){
        int temp = 0;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        return a;
    }

    public static String numCount(int[] a){
        String output = "";
        Map<Integer, Integer> count = new HashMap<>();
        for(Integer n : a){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            output += String.format("%d count: %d \n", key, value);
        }

        return output;
    }

    public static Integer secondLargerst(int[] a){
        Integer max = maxNum(a);
        Integer secondLargest = Integer.MIN_VALUE;
        for(Integer n : a){
            if(n > secondLargest && n < max) secondLargest = n;
        }

        if(secondLargest == Integer.MIN_VALUE) secondLargest = max;

        return secondLargest;
    }
}
