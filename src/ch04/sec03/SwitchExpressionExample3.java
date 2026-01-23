package ch04.sec03;

public class SwitchExpressionExample3 {
    public static void main(String[] args) {
        String grade = "NORMAL"; // VIP, GOLD, NORMAL
        /*
        등급 별 할인 가격이 나오게 해주세요.
        VIP는 가격에 10% 할인 가격, >> 9000
        GOLD는 가격에 5% 할인 가격, >> 9500
        NORMAL은 원래가격. >> 10000
        출력 예 : VIP님은 10% 할인되셔서 9000원이 나왔습니다.
        */
        int price = 10_000; // 제품 가격
        int buyPrice = switch (grade) {
            case "VIP" -> (int) (price * 0.1);
            case "GOLD" -> (int) (price * 0.05);
            default -> price;
        };
    }
}
