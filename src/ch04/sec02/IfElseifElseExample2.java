package ch04.sec02;

public class IfElseifElseExample2 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 81.0) + 20;
        System.out.println("score = " + score);
        /*
        90점 ~ 100점 이상 "A등급" 출력
        80점 ~ 89점 "B등급"
        70점 ~ 79점 "C등급" 출력
        나머지 "D등급" 출력
        */

      String result = "A";
      if (score < 70) {
          result = "D";
      } else if (score < 80) {
          result = "C";
      } else if (score < 90) {
          result = "B";
      }
        System.out.printf("%s등급\n", result);
    }
}
