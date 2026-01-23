package starcraft;

// 시즈 탱크(공성 천자)
public class Tank extends Unit {
    private boolean isSidheMode;

    public void ChangeMode() {
        isSidheMode = !isSidheMode;
        System.out.printf("시즈 모드 %s\n", isSidheMode ? "ON" : "OFF");
//        if (isSidheMode) {
//            System.out.println("시즈 모드 ON");
//        } else {
//            System.out.println("시즈 모드 OFF");
//        }
    }

    @Override
    public String toString() {
//        return "시즈탱크 " + super.toString();
        return "시즈탱크 @" + super.hashCode();
    }
}
