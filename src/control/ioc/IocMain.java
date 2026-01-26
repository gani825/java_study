package control.ioc;

import control.Tv;

public class IocMain {
    public static void main(String[] args) {
        String wooferName = args[0];
        String screenName = args[1];

        Tv tv = TvFactory.generateTv(wooferName, screenName);
        tv.sound();
    }
}
