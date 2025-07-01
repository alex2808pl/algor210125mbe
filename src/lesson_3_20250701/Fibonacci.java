package lesson_3_20250701;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("fibonacciIterative = "+fibonacciIterative(6));
        System.out.println("fibonacciRecursive = "+fibonacciRecursive(6));
    }
    static int fibonacciIterative(int n) {
        if(n <=1 ) return n;
        int fibPrev = 1, fib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += fibPrev;
            fibPrev = temp;
        }
        return fib;
    }
    //1,1,2,3,5

    static int fibonacciRecursive(int n) {
        if(n<=1) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
    // n = 6
    // fibonacciRecursive(5) + fibonacciRecursive(4)
    //  (fibonacciRecursive(4)+fibonacciRecursive(3)) + (fibonacciRecursive(3)+fibonacciRecursive(2))
    //                  5                             +                         3

}


