package ch05.sec05;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 5;   // ← 자리 수 (여기만 바꾸면 됨)

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

            System.out.print("숫자 " + size + "개 입력 (공백으로 구분): ");
            int[] input = new int[size];

            for (int i = 0; i < input.length; i++) {
                input[i] = sc.nextInt();
            }

            int strike = 0;
            int ball = 0;

            // 3. 스트라이크 / 볼 판정
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
