package lesson_3_20250701;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Факториал итеративно " + n + " = " + factorialIteration(n));
        System.out.println("Факториал итеративно реверс " + n + " = " + factorialIterationRevers(n));
        System.out.println("Факториал рекурсивно " + n + " = " + factorialRecursive(n));
    }
    static int factorialIteration(int n) {
        int res = 1;   //0*1,
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    static int factorialIterationRevers(int n) {
        int res = 1;   //1*5,*4,*3,*2,*1 = 120
        for (int i = n; i >= 1; i--) {
            res *= i;
        }
        return res;
    }

    static int factorialRecursive(int n) {
        if (n <= 1) { //базовое условие
            return 1;
        }
        int res = n * factorialRecursive(n - 1);  //5->4->3->2
        return res;
    }
}
