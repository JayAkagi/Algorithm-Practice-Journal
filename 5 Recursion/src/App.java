public class App {
    public static void main(String[] args) throws Exception {
        printNtoFive(5);
        printNtoOne(1);

        System.out.println("\nsum of first numbers: ");
        sumOfFirstNumbers(5);
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

    public static Integer sumOfFirstNumbers(int n){
        if(n == 0) return 0;
        int num = sumOfFirstNumbers(n - 1);
        int total = n + num;
        System.out.println(total);
        return total;
    }
}
