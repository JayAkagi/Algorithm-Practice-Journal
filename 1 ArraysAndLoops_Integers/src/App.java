import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class App {
    private static final Random RND = new Random();
    public static void main(String[] args) throws Exception {
        int[] a = createRandomArray(RND.nextInt(5,11), 1, 1000);
        int[] b = {5,5,5,12,12,23,41,88};
        int[] c = {7,7,7};
        
        System.out.println(Arrays.toString(a) + "\n");

        System.out.printf("max num : %d\n", getMax(a));
        System.out.printf("second max num: %d\n", getSecondMax(a));
        System.out.printf("least number: %d\n", getMin(a));
        System.out.printf("second max num in C: %d\n", getSecondMax(c));

        System.out.printf("\nArray A is Sorted: %b", isSorted(a));
        System.out.printf("\nArray B is Sorted: %b", isSorted(b));

        System.out.printf("\nReversed: %s", Arrays.toString(getReversedCopy(a)));

        System.out.println("\n" + getCountsString(a));
        System.out.println("\n" + getCountsString(b));

        System.out.println("\nSorted Array: " + Arrays.toString(getSortedCopy(a)));

    }

    public static int[] createRandomArray(int size, int minInclusive, int maxInclusive){
        if(size <= 0) return new int[0];

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RND.nextInt(minInclusive, maxInclusive + 1);
        }

        return arr;
    }

    public static Integer getMax(int[] arr){
        if(arr == null || arr.length == 0) return 0;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        return max;
    }
    

    public static Integer getSecondMax(int[] arr){
        if(arr == null || arr.length < 2) return 0;

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int n : arr){
            if(n > max){
                second = max;
                max = n;
            } else if (n < max && n > second){
                second = n;
            }
        }

        return (second == Integer.MIN_VALUE) ? 0 : second;
    }

    public static Integer getMin(int[] arr){
        if(arr == null || arr.length == 0) return 0;

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }

        return min;
    }

    public static boolean isSorted(int[] arr){
        if(arr == null || arr.length < 2) return true;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) return false;
        }

        return true;
    }

    public static int[] getSortedCopy(int[] arr){
        if(arr == null) return new int[0];

        int[] copy = Arrays.copyOf(arr, arr.length);
        bubbleSortInPlace(copy);
        return copy;
    }

    private static void bubbleSortInPlace(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length -i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) return;
        }
    }

    public static int[] getReversedCopy(int[] arr){
        if(arr == null) return new int[0];

        int[] copy = Arrays.copyOf(arr, arr.length);
        reverseInPlace(copy);
        return copy;
    }

    private static void reverseInPlace(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static String getCountsString(int[] arr){
        if(arr == null || arr.length == 0) return "";

        Map<Integer, Integer> counts = new HashMap<>();
        for(int n : arr){
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            sb.append(entry.getKey())
            .append(" count: ")
            .append(entry.getValue())
            .append('\n');
        }

        return sb.toString();
    }


}

// Old refactored code:

    // public static int[] arrayBuilder(){
    //     Random r = new Random();        
    //     int[] a = new int[r.nextInt(5,11)];
    //     for (int i = 0; i < a.length; i++) {
    //         int n = r.nextInt(1,1001);
    //         a[i] = n;
    //     }

    //     return a;
    // }
        

    // public static Integer maxNum(int[] arr){
        // int maxNum = Integer.MIN_VALUE;
            
            // for(int n : a){
            //     if(n >  maxNum) maxNum = n;
            // }

            // return maxNum;
    // }

    // public static Integer secondLargerst(int[] a){
    //     Integer max = getMax(a);
    //     Integer secondLargest = null;
    //     for(Integer n : a){
    //         if( secondLargest == null || n > secondLargest && n < max) secondLargest = n;
    //     }

    //     if(secondLargest == Integer.MIN_VALUE) secondLargest = max;

    //     return secondLargest;
    // }

    //     public static Integer smallestNum(int[] a){
    //     Integer least = null;
    //     for(Integer n : a){
    //         if(least == null || n < least){
    //             least = n;
    //         }
    //     }

    //     return least;
    // }
 
    // public static boolean sortChecker(int[] a){
    //     for(int i = 0; i < a.length - 1; i++){
    //         if(a[i] > a[i + 1]) return false;
    //     }
    //     return true;
    // }

    // public static int[] sortArray(int[] a){
    //     int temp = 0;
    //     for (int i = 0; i < a.length; i++) {
    //         for(int j = 0; j < a.length - i - 1; j++){
    //             if(a[j] > a[j + 1]){
    //                 temp = a[j];
    //                 a[j] = a[j + 1];
    //                 a[j + 1] = temp;
    //             }
    //         }
    //     }

    //     return a;
    // }

    // public static int[] reverseArray(int[] a){
    //     int temp = 0;
    //     for (int i = 0; i < a.length / 2; i++) {
    //         temp = a[i];
    //         a[i] = a[a.length - i - 1];
    //         a[a.length - i - 1] = temp;
    //     }
    //     return a;
    // }

    // public static String numCount(int[] a){
    //     String output = "";
    //     Map<Integer, Integer> count = new HashMap<>();
    //     for(Integer n : a){
    //         count.put(n, count.getOrDefault(n, 0) + 1);
    //     }

    //     for(Map.Entry<Integer, Integer> entry : count.entrySet()){
    //         Integer key = entry.getKey();
    //         Integer value = entry.getValue();
    //         output += String.format("%d count: %d \n", key, value);
    //     }

    //     return output;
    // }
