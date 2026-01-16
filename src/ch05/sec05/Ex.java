package ch05.sec05;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. 정답 숫자 생성하고 숫자 중복 안되게 나오게 하기
        int[] answer = new int[3];
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

            System.out.print("숫자 3개 입력 (공백으로 구분): ");
            int[] input = new int[3];

            for (int i = 0; i < input.length; i++) {
                input[i] = sc.nextInt();
            }

            int strike = 0;
            int ball = 0;

            // 3. 스트라이크 / 볼 판
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (answer[i] == input[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

//            // 결과 + 정답 같이 출력
//            System.out.print(strike + "S " + ball + "B | 정답: ");
//            for (int i = 0; i < answer.length; i++) {
//                System.out.print(answer[i] + " ");
//            }
//            System.out.println();

            System.out.println(strike + "S " + ball + "B");

            // 4. 정답 처리
            if (strike == 3) {
                System.out.println("정답입니다!");
                break;

            }
        }
    }
}
