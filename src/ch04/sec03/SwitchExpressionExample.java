package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        // 스위치 표현식 값을 리턴해야할 때 좋다.
        // 스위치 표현식은 default 필수
        int num = (int) (Math.random() * 13.0) + 1; // 1 ~ 13값
        System.out.println("num = " + num);
        String denomination = switch (num) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> {
                // 만약 연산하는 상황이오면 이렇게 하면 된다. return 대신 yield를 써야함.
                int a = 10;
                int b = 20;
                yield "Q";
            }
            case 13 -> "K";
            default -> String.valueOf(num); // 정수 -> 문자열
        };
        System.out.println(denomination);
    }
}
