package ch05.sec05;

import java.util.Arrays;

public class ArrayValueRemove {
    public static void main(String[] args) {
        // 배열의 크기는 한번 정해지면 수정할 수 없다.
        int[] arr = {2, 4, 8, 10, 13, 15};

        // 배열에 22를 추가하고 싶어요.
        int[] arr2 = new int[arr.length -1];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));
    }
}
