package ch05.sec05;

import java.util.Arrays;

public class ArrayValueAdd2 {
    public static void main(String[] args) {
        // 배열의 크기는 한번 정해지면 수정할 수 없다.
        int[] arr = {2, 4, 8, 10, 12, 13};
        int value = 22;
        int idx = 2;

        int[] arr2 = new int[arr.length + 1];

        arr2[idx] = value;

        for (int i = idx; i < arr.length; i++) {
            arr2[i + 1] = arr[i];
        }
        for (int i = idx; i < arr.length; i++) {
            arr2[i + 1] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            if (i < idx) {
                arr2[i] = arr[i];
            } else if (i == idx) {
                arr2[i] = value;
            } else {
                arr2[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
