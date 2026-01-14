package ch04.sec02;

public class IfElseifElseExample {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 81.0) + 20;
        System.out.println("score = " + score);
        /*
        90점 ~ 100점 이상 "A등급" 출력
        80점 ~ 89점 "B등급"
        70점 ~ 79점 "C등급" 출력
        나머지 "D등급" 출력
        */
//        if (score >= 90) {
//            System.out.println("A등급");
//        } else if (score >= 80) {
//            System.out.println("B등급");
//        } else if (score >= 70) {
//            System.out.println("C등급");
//        } else {
//            System.out.println("D등급");
//        }

        String result = "D";
        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        }
        System.out.printf("%s등급\n", result);
    }
}
