package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;

        System.out.println("num = " + num);
        switch (num % 2) {
            // 짝수, 홀수
            case 1:
                System.out.println("홀수입니다.");
                break;
            case 0:
                System.out.println("짝수입니다.");
                break;
        }
    }
}
