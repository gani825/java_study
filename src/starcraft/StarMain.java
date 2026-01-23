package starcraft;

public class StarMain {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        t1.ChangeMode(); // 시즈모드 ON

        t1.ChangeMode(); // 시즈 모드 off

        t1.ChangeMode(); // 시즈 모드 ON
    }
}
