/*
class {} 안에 코드 작성을 한다.
컴파일 언어에서는 main 메서드가 굉장히 특별한 메서드 >>> 프로그램 시작점
main 메서드가 호출되면서 프로그램이 시작하게 된다.
자바에서는 main 메서드 모양이 항상 같아야한다.
유일하게 달라도 되는 부분은 "args" 매개변수명만 바꿀 수 있다. 나머지는 그대로 작성해야한다.
*/

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}