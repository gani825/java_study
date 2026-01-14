package ch04.sec02;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = 0;

        root:
        while (true) {
            System.out.println("----------------");
            System.out.println("1. 증속 | 2. 감속 | 3.중지");
            System.out.println("----------------");
            System.out.println("선택: ");
            String choice = sc.nextLine();
            // "3"문자열이 들어오면 반복문 종료
            switch (choice) {
                case "3":
                    break root;
                // "2" 문자열이 들어오면 speed감소
                case "2":
                    speed--;
                    break;
                // "1" 문자열이 들어오면 speed증가
                case "1":
                    speed++;
                    break;
                // 다른 값이 들어왔을 때
                default:
                    System.out.println("다시 입력해주세요.");
                    break;
            }
            System.out.println("speed: " + speed);
        }
        System.out.println("--끝--");
    }
}
