package ch03.sec01;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        double y2 = 0; // 0.0

//        System.out.println(x / y); // 에러
//        System.out.println(x / y2); // Infinity
//        System.out.println(x % y); // 에러
//        System.out.println(x % y2); // NaN

        double result = x / y2;
        if (Double.isInfinite(result) || Double.isNaN(result)) {
            System.out.println("연산 불가");
        } else {
            System.out.println("result = " + result);
        }

        double result2 = x % y2;
        if (Double.isNaN(result)) {
            System.out.println("연산 불가");
        } else {
            System.out.println("result2 = " + result2);
        }
    }
}
