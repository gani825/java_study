package ch06.sec11;

public class SingleToneMain {
    public static void main(String[] args) {
        SingleTone st = SingleTone.getInstance(); // 객체화가 안되게 막아라.
//        System.out.println(SingleTone.getInstance());
//        System.out.println(st);
    }
}
