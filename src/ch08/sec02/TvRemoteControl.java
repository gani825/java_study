package ch08.sec02;

public class TvRemoteControl implements RemoteControl {

    private int volume = MIN_VOLUME;
    private int memoryVolume;
//    private int mute;
    private boolean mute;

    //MAX_VOUMNE 초과는 되지 않도록 해주세요.
    @Override
    public void turnOn() {
        System.out.println("Tv를 켠다");
    }

    @Override
    public void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
        displayVolume();
    }

    @Override
    public void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
        displayVolume();
    }

    @Override
    public void mute() {
        mute = !mute;
        if(mute) {
            memoryVolume = volume;
            volume = 0;
            System.out.print("(음소거) ");
        } else {
            volume = memoryVolume;
        }
//        if (volume == MIN_VOLUME) {
//            volume = mute;
//        } else {
//            mute = volume;
//            volume = MIN_VOLUME;
//        }
        displayVolume();
    }

    public void displayVolume() {
        System.out.printf("volume : %d\n", volume);
    }


    public void turnOff() {
        System.out.println("Tv를 끈다");
    }
}
