package ch06.sec08;

public class PracticeMethod {

    public void abs(int num) {
        System.out.println(num < 0 ? -num : num);
    }

    public int random(int rd) {
        return (int) (Math.random() * rd);
    }

    public int random(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public String getGrade(int score) {

        return score >= 90 ? "A" : score >= 80 ? "B" : "C";
    }

    //    public String getGrade(int score) {
//        if (score >= 90) {
//            return "A";
//        } else if (score >= 80) {
//            return "B";
//        } else {
//            return "C";
//        }
//    }

    public void printStar(int str) {
        for (int i = 0; i < str; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //    public void printStarTriangle(int star) {
//        for (int i = 0; i < star; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    public void printStarTriangle(int star) {
        for (int j = 0; j <= star; j++) {
            printStar(j);
        }
    }

    public void printStarRectangle(int star) {
        for (int i = 0; i < star; i++) {
            printStar(star);
        }
    }

    public void gugudan(int num) {
        for (int i = 1; i <= 9; i++) {
//   System.out.println(num + " X " + i + " = " + (num * i));
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
    }

//    public void gugudan(int num1, int num2) {
//        for (int i = num1; i <= num2; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.printf("%d X %d = %d\n", i, j, i * j);
//            }
//            System.out.println();
//        }

    public void gugudan(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            gugudan(i);
            System.out.println();
        }
    }

    public int sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}

