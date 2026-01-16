package ch06.sec08;

public class PracticeMethod {

    public void abs(int num) {
        System.out.println(num < 0 ? -num : num);
    }

    public int random(int rd) {
        return (int)(Math.random() * rd);
    }

    public int random(int min, int max) {
        return (int)(Math.random() * (max - min)) + min;
    }
}
