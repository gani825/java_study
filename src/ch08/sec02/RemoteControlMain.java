package ch08.sec02;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl rc = new TvRemoteControl();
        rc.turnOn();
//        rc.turnOff();

        //turnOff 호출해주세요. 강제 형변환으로.
        TvRemoteControl tv = (TvRemoteControl) rc;
        tv.turnOff();

        for (int i = 0; i < 20; i++) {
            rc.volumeUp();
        }

        for (int i = 0; i < 20; i++) {
            rc.volumeDown();
        }

    }
}