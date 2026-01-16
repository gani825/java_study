package ch05.sec05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 0. 자리 수 입력
        System.out.print("숫자 몇 개 입력할 건가요? : ");
        int size = sc.nextInt();

        // 1. 정답 숫자 생성 (중복 없이)
        int[] answer = new int[size];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (Math.random() * 9) + 1;

            for (int j = 0; j < i; j++) {
                if (answer[i] == answer[j]) {
                    i--;
                    break;
                }
            }
        }

        // 2. 게임 시작
        while (true) {

            int[] input = new int[size];

            // 사용자 입력 (순서대로)
            for (int i = 0; i < input.length; i++) {
                System.out.print((i + 1) + "번째 숫자 입력: ");
                input[i] = sc.nextInt();
            }

            int strike = 0;
            int ball = 0;
            int out = 0;

            // 3. 스트라이크 / 볼 판정 Arrays.binarySearch 쓰지 않기
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < input.length; j++) {
                    if (answer[i] == input[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            System.out.println(strike + "S " + ball + "B");

            // 4. 정답 처리
            if (strike == answer.length) {
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}
