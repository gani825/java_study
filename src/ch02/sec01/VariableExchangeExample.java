package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        // x 와 y 의 값을 서로 바꾸기 리터럴 사용 금지
        int s;

        s = x; // 3
        x = y; // 5
        y = s; // 3

        System.out.println("x : " + x + ", y : " + y);
        System.out.printf("x: %d, y: %d\n", x, y); // %d에 값을 넣겠다. 정수만 가능 %f : 실수 %s : 문자열(형변환함) %b : 불린 %c : 문자
    }
};
