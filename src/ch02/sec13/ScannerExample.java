package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // 콘솔에서 사용자 입력을 받을 수 있게 도와주는 객체
        Scanner sc = new Scanner(System.in);

        System.out.print("x 값 입력 : ");
        String strX = sc.nextLine();

        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력 : ");
        int y = sc.nextInt();

        int result = x + y;
        System.out.printf("%d + %d = %d\n", x, y, result);

        while (true) {
            System.out.print("문자열 입력 : ");
            String data = sc.next();
            if (data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열 : " + data);
            System.out.println();
        }
        System.out.println("-- 끝 -- ");
    }
}
