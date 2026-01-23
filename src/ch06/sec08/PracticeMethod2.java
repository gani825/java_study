package ch06.sec08;

import java.util.UUID;

public class PracticeMethod2 {


    public String getRandomFileName() {
        return UUID.randomUUID().toString();
    }

    public String getExt(String FileName) {
        return FileName.substring(FileName.lastIndexOf("."));
    }

    public String getRandomFileName(String FileName) {
        return getRandomFileName() + getExt(FileName);
    }

    // for문
    public int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // for-each문
//    public int sumArr(int[] arr) {
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        return sum;
//    }

    public int[] deepCopy(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // for-each문
//    public int getMax(int[] arr) {
//        int max = arr[0];
//        for (int val : arr) {
//            if (val > max) {
//                max = val;
//            }
//        }
//        return max;
//    }

    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // for-each문
//    public int getMin(int[] arr) {
//        int min = arr[0];
//        for (int val : arr) {
//            if (val < min) {
//                min = val;
//            }
//        }
//        return min;
//    }
}