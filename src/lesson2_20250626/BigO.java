package lesson2_20250626;

public class BigO {
    public static void main(String[] args) {
        System.out.println("sum="+sum(2,5));
    }

    // Анализируем операции кода:
    // - сравнения («больше», «меньше», «равно»);
    // - присваивания;
    // - выделение памяти.

    static int sum(int one, int two) { //1+1
        return one+two; //1 //выделение памяти
    } //O(3) ~ 0(1)

    static int sum1(int one, int two) { //1+1
        int result = one+two; //1
        return result;
    } //O(3) ~ 0(1)

    // n = arr.length
    static int sum(int[] arr) { //1
        int sum = 0; //1
        for(int i = 0; i < arr.length; i++) { //1 + (1+1)*n + 1*n
            sum+=arr[i];  //2*n
        }
        return sum;
    } // 1 + 1 + 1 + 2n +1n + 2n = O(3+5n) =  O(5n) => O(n)

    //  1 2 3
    //  4 5 6
    //  7 8 9
    // n - количество строк или столбцов
    static int sumMatrix(int[][] arr, int n) { //2
        int sum = 0; //1
        for (int i = 0; i < n; i++) { //строка   ( 1 + n + n)
            for (int j = 0; j < n; j++) { //столбцы (1 + n + n)
                sum += arr[i][j]; // 2*n^2
            }
        }
        return sum;
    } //(2+1+ (1+n+n) * (1+n+n) + 2n^2) = 3+(1+2n)*(1+2n) + 2n^2 =
      // = 3 + 1 + 2n + 2n + 4n^2 + 2n^2 = 4 + 4n + 6n^2 =  O(n) + O(n^2) => O(n^2)

    // n = arr.length = 8
    static void simpleLog(int[] arr) { //1
        int n = arr.length; //1
        for(int i = 1; i <= n; i = i * 2) { //i = 1, 2, 4, 8 (log2(1)=0, log2(2)=1, log2(4)=2, log2(8)=3) => (1 + log n + log n)
            System.out.println(arr[i]); // log n
        }
    } //(1 +1 + (1 + log n + log n) + log n ) = (3 + 3 * (log n)) => O(log n)

    // n = arr.length = 8
    // n - количество строк или столбцов
    static void simpleNLog(int[][] arr) { //1
        int n = arr.length; //1
        for (int j = 0; j < n; j++) { // 1 + n + n
            for(int i = 1; i <= n; i = i * 2) { //i = 1, 2, 4, 8 (log2(1)=0, log2(2)=1, log2(4)=2, log2(8)=3) => (1 + log n + log n)
                System.out.println(arr[j][i]);
            }
        }
    } //(1 +1 + (1 + n + n) * (1 + log n + log n)) = (2 + (1 + 2n) * (1 + 2*log n)) =
      // = 2 + 1 + 2* log n + 2n + (2n * 2*log n) = 2*log n + 2n + 2n*2log(n) => 2n*2log(n)
      // => O (n * log n)

    static void doubleFor(int n) {
        for (int i = 0; i < n/3; i++) {  // (1 + (n/3) + (n/3) )
            for (int j = 0; j <= n; j = j + 4) { //(1 + ~(n) +~(n)) n/4
                System.out.println("Hello ["+i+"] ["+j+"]"); //+1*n
            }
        } //  (1 + 2/3n) * (1 + ~2n) = (4/3n^2) => O(n^2)
    }
}
