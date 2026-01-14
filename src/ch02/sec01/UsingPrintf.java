package ch02.sec01;

public class UsingPrintf {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 22;
        double height = 176.5;
        char bloodType = 'A';
        boolean isMan = true;

        // printf는 JS의 `${변수명}` 이러한 기능을 쓰는 것.
        // 즉 문자열 사이에 변수의 값을 삽입하는 방법
        // 예 : System.out.printf("x: %d, y: %d\n", x, y);
        // %d에 값을 넣겠다. 정수만 가능 %f : 실수(실수 뒤에 숫자 제한을 하고 싶으면 .1 .2 이렇게 붙인다) %s : 문자열(형변환함) %b : 불린 %c : 문자

        System.out.println(name + "의 나이는 " + age +"세이며, 키는 " + height + "cm이고 혈액형은 " + bloodType + " 이고 성별은 남자인가? " + isMan);
        System.out.printf("%s의 나이는 %d세이며, 키는 %.1fcm이고 혈액형은 %c이고 성별은 남자인가? %b\n", name, age, height, bloodType, isMan);
        System.out.printf("가격 : %d\n", 1_000_000);
        System.out.printf("가격 : %,d\n", 1000000);

        String result = String.format("가격: %,d\n", 1000000);
        System.out.println(result);

        int mon = 5;
        int day = 13;

        // 월, 일을 합쳐서 항상 4자리로 만들고 싶을 때, 00-00
        System.out.printf("%d-%d", mon, day);
        System.out.printf("%02d-%02d", mon, day);
    }
}
