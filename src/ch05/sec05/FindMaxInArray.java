package ch05.sec05;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = {10, 8, 88, 1, 100, 14, 150};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);

        int max1 = arr[0];

        for (int val : arr) {
            if (val > max1) {
                max1 = val;
            }
        }
        System.out.println("max1 = " + max1);
    }
}
