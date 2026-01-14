package ch05.sec05;

public class MultiArray {
    public static void main(String[] args) {
        /*
        다차원 배열(2차원 배열)
        배열 안에 배열이 있는 것

        */
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {100, 110, 120}
        };

        System.out.println("arr.length = " + arr.length);
        System.out.println("arr.length[0] = " + arr[0].length);
        System.out.println("arr.length[0][0] = " + arr[0][0]);
        System.out.println("arr.length[2][1] = " + arr[2][1]);

        System.out.println("=================");

        // for문
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[i][j]" + arr[i][j]);
            }
        }

        // for-each문
        for (int[] val : arr) {
            for (int j : val) {
                System.out.println("j = " + j);
            }
        }

        // for문
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // for-each문
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
