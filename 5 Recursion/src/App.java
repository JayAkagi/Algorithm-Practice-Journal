public class App {
    public static void main(String[] args) throws Exception {
        printNtoFive(5);
        printNtoOne(1);

        System.out.println("\nsum of first numbers: ");
        getSumOfFirstNumbers(5);

        System.out.println(getReversedStringRecursively("Test"));
    }

    public static void printNtoFive(int n){
        if(n == 0) return;

        printNtoFive(n - 1);
        System.out.println(n);
    }

    public static void printNtoOne(int n){
        if( n == 6) return;

        printNtoOne(n + 1);
        System.out.println(n);
    }

    public static Integer getSumOfFirstNumbers(int n){
        if(n == 0) return 0;
        int num = getSumOfFirstNumbers(n - 1);
        int total = n + num;
        System.out.println(total);
        return total;
    }

    public static String getReversedStringRecursively(String s){
        if(s == null || s.length() <= 1) return s;

        Character c = s.charAt(0);

        String reversed = getReversedStringRecursively(s.substring(1));
        return reversed + c;
    }
}
