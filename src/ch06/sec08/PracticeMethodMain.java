package ch06.sec08;

public class PracticeMethodMain {
    public static void main(String[] args) {
        // PracticeMethod 객체화 해주세요.
        PracticeMethod pm = new PracticeMethod();
        pm.abs(10);
        pm.abs(-10);
        pm.abs(-8);

        int r1 = pm.random(10); // 0 ~ 9 랜덤값 리턴
        int r2 = pm.random(20); // 0 ~ 19 랜덤값 리턴

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        int r3 = pm.random(2, 10); // 2 ~ 9 랜덤값 리턴
        int r4 = pm.random(10, 15); // 10 ~ 14 랜덤값 리턴

        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        /*
        90점 초과는 콘솔에 'A', 80점 초과는 "B" 나머지는 "C"리턴
        */
        String grade = pm.getGrade(98);
        System.out.println("grade = " + grade);
        System.out.println(pm);

        int score = pm.random(30, 101);
        System.out.println("score = " + score);
        System.out.println(pm.getGrade(score));

        pm.printStar(5); // ****
        pm.printStar(3); // ***
        System.out.println("-------");

        // *
        // **
        // ***
        // ****
        pm.printStarTriangle(5);

        System.out.println("-------");
        pm.printStarRectangle(4);
        // ****
        // ****
        // ****
        // ****

        System.out.println("-------");
        pm.gugudan(5);
        // 5 X 1 = 5
        // 5 X 2 = 10
        // ...
        // 5 X 9 = 45

        System.out.println("-------");
        // 2 * 1 ~ 2 * 9
        // 3 * 1 ~ 3 * 9
        // ...
        // 8 * 1 ~ 8 * 9
        pm.gugudan(2, 4); // 2 ~ 4단 구구단 출력

        int sum = pm.sum(10, 50); // 10 ~ 50까지 순차적으로 더한 값을 리턴
        System.out.println("sum = " + sum);

    }
}