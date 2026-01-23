package ch04.sec03;

public class SwitchExpressionExample2 {
    public static void main(String[] args) {
        String grade = "GOLD"; // VIP, GOLD, NORMAL
        /*
        등급 별 할인 가격이 나오게 해주세요.
        VIP는 가격에 10% 할인 가격, >> 1000
        GOLD는 가격에 5% 할인 가격, >> 500
        NORMAL은 원래가격. >> 0
        */
        int price = 10000;

        int buyPrice = switch (grade) {
            case "VIP" -> {
                int discount = (int)(price * 0.1);
                yield price - discount;
            }
            case "GOLD" -> {
                int discount = (int)(price * 0.05);
                yield price - discount;
            }
            default -> price;
        };

        int discountRate = switch (grade) {
            case "VIP" -> 10;
            case "GOLD" -> 5;
            default -> 0;
        };

        System.out.printf("%s님은 %d%% 할인되셔서 %d원이 나왔습니다.%n", grade, discountRate, buyPrice);

    }
}
