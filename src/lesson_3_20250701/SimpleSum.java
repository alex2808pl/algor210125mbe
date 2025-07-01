package lesson_3_20250701;

public class SimpleSum {
    public static void main(String[] args) {
        System.out.println("sum iterat "+sumIterat(5));
        System.out.println("sum recurs "+sumRecurs(5));
        System.out.println("sum recurs cosv 1 (2 уровня) "+sumRecursCosv(5));
        System.out.println("sum recurs cosv 2 (3 уровня) "+sumRecursCosv1(5));
    }

    static int sumIterat(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        return sum;
    }

    static int sumRecurs(int n) {
        System.out.println("sumRecurs("+n+")");
        if(n<=1) return 1; //базовое условие
        int res = n + sumRecurs(n-1);
        System.out.println("Rec: res="+res+", n="+n);
       return res;
    }

    static int sumRecurs1(int n) {
        if(n<=1) return 1; //базовое условие
        return n+sumRecurs1(n-1);
    }

    // ---- Косвенная рекурсия 1
    static int sumRecursCosv(int n) {
        System.out.println("sumRecursCosv("+n+")");
        if(n==1) return 1; //базовое условие
        int res = n + method(n-1);
        System.out.println("Rec: res="+res+", n="+n);
        return res;
    }
    static int method(int m) {
        System.out.println("method("+m+")");
        return sumRecursCosv(m);
    }
    // sumRecursCosv -> method -> sumRecursCosv

    // ---- Косвенная рекурсия 2
    static int sumRecursCosv1(int n) {
        System.out.println("sumRecursCosv("+n+")");
        if(n==1) return 1; //базовое условие
        int res =method1(n);
        System.out.println("Rec: res="+res+", n="+n);
        return res;
    }
    static int method1(int m) {
        System.out.println("method("+m+")");
        return m + method2(m-1);
    }
    static int method2(int m) {
        System.out.println("method("+m+")");
        return sumRecursCosv1(m);
    }
    // sumRecursCosv1 -> method1 -> method2 -> sumRecursCosv1
}

// sumRecurs(5)
//    sumRecurs(4)
//      sumRecurs(3)
//          sumRecurs(2)
//              sumRecurs(1)
//              1
//          2+1=3
//      3+3=6
//    4+6=10
// 5+10=15