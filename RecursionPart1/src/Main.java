public class Main {
    public static void main(String[] args) {
        int n = 10;

//        printDec(n);
//        printInc(n);

//        System.out.println(fac(n));

//        System.out.println(sumOfFirstNaturalNumbers(n));

//        System.out.println(fibonacciNumber(5));
//        for (int i = 0; i < n; i++) {
//            System.out.println(i + " : " + fibonacciNumber(i));
//        }

        int[] arr = {1, 2, 3, 40, 5};
        System.out.println(isSorted(arr, 0));

    }

    // check if a given array is sorted or not
    public static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1) return true;

        if(arr[i] > arr[i+1]) return false;

        return isSorted(arr, i + 1);
    }

    // print nth fibonacci number
    public static int fibonacciNumber(int n){
        if(n == 0 || n == 1) return n;

        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    // print sum of first n natural numbers
    public static int sumOfFirstNaturalNumbers(int n){
        if(n == 1){
            return 1;
        }

        return n + sumOfFirstNaturalNumbers(n - 1);
    }

    // print factorial of a number n
    public static int fac(int n){

        if(n == 0){
            return 1;
        }

        return n * fac(n - 1);
    }

    // print numbers from n to 1 (Increasing Order)
    public static void printInc(int n){

        if(n == 1){
            System.out.print(n + " ");
            return;
        }

        printInc(n-1);
        System.out.print(n + " ");
    }


    // print numbers from n to 1 (Decreasing Order)
    public static void printDec(int n){

        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printDec(n - 1);
    }
}