package control.legacy;

import control.Tv;

public class LegacyMain {
    public static void main(String[] args) {
        // 삼성 tv 객체화
//        Harman Speaker: 소리가 맑아요.
//        Marten woofer: 웅~~ 웅~~ 웅~~

        // Speaker를 JBLSpeaker로 교체해주세요.
        Tv tv = new SamsungTv();
        tv.sound();
    }
}
